package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;


@Controller
public class LoginController {
    

 
    @GetMapping("/")
    public String showformLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        RedirectAttributes redirectAttributes,
                        HttpSession session) {
    	
    	System.out.println("EMAIL "+ email);
    	System.out.println("password "+ password);
    	
        if (email.equals("admin@gmail.com") && password.equals("admin123")) {
        		System.out.println("ingresoooo "+ password);
                return "redirect:/pasajeros/list";
                
        }

        redirectAttributes.addFlashAttribute("error", "Credenciales incorrectas. Por favor, verifica tu correo electrónico y contraseña.");

        return "redirect:/";
    }

}