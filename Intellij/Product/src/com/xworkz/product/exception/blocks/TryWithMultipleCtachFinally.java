package com.xworkz.product.exception.blocks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TryWithMultipleCtachFinally {

    public void display(){
        String str="Lets try";
        byte[] bytes;

        try {

            FileReader fileReader = new FileReader("C:\\Users\\Whynew.in\\IdeaProjects\\Product\\src\\com\\xworkz\\product\\exception\\blocks\\sample.txt");
            System.out.println(fileReader.read());
            bytes=str.getBytes("UTF");
            System.out.println(bytes);


        }

        catch (FileNotFoundException e) {
            System.err.println("File is not found");
            System.out.println(e);
        }
        catch (UnsupportedEncodingException e) {
            System.err.println("Unsupported encoding");
            System.out.println(e);
        }
        catch (IOException e) {
            System.err.println("reading is not avail for file");
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("running finally in try with multiple catch");
        }
    }
}
