package com.mummyhead.revid.controllers;


import com.mummyhead.revid.models.User;
import com.mummyhead.revid.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Chris Stier <john.c.stier@gmail.com>
 */
@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private UserRepository userRepo;

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request){
        logger.info("Index controller called.");
        model.addAttribute("requestUri", request.getRequestURI());
        model.addAttribute("header", request.getServletPath());
        User user = userRepo.getUserByUsername("chris");
        model.addAttribute("user", user);
        logger.info("Got user: {}", user.getUsername());
        return "index";
    }

}
