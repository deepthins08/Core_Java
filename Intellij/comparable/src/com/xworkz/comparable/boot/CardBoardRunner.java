package com.xworkz.comparable.boot;

import com.xworkz.comparable.dto.CardBoardDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardBoardRunner {
    public static void main(String[] args) {

        CardBoardDTO cardBoardDTO=new CardBoardDTO("black",100D,'M');
        CardBoardDTO cardBoardDTO1=new CardBoardDTO("pink",150D,'L');
        CardBoardDTO cardBoardDTO2=new CardBoardDTO("blue",120D,'S');
        CardBoardDTO cardBoardDTO3=new CardBoardDTO("purple",90D,'L');
        CardBoardDTO cardBoardDTO4=new CardBoardDTO("green",110D,'X');

        List<CardBoardDTO> list=new ArrayList<>();
        list.add(cardBoardDTO);
        list.add(cardBoardDTO1);
        list.add(cardBoardDTO2);
        list.add(cardBoardDTO3);
        list.add(cardBoardDTO4);

        Collections.sort(list);
        for(CardBoardDTO dto:list){
            System.out.println(dto);
        }

    }
}
