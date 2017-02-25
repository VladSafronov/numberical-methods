package com.vladsafronov.numbericmethods;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by vlad on 25.2.17.
 */
public class PolynomTest {

    static List<Double> getListFromArr(double[] arr){
        List<Double> coefficients = new ArrayList<Double>();
        for (int i = 0; i < arr.length; i++) {
            coefficients.add(arr[i]);
        }
        return coefficients;
    }

    @Test
    public void toStringTest() throws Exception {
        double[] first ={1.0,2.0,3.0,4.0};

        Polynom polynom = new Polynom(getListFromArr(first));
        Assert.assertEquals("4.0*x^3 + 3.0*x^2 + 2.0*x + 1.0",polynom.toString());

        double[] second = {1.0,-2.0,3.0,4.0};
        polynom.setCoefficients(getListFromArr(second));
        Assert.assertEquals("4.0*x^3 + 3.0*x^2 - 2.0*x + 1.0",polynom.toString());

        double[] third = {-1.0,2.0,3.0,4.0};
        polynom.setCoefficients(getListFromArr(third));
        Assert.assertEquals("4.0*x^3 + 3.0*x^2 + 2.0*x - 1.0",polynom.toString());

        double[] four = {1.0,2.0,3.0,-4.0};
        polynom.setCoefficients(getListFromArr(four));
        Assert.assertEquals("-4.0*x^3 + 3.0*x^2 + 2.0*x + 1.0",polynom.toString());

        //FIXME what to do with ZERO?
    }

}