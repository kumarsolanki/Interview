package com.solanki.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionProgation {

    ExceptionProgation() throws IOException {

        //throw new IOException("hello");
    }

    int m4() throws ArithmeticException{
    return 50/0;
    }
    void m1() throws Exception {

    }
    void m2() throws IOException{
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void m3() {
        throw  new RuntimeException("RunTime Exception has occured..");
    }
    public static void main(String[] args) {
        ExceptionProgation exceptionProgation = null;
        try {
            exceptionProgation    = new ExceptionProgation();
        }
        catch (Exception e){
        System.out.println("Exception occured");
        }
        try{
        exceptionProgation.m3();}
        catch(Exception e){
            System.out.println("Exception occured for m3");
        }
        exceptionProgation.m4();
    }
}
