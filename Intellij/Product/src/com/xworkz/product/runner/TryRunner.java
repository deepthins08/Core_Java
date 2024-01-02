package com.xworkz.product.runner;

import com.xworkz.product.exception.blocks.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryRunner {

    public static void main(String[] args) throws IOException {
        System.out.println("Strting main in Tryrunner");
        TryAndCatch tryAndCatch=new TryAndCatch();
        tryAndCatch.read();
        System.out.println("------------------------------------------------------");

        TryWithMultipleCatch tryWithMultipleCatch=new TryWithMultipleCatch();
        tryWithMultipleCatch.display();
        System.out.println("------------------------------------------------------");

        TryWithMultiCatch tryWithMultiCatch=new TryWithMultiCatch();
        tryWithMultiCatch.show();
        System.out.println("------------------------------------------------------");

        TryWithResource tryWithResource=new TryWithResource();
        tryWithResource.display();

        System.out.println("------------------------------------------------------");
        TryWithFinally tryWithFinally=new TryWithFinally();
        tryWithFinally.show();

        System.out.println("------------------------------------------------------");

        TryWithCatchFinally tryWithCatchFinally=new TryWithCatchFinally();
        tryWithCatchFinally.display();

        System.out.println("------------------------------------------------------");

        TryWithMultiCatchFinally multiCatchFinally=new TryWithMultiCatchFinally();
        multiCatchFinally.show();

        System.out.println("------------------------------------------------------");

        TryWithMultipleCtachFinally tryWithMultipleCtachFinally=new TryWithMultipleCtachFinally();
        tryWithMultipleCtachFinally.display();
        System.out.println("Ending main in Tryrunner");


    }
}
