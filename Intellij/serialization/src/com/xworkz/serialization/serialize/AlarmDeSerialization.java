package com.xworkz.serialization.serialize;

import com.xworkz.serialization.dto.AlarmDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AlarmDeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("output.txt"));
        AlarmDTO alarmDTO=(AlarmDTO)objectInputStream.readObject();
        System.out.println(alarmDTO.getType()+" "+alarmDTO.getShape());
        objectInputStream.close();
    }
}
