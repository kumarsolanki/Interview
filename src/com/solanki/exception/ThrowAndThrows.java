package com.solanki.exception;

import java.io.FileNotFoundException;

public class ThrowAndThrows {

    int m1 () {
        throw new RuntimeException("Runtime Exception");
    }
    int m2() throws FileNotFoundException {
        throw new FileNotFoundException("File not found");
    }
     int m3() throws ArithmeticException{
        throw new ArithmeticException("arithmetic exception occured");
     }
    public static void main(String[] args) {
        ThrowAndThrows throwAndThrows = new ThrowAndThrows();
//        try {
//            throwAndThrows.m1();
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("m1 exception caught");
//        }
        try {
            throwAndThrows.m3();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("arithmetic exception caught");
        }
//        throwAndThrows.m2(); complie time error if unhandled with try block for unchecked exception
    }
}
