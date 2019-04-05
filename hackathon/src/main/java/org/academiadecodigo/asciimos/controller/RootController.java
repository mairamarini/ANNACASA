package org.academiadecodigo.asciimos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping
@Controller
public class RootController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String get() {
        return "redirect:/house/";
    }

}
