package com.xworkz.map.boot;

import com.xworkz.map.dto.AddressDTO;
import com.xworkz.map.dto.PersonDTO;

import java.util.HashMap;
import java.util.Map;

public class PersonRunner {

    public static void main(String[] args) {

        PersonDTO personDTO=new PersonDTO("john","john@gmail.com");
        PersonDTO personDTO1=new PersonDTO("kelvin","kelvin@gmail.com");
        PersonDTO personDTO2=new PersonDTO("monica","monica@gmail.com");
        PersonDTO personDTO3=new PersonDTO("tylor","tylor@gmail.com");

        PersonDTO personDTO4=new PersonDTO("ted","tylor@gmail.com");

        AddressDTO addressDTO=new AddressDTO(23,577832,"btm");
        AddressDTO addressDTO1=new AddressDTO(74,566897,"madivala");
        AddressDTO addressDTO2=new AddressDTO(88,577883,"mico layout");
        AddressDTO addressDTO3=new AddressDTO(93,599222,"jayanagara");
        AddressDTO addressDTO4=new AddressDTO(45,566072,"JP nagar");

        Map<PersonDTO,AddressDTO> map=new HashMap<>();
        map.put(personDTO,addressDTO);
        map.put(personDTO1,addressDTO1);
        map.put(personDTO2,addressDTO2);
        map.put(personDTO3,addressDTO3);
        map.put(personDTO4,addressDTO4);

        map.keySet().forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        map.values().forEach(System.out::println);
    }
}
