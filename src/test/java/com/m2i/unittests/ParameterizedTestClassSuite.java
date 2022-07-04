/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m2i.unittests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Regency
 */
public class ParameterizedTestClassSuite {
    
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    public void testParameterized(int valeur) {
        System.out.println("Test avec valeur: " + valeur);
        Assertions.assertEquals(valeur + valeur, valeur * 2);
    }
    
    @ParameterizedTest
    @CsvSource({"1, 1", "1, 2", " 2, 3"})
    public void testCsvSource(int a, int b) {
        int resultatAttendu = a + b;
        
        Assertions.assertEquals(resultatAttendu, a + b);
    }
    
}
