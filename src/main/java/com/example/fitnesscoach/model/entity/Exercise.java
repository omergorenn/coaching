package com.example.fitnesscoach.model.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Exercise {

    private String bodyPart;

    private String equipment;

    private String gifUrl;

    private String id;

    private String name;

    private String target;

}

