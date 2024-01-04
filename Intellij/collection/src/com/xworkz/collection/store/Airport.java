package com.xworkz.collection.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Airport {
    public static void main(String[] args) {

        Collection<String> airport=new ArrayList<>();
        airport.add("Skylink International Airport");
        airport.add("Horizon Hub Airport");
        airport.add("AeroVista Gateway");
        airport.add("Nimbus Airfield");
        airport.add("JetStream Junction");
        airport.add("Unity Aviation Hub");
        airport.add("Quantum Skyport");
        airport.add("Stellar Aeroport");
        airport.add("Elevate Airways Terminal");
        airport.add("AeroScape International");
        airport.add("Celestial Skyplex");
        airport.add("Panorama Airstrip");
        airport.add("Zenith Sky Harbor");
        airport.add("Altitude Axis Airport");
        airport.add("Echo Sky Terminal");
        airport.add("Radiant Runway Center");
        airport.add("Harmony Flight Hub");
        airport.add("Summit Skyport");
        airport.add("Nimbus Landing Zone");
        airport.add("Equinox Aeronautics");
        airport.add("Azure Aero Terminal");
        airport.add("Apex Aviator Plaza");
        airport.add("Eclipse Express Airport");
        airport.add("Serenity Skyline Hub");
        airport.add("Velocity Vista Aerodrome");
        airport.add("Orion Odyssey Terminal");
        airport.add("Infinity Airfield");
        airport.add("Tranquil Takeoff Terminal");
        airport.add("Cascade Cloudport");
        airport.add("Avian Arcadia Airport");
        airport.add("Quasar Quickstop");
        airport.add("Nebula Nexus Airstrip");
        airport.add("Sovereign Sky Terminal");
        airport.add("Pinnacle Port");
        airport.add("Solitude Skyway Station");
        airport.add("Uplift Express Hub");
        airport.add("Zenith Zoom Airport");
        airport.add("AeroVantage Vista");
        airport.add("Elevate Elite Airport");
        airport.add("Harmony Haven Hub");
        airport.add("Ethereal Expedition Terminal");
        airport.add("Zenith Zone Aeronautics");
        airport.add("Starlight Sky Harbor");
        airport.add("Nimbus Nexus Airport");
        airport.add("Radiant Rostrum Terminal");
        airport.add("Tranquil Transit Port");
        airport.add("Horizon Heights Hub");
        airport.add("Celestial Circuit Aerodrome");
        airport.add("Apex Airstrip");
        airport.add("Quantum Quest Terminal");
        airport.add("Nebula Nectar Airfield");
        airport.add("Elevate Essence Gateway");
        airport.add("Skyline Symphony Terminal");
        airport.add("Nimbus Nucleus Airstrip");
        airport.add("Zenith Zen Airport");
        airport.add("Radiant Rendezvous Hub");
        airport.add("Orion Ovation Terminal");
        airport.add("Horizon Harmony Hub");
        airport.add("Celestial Catalyst Aeronautics");
        airport.add("Nimbus Nexus Aerodrome");
        airport.add("Elevate Echelon Airport");
        airport.add("Quantum Quotient Terminal");
        airport.add("Azure Arc Airstrip");
        airport.add("Uplift Union Airport");
        airport.add("Solstice Sky Harbor");
        airport.add("Nimbus Nest Airport");
        airport.add("Apex Altitude Airstrip");
        airport.add("Stellar Spectrum Terminal");
        airport.add("Equinox Essence Hub");
        airport.add("Zenith Zenith Aeroport");
        airport.add("Radiant Roam Terminal");
        airport.add("Orion Overture Airport");
        airport.add("Horizon Heights Airstrip");
        airport.add("Nimbus Nexus Hub");
        airport.add("Celestial Circuit Terminal");
        airport.add("Elevate Echo Airport");
        airport.add("Quantum Quasar Aeronautics");
        airport.add("Azure Aria Terminal");
        airport.add("Solitude Skyport");
        airport.add("Zenith Zephyr Hub");
        airport.add("Nimbus Nexus Aerodrome");
        airport.add("Radiant Rhapsody Terminal");
        airport.add("Orion Odyssey Airport");
        airport.add("Horizon Haven Airstrip");
        airport.add("Celestial Circlet Terminal");
        airport.add("Elevate Elevation Hub");
        airport.add("Quantum Quest Aeroport");
        airport.add("Azure Altitude Terminal ");
        airport.add("Ethereal Essence Airport");
        airport.add("Zenith Zenith Hub");
        airport.add("Nimbus Nest Airstrip");
        airport.add("Radiant Rendezvous Terminal");
        airport.add("Orion Overture Aerodrome");
        airport.add("Horizon Harmony Airport");
        airport.add("Celestial Catalyst Terminal");
        airport.add("Elevate Echo Hub");
        airport.add("Quantum Quasar Airport");
        airport.add("Azure Aria Aerodrome");
        airport.add("Solitude Skyway Terminal");
        airport.add("Zenith Zephyr Airport");

        Iterator<String> itr=airport.iterator();
        while ((itr.hasNext())){
            String ref= itr.next();
           // System.out.println(ref);

            if(ref.toLowerCase().endsWith("o")){
                System.out.println("ends with o "+ref);
            }
            if(ref.endsWith("r")){
                System.out.println("ends with r "+ref);
            }
            if(ref.startsWith("b") || ref.endsWith("k")){
                System.out.println("Starting with b or end with k "+ref);
            }
            if(ref.length()<5) {
                System.out.println("having less than 5 characters "+ref);
            } else if (ref.length()>=5) {
                System.out.println("cutting of characters to length 5 "+ref.substring(0,5));
            }


                System.out.println(ref.toUpperCase());

        }



    }
}
