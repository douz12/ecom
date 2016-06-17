package ecom.com.controller.services;

import ecom.com.model.Offer;
import ecom.com.repository.CategoryRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryServiceController {

    @RequestMapping(value = "/overview/{categoryId}/{categoryName}", method = RequestMethod.GET)
    public List<Offer> getOffers(@PathVariable String categoryId, @PathVariable String categoryName) {
        return CategoryRepository.getOfferByIdAndName(categoryId, categoryName);
    }
}
