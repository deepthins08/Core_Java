package com.xworkz.product.exception.blocks;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryAndCatch {

    public void read() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("text.txt");
            System.out.println(fileReader);
        }
        catch(FileNotFoundException e){
            System.err.println("File is not found");
            System.out.println(e);
        }
    }
}
