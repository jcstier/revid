package com.mummyhead.revid.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chris Stier <john.c.stier@gmail.com>
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(@RequestParam(value = "name", required = false, defaultValue = "blah") String name, Model model) {
        model.addAttribute("name", name + "blah blah");
        return "test";
    }

}
