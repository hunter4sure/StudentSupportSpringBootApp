package com.spring.model;


import javax.persistence.*;
import java.util.logging.Level;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "student_Sequence")
    @SequenceGenerator(name = "student_Sequence", sequenceName = "STUDENT_SEQ")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "student-num")
    private String stringnum;

    @Column(name = "level_of_study")
    private Level level;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;


    public Student() {
    }
}
