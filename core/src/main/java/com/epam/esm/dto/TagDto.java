package com.epam.esm.dto;

import org.springframework.hateoas.RepresentationModel;

public class TagDto extends RepresentationModel<TagDto> {

    private long id;
    private String name;

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
}
