package com.xworkz.product.exception.blocks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public void display() throws IOException {

        try(FileReader fileReader = new FileReader("C:\\Users\\Whynew.in\\IdeaProjects\\Product\\src\\com\\xworkz\\product\\exception\\blocks\\sample.txt")){

            System.out.println("running in try resourcd");
            System.out.println(fileReader.read());
        }
    }
}
