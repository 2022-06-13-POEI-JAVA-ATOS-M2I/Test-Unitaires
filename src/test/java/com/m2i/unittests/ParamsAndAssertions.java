package com.m2i.unittests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;


public class ParamsAndAssertions {
    
    @Test
    public void isPalindromeKayak() {
        boolean result = Palindrome.isPalindrome("kayak");
        
        Assertions.assertTrue(result);
    }
    
    @Test
    public void isPalindromeBonjour() {
        boolean result = Palindrome.isPalindrome("bonjour");
        
        Assertions.assertFalse(result);
    } 
        
    @Test
    public void isPalindromeChaineVide() {
        boolean result = Palindrome.isPalindrome("");
        
        Assertions.assertTrue(result);
    }
    
        
    @Test
    public void isPalindromeKAYak() {
        boolean result = Palindrome.isPalindrome("KAYak");
        
        Assertions.assertTrue(result);
    }
    
    @Test
    public void isPalindromeAvecEspaces() {
        boolean result = Palindrome.isPalindrome("Engage le jeu que je le gagne");
        
        Assertions.assertTrue(result);
    }
        
    @Test
    public void isPalindromeAvecDesAccents() {
        boolean result = Palindrome.isPalindrome("La mariée ira mal");
        
        Assertions.assertTrue(result);
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = { "kayak", "xanax", "selles" })
    public void isAllPalindromes(String str) {
        boolean result = Palindrome.isPalindrome(str);
        
        Assertions.assertTrue(result);
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = { "ecole", "voiture", "arbre" })
    public void isAllNotPalindromes(String str) {
        boolean result = Palindrome.isPalindrome(str);
        
        Assertions.assertFalse(result);
    }
    
    @ParameterizedTest
    @CsvSource({
        "kayak, true",
        "rever, true",
        "arbre, false"
    })
    public void checkCsvSourcePalindrome(String str, boolean expectedResult) {
        boolean result = Palindrome.isPalindrome(str);
        
        //Assertions.assertTrue(result == expectedResult);
        Assertions.assertEquals(result, expectedResult);
    }
    
    @RepeatedTest(5)
    public void repeatThisTest() {
        boolean result = Palindrome.isPalindrome("xanax");
        
        Assertions.assertTrue(result);
    }
          
    
}
