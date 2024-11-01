package com.example.forum_web_ver_2.controller.user_login_logout_registration;

import com.example.forum_web_ver_2.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.SessionScope;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
@SessionAttributes("userdto")
public class LogoutController {
    @ModelAttribute("userdto")
    public UserDto userDto(){
        return new UserDto();
    }
    @GetMapping("/logout")
    public String Logout(@ModelAttribute("userdto") UserDto userDto, WebRequest request, SessionStatus status){

        status.setComplete();
        request.removeAttribute("userdto",WebRequest.SCOPE_SESSION);
        return "redirect:/login";
    }
}
