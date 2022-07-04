package com.m2i.unittests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class UnitTests {
    
    @BeforeAll
    static void setupAll() {
        System.out.println("setupAll");
    }
    
    @BeforeEach
    void setup() {
        System.out.println("setup");
    }
    
    @AfterEach
    void teardown() {
        System.out.println("teardown");
    }
    
    @AfterAll
    static void teardownAll() {
        System.out.println("teardownAll");
    }
    
    @Test
    void unTest() {
        System.out.println("unTest");

    }
    
    @Test
    void unAutreTest() {
        System.out.println("unAutreTest");

    }
    
    
    @Test
    void verifierExceptionSiNomFichierEstException() {
        /*
        
                                Ci-dessous le type de l'exception attendue    
        Assertions.assertThrows(FileUploadException.class, () -> {
            // Les étapes pour arriver au lancement de l'exception
            // Comment obtenir le lancement de l'exception
            ExceptionLauncher launcher = new ExceptionLauncher();           
            launcher.UploadFile("exception.java");
        });
        */
       
        
        Assertions.assertThrows(FileUploadException.class, () -> {
            FileUploader fileUploader = new FileUploader();
            
            fileUploader.UploadFile("exception.java");            
        });
    }
   
}
