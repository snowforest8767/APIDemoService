package com.cheyipai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lizonglin on 2015/7/7.
 */
@Controller
@RequestMapping(value = "/help")
public class HelpController {
    @RequestMapping(value = "/jsonpath")
    public ModelAndView getJsonpath() {
        return new ModelAndView("jsonpath");
    }
}
