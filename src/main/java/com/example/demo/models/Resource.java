package com.example.demo.models;

import com.example.demo.Controllers.Admin.ResourceController;
import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Size;

public class Resource {

    private long id;

    @Size(min=2, max=30)
    private String name;

    private String ownerGroup;
    private boolean trainingRequired;
   // private ResourcePrice resourcePrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerGroup() {
        return ownerGroup;
    }

    public void setOwnerGroup(String ownerGroup) {
        this.ownerGroup = ownerGroup;
    }

    public boolean isTrainingRequired() {
        return trainingRequired;
    }

    public void setTrainingRequired(boolean trainingRequired) {
        this.trainingRequired = trainingRequired;
    }
}
