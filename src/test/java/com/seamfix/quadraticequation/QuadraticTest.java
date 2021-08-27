package com.seamfix.quadraticequation;

import com.seamfix.quadraticequation.service.QuadraticEquation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class QuadraticTest {

    @Autowired
    QuadraticEquation quadraticEquation;

    @Test
    public void testQuadraticEquation() {
        double a = 1;
        double b = 5;
        double c = 2;
        String res = "The roots are ::-0.4384471871911697 and -4.561552812808831";
        String result = quadraticEquation.quadraticEquationImpl(a, b, c);

        assertEquals(res, result); // make the actual test
    }
}
