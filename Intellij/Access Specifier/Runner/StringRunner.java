package com.xworkz.Runner;

public class StringRunner {

    public static void main(String[] args) {

        String string=new String();

        String string1="String Class";
        String string2="methods";
        System.out.println(string1.toString());//toString()

        char ch=string1.charAt(4);//charAt()
        System.out.println(ch);

        System.out.println("comparing two strings  "+string1.compareTo(string2));//compareTo()
        System.out.println("concatanating two Strings "+string1.concat(string2));//concat();
        System.out.println(string1.contains("Class"));//contains()
        System.out.println(string1.endsWith("s"));//endsWith()
        System.out.println(string1.equals(string2));//equals
        byte[] b=string1.getBytes();//getBytes
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println("\n=================================================");
        System.out.println(string2.hashCode());//hashCode
        System.out.println(string1.indexOf("g"));//indexOf
        System.out.println(string1.replace("g","G"));//replace()
        System.out.println(string1.replace("Class","class"));//replace(char oldChar, char newChar)
        System.out.println();
        String[] split=string1.split("",2);//spliit(regex,limit)
        for(int i=0;i< split.length;i++) {
            System.out.println(split[i]);
        }

        String[] sp=string1.split(" ");//split(regex)
        for(int i=0;i<sp.length;i++) {
            System.out.println(sp[i]);
        }

        System.out.println(string1.startsWith("S"));//startsWith
        System.out.println(string1.substring(6));//substring()
        System.out.println(string1.substring(3,7));//substring(begin,end)
        System.out.println(string1.toLowerCase( ));//toLowerCase
        System.out.println(string1.toUpperCase());//toUpperCase()
        System.out.println(string1.trim());//trim()




    }
}
