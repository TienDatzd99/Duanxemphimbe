package com.example.forum_web_ver_2.controller.user_login_logout_registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.forum_web_ver_2.dto.UserDto;
import com.example.forum_web_ver_2.service.UserService;

@Controller
@SessionAttributes("userdto")
public class UserRegistrationController {

    private final UserService userService;

    @Autowired
    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("userdto")
    public UserDto userRegistrationDto() {
        return new UserDto();
    }

    @GetMapping("/registration")
    public String showRegistrationForm() {
        return "/registration";
    }

    @PostMapping("/registration")
    public String registerUserAccount(@ModelAttribute("userdto") UserDto userDto) {
        if (userService.checkUserbyEmail(userDto.getEmail())) {
            return "redirect:/registration?emailexist";
        }
        if (!userDto.getPassword().equals(userDto.getCheckPass())) {
            return "redirect:/registration?checkpass";
        }
        userService.save(userDto);
        return "redirect:/registration?success";
    }
}
