package com.seamfix.quadraticequation.controller;

import com.seamfix.quadraticequation.service.QuadraticEquation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuadraticController {

    @Autowired
    private QuadraticEquation quadraticEquation;


    @GetMapping("/{a}/{b}/{c}")
    public String solve(@PathVariable("a") double a, @PathVariable("b") double b, @PathVariable("c") double c) {
        return quadraticEquation.quadraticEquationImpl(a,b,c);
    }
}
