package com.spring.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Course {

    private int id;

    private String name;

    private List<CourseModule> modules;

    public Course(){}
}
