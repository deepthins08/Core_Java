package com.xworkz.serialization.serialize;

import com.xworkz.serialization.dto.AlarmDTO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AlarmSerialization {
    public static void main(String[] serialize) throws IOException {
        AlarmDTO alarmDTO=new AlarmDTO("clock","round",10.2);
        FileOutputStream fileOutputStream=new FileOutputStream("output.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(alarmDTO);
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Success");

    }
}
