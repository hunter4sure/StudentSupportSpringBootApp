package com.spring.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Course")
public class Course implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "course_Sequence")
    @SequenceGenerator(name = "course_Sequence", sequenceName = "COURSE_SEQ")
    private int id;

    @Column(name = "courseName")
    @Size(max = 45)
    private String name;

    private List<CourseModule> modules;

    @Column(name = "Period")
    private int period;

    public Course(){}


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

    public List<CourseModule> getModules() {
        return modules;
    }

    public void setModules(List<CourseModule> modules) {
        this.modules = modules;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
