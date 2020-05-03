package com.company;
import com.company.NucelosDeacay;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;


public class Main {

    public static void main(String[] args) {

        NucelosDeacay prueba1 = new NucelosDeacay(0.02775,100 , 0.001);
        prueba1.decay();
    }
}
