package com.xworkz.cloning.boot;

import com.xworkz.cloning.product.*;

public class CandleRunner {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Starting main in CandleRunner");
        Scanner scanner=new Scanner("printx",5000);
        Object scanner1=(Scanner)scanner.clone();
        System.out.println(scanner);
        System.out.println("after coning "+scanner);
        System.out.println("------------------------------------");

        Plastic plastic=new Plastic("fibre",300);
        Object plastc1=(Plastic)plastic.clone();
        System.out.println(plastic);
        System.out.println("after coning "+plastc1);
        System.out.println("------------------------------------");

        Candle candle=new Candle("Pink",10);
        Object candle1=(Candle)candle.clone();
        System.out.println(candle);
        System.out.println("after coning "+candle1);
        System.out.println("------------------------------------");

        Light light=new Light("LED",80);
        Object light1=(Light)light.clone();
        System.out.println(light);
        System.out.println("after coning "+light);
        System.out.println("------------------------------------");

        Paint paint=new Paint("Purple",2);
        Object paint1=(Paint)paint.clone();
        System.out.println(paint);
        System.out.println("after coning "+paint1);




        System.out.println("Ending main in CandleRunner");

    }
}
