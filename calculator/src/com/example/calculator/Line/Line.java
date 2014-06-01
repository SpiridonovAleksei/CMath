package com.example.calculator.Line;

import java.util.List;

/**
 * Created by JDC on 01.06.14.
 */
public class Line {
    private List<int> eq;

    public Line(List<int> coefficients) {
        eq = coefficients;
    }

    public String getEquation() {
        int r = eq.get(2)*(-eq.get(0)) + eq.get(3)*(-eq.get(1));
        return r < 0 ? eq.get(2) + "x" + eq.get(3) + "y" + "-" + r + "=0" : eq.get(2) + "x" + eq.get(3) + "y" + "+" + r + "=0";
    }
}
