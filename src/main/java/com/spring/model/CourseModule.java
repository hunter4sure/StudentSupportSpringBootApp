package com.spring.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CourseModule  implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "module_Sequence")
    @SequenceGenerator(name = "module_Sequence", sequenceName = "MODULE_SEQ")
    private int id;

    @Column(name ="moduleName")
    private String moduleName;

    @Column(name = "moduleCode")
    private String moduleCode;
}
