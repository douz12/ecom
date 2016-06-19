package com.ecom.controller.pages;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleRessourceNotFoundException(HttpServletRequest req, Exception exception) {
        ModelAndView modelAndView = new ModelAndView("error");
        return modelAndView;
    }
}
