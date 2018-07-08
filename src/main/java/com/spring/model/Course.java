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

    public Course(){}
}
