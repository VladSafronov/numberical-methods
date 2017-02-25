package com.vladsafronov.numbericmethods;

import java.util.List;

/**
 * Created by vlad on 25.2.17.
 */
public class Polynom {
    List<Double> coefficients;

    public Polynom(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    public List<Double> getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        int highest = coefficients.size()-1;
        stringBuilder.append(coefficients.get(highest)+"*x^"+highest);

        for (int i = coefficients.size()-2; i > 1; i--) {
            Double number = coefficients.get(i);
            stringBuilder.append(getSign(number)+Math.abs(number)+"*x^"+i);
        }

        Double number = coefficients.get(1);
        stringBuilder.append(getSign(number)+Math.abs(number)+"*x");

        number = coefficients.get(0);
        stringBuilder.append(getSign(number)+Math.abs(number));

        return stringBuilder.toString();
    }

    private String getSign(Double number){
        if(number>=0) return " + ";
        else return " - ";
    }
}
