package com.xworkz.collection.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HumanBodyParts {
    public static void main(String[] args) {

        Collection<String> human=new ArrayList<>();
        human.add("Head");
        human.add("Neck");
        human.add("Shoulder");
        human.add("Arm");
        human.add("Elbow");
        human.add("Forearm");
        human.add("Wrist");
        human.add("Hand");
        human.add("Fingers");
        human.add("Thumb");
        human.add("Chest");
        human.add("Abdomen");
        human.add("Navel");
        human.add("Hip");
        human.add("Buttocks");
        human.add("Thigh");
        human.add("Knee");
        human.add("Leg");
        human.add("Calf");
        human.add("Ankle");
        human.add("Foot");
        human.add("Toes");
        human.add("Heel");
        human.add("Hair");
        human.add("Forehead");
        human.add("Eyebrow");
        human.add("Eyelash");
        human.add("Eye");
        human.add("Ear");
        human.add("Nose");
        human.add("Cheek");
        human.add("Mouth");
        human.add("Lips");
        human.add("Head");
        human.add("Tongue");
        human.add("Teeth");
        human.add("Jaw");
        human.add("Chin");
        human.add("Skull");
        human.add("Brain");
        human.add("Spine");
        human.add("Spine");
        human.add("Heart");
        human.add("Lung");
        human.add("Lung");
        human.add("Stomach");
        human.add("Kidney");
        human.add("Intestine");
        human.add("bladder");
        human.add("Pancreas");
        human.add("Spleen");
        human.add("Uterus");
        human.add("Ovary");
        human.add("blood vessels");
        human.add("Muscle");
        human.add("Skin");
        human.add("Nail");
        human.add("Joint");
        human.add("Tendon");
        human.add("Ligament");
        human.add("Cartilage");
        human.add("Vein");
        human.add("Artery");
        human.add("Nerve endings");
        human.add("Lymph node");
        human.add("Adrenal gland");
        human.add("Thyroid gland");
        human.add("Pituitary gland");
        human.add("Pineal gland");
        human.add("Thymus");
        human.add("Salivary gland");
        human.add("Mammary gland");
        human.add("Sweat gland");
        human.add("Sebaceous gland");
        human.add("Larynx");
        human.add("Trachea");
        human.add("Esophagus");
        human.add("Radius");
        human.add("Scapula");
        human.add("Coccyx");
        human.add("Axilla");

        Iterator<String> itr= human.iterator();
        while (itr.hasNext()){
            String ref= itr.next();
            //System.out.println("Human body parts are :"+ref);
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
        }
        }
    }

