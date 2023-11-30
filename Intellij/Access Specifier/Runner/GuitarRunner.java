package com.xworkz.Runner;

import com.xworkz.Classes.Guitar;

public class GuitarRunner {

    public static void main(String[] args) {
        System.out.println("Starting main in GiutarRunner");

        Guitar guitar=new Guitar(1,1820,"Linden Wood");
        Guitar guitar1=new Guitar(1,1820,"Linden Wood");
        boolean same=guitar.equals(guitar1);
        System.out.println("guitar.equals(guitar1):"+same);


        WifiDongle wifiDongle=new WifiDongle("Airtel",150,27);
        WifiDongle wifiDongle1=new WifiDongle("Airtel",150,27);
        boolean same1=wifiDongle.equals(wifiDongle1);
        System.out.println("wifiDongle.equals(wifiDongle1):"+same1);

        UsbHub usbHub=new UsbHub(4,5,0);
        UsbHub usbHub1=new UsbHub(4,5,0);
        boolean same2=usbHub.equals(usbHub1);
        System.out.println("usbhub.equals(usbhub1):"+same2);

        System.out.println("Ending main in GiutarRunner");

    }
}
