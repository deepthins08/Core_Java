package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.AlarmDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlarmRunner {
    public static void main(String[] args) {

        AlarmDTO alarmDTO=new AlarmDTO("clock","round",10.20);
        AlarmDTO alarmDTO1=new AlarmDTO("digital","square",8.02);
        AlarmDTO alarmDTO2=new AlarmDTO("analog","circle",6.0);
        AlarmDTO alarmDTO3=new AlarmDTO("watch","square",5.0);
        AlarmDTO alarmDTO4=new AlarmDTO("mobile","rectangle",9.0);

        List<AlarmDTO> list=new ArrayList<>();
        list.add(alarmDTO);
        list.add(alarmDTO1);
        list.add(alarmDTO2);
        list.add(alarmDTO3);
        list.add(alarmDTO4);

        Collections.sort(list);
        for(AlarmDTO dto:list){
            System.out.println(dto);
        }
    }
}
