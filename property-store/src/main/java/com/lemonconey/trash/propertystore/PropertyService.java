package com.lemonconey.trash.propertystore;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PropertyService {
    private Map<String, Object> propertyStore = new HashMap<String, Object>() {{
        put("status", "ready");
    }};

    public void create(Map<String, Object> properties) {
        propertyStore.putAll(properties);
    }

    public Map<String, Object> getAll() {
        return propertyStore;
    }

    public void update(Map<String, Object> properties) {
        propertyStore = new HashMap<>(properties);
    }
}
