package ecom.com.controller.pages;

import ecom.com.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping("/")
    public static String home(Model model) {
        model.addAttribute("allCategories", CategoryRepository.getAllCategories());
        return "home";
    }
}
