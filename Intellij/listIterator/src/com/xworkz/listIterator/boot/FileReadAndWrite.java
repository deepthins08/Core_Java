package com.xworkz.listIterator.boot;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

    public static void main(String[] args) {

        int i ;
        try {
            FileReader fileReader=new FileReader("C:\\Users\\Whynew.in\\IdeaProjects\\listIterator\\file\\input.txt");
            FileWriter fileWriter =new FileWriter("C:\\Users\\Whynew.in\\IdeaProjects\\listIterator\\file\\output.txt");
            String str="Writing this from programme, ";

            while((i=fileReader.read())!=-1){

                str+=(char)i;
            }
            System.out.println(str);
            fileWriter.write(str);

            fileReader.close();
            fileWriter.close();

            System.out.println("file reading and writing both done");
        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
