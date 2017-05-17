package com.lemonconey.trash.propertystore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
        propertyService.create(properties);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void updateProperty(@RequestBody Map<String, Object> properties) {
        propertyService.update(properties);
    }

    @RequestMapping(method = RequestMethod.GET)
    Map<String, Object> getProperty() {
        return propertyService.getAll();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{propertyName}")
    Map<String, Object> deleteProperty(@PathVariable String propertyName) {
        return propertyService.getAll();
    }
}