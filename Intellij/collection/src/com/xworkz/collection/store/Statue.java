package com.xworkz.collection.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Statue {
    public static void main(String[] args) {

        Collection<String> statue=new ArrayList<>();
        statue.add("Celestial Harmony");
        statue.add("Eternal Embrace");
        statue.add("Whispering Winds");
        statue.add("Pinnacle of Peace");
        statue.add("Timeless Unity");
        statue.add("Serenity Sentinel");
        statue.add("Tranquil Triumph");
        statue.add("Radiant Resilience");
        statue.add("bhagath singh");
        statue.add("Guardian of Dreams");
        statue.add("Mosaic Serenade");
        statue.add("Solitude Sculpture");
        statue.add("Echoes of Eternity");
        statue.add("Wisdom's Watch");
        statue.add("Ethereal Equinox");
        statue.add("Tranquility Totem");
        statue.add("Luminous Legacy");
        statue.add("Resolute Reverie");
        statue.add("Cascading Cosmos");
        statue.add("Veil of Valor");
        statue.add("Zenith Zen");
        statue.add("Arcane Aura");
        statue.add("Utopian Uprising");
        statue.add("Whispers in Stone");
        statue.add("Celestial Beacon");
        statue.add("Purity Pillar");
        statue.add("Perpetual Radiance");
        statue.add("Odyssey Overture");
        statue.add("Nebula Nexus");
        statue.add("Glimmering Gateway");
        statue.add("Empyrean Echo");
        statue.add("Celestial Harmony");
        statue.add("Titan's Tribute");
        statue.add("Radiant Reminiscence");
        statue.add("Stellar Symphony");
        statue.add("Ethereal Elegance");
        statue.add("Rhapsody in Marble");
        statue.add("Ascendant Aspiration");
        statue.add("Enchanted Epoch");
        statue.add("Stalwart Sanctum");
        statue.add("Majestic Melody");

        Iterator<String> itr=statue.iterator();
        while (itr.hasNext()){
            String ref= itr.next();
            if(ref.toLowerCase().endsWith("O")){
                System.out.println(ref);
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

        }
    }
}
