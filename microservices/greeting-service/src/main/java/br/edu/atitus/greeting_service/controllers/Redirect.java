package br.edu.atitus.greeting_service.controllers;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Redirect {

    @GetMapping("/")
    public void redirectToSpecificPath(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Location", "/greeting");
        httpServletResponse.setStatus(301);
    }
}
