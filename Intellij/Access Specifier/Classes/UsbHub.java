package com.xworkz.Runner;

import com.xworkz.Classes.Guitar;

public class UsbHub {

    int totalPorts;

    double transferRate;

    int batteryRequired;

        public UsbHub(int totalPorts,double transferRate,int batteryRequired){
            this.totalPorts=totalPorts;
            this.transferRate=transferRate;
            this.batteryRequired=batteryRequired;
            System.out.println("Created id,double,int arg const in UsbHub");
        }

        @Override
        public boolean equals(Object o) {

            UsbHub usbLeftSide=this;
            if(o!=null){

                if(o instanceof UsbHub) {
                    UsbHub usbRightSide=(UsbHub) o;

                    System.out.println("same on both side");

                    if (usbLeftSide.totalPorts == usbRightSide.totalPorts && usbLeftSide.transferRate == usbRightSide.transferRate && usbLeftSide.batteryRequired==usbRightSide.batteryRequired) {

                        System.out.println("usbRightSide and usbLightSide is same");
                        return true;
                    } else {
                        System.err.println("usbRightSide and usbLightSide is not same");
                    }
                }
            }
            else{
                System.err.println("null is passed");
            }

            return false;
        }
}
