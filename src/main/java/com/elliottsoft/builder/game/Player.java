package com.elliottsoft.builder.game;

import com.elliottsoft.builder.model.Resource;

import java.util.Map;

public class Player {

    private int id;
    private String name;
    private Map<Resource, Integer> resources;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Resource, Integer> getResources() {
        return resources;
    }

    public void setResources(Map<Resource, Integer> resources) {
        this.resources = resources;
    }
}
