package com.ecom.controller.pages.front;

import com.ecom.dao.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("name", "Naris");
        return "home";
    }

}
