package com.lemonconey.trash.propertystore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @RequestMapping(method = RequestMethod.POST)
    void createProperty(@RequestBody Map<String, Object> properties) {
        propertyService.update(properties);
    }

    @RequestMapping(method = RequestMethod.GET)
    Map<String, Object> getProperty() {
        return propertyService.getAll();
    }
}