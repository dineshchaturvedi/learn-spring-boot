package com.dc.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController{
    @RequestMapping("/courses")
    public List<Course> retriveCourse(){
        return Arrays.asList(
            new Course(1,"AWS","In28Mins"),
            new Course(2,"DevOps","In28Mins"),
            new Course(3,"Azure","In28Mins")
        );
    }
}
