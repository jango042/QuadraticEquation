package com.seamfix.quadraticequation.service;

import org.springframework.stereotype.Service;

@Service
public class QuadraticEquation {


    public String quadraticEquationImpl(double a, double b, double c) {

        double d = b * b - 4.0 * a * c;
        String response = "";

        if (d> 0.0)
        {
            double root1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double root2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            response = "The roots are ::"+root1+" and "+root2;
        }
        else if (d == 0.0)
        {
            double root1 = -b / (2.0 * a);
            response = "The root is ::"+root1;
        }
        else
        {
            response = "Roots are not real.";
        }

        return response;
    }


}
