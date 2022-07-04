/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m2i.unittests;

/**
 *
 * @author Regency
 */
public class FileUploader {
    
     public void UploadFile(String fileName) throws FileUploadException {
        
        if (fileName.equals("exception.java")) {
            FileUploadException exception = new FileUploadException();
            
            throw exception;
        }
        
        System.out.println("OK");     
    }
}
