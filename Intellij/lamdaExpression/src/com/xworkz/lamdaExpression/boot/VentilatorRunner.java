package com.xworkz.lamdaExpression.boot;

import com.xworkz.lamdaExpression.dto.VentilatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VentilatorRunner {
    public static void main(String[] args) {

        VentilatorDTO ventilatorDTO=new VentilatorDTO("orient","white",317,38 );
        VentilatorDTO ventilatorDTO1=new VentilatorDTO("havells","black", 999,30);
        VentilatorDTO ventilatorDTO2=new VentilatorDTO("luminous","purple", 317,42);
        VentilatorDTO ventilatorDTO3=new VentilatorDTO("havells","blue",1375,63);
        VentilatorDTO ventilatorDTO4=new VentilatorDTO("usha","pink",1234,36);

        List<VentilatorDTO> list=new ArrayList<>();
        list.add(ventilatorDTO);
        list.add(ventilatorDTO1);
        list.add(ventilatorDTO2);
        list.add(ventilatorDTO3);
        list.add(ventilatorDTO4);

        Comparator<VentilatorDTO> ventilatorDTOComparatorBrandAsce=(o1,o2)->{
          return o1.getBrand().compareTo(o2.getBrand());
        };
        Collections.sort(list,ventilatorDTOComparatorBrandAsce);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<VentilatorDTO> ventilatorDTOComparatorBrandDesc=(o1,o2)->{
            return o2.getBrand().compareTo(o1.getBrand());
        };
        Collections.sort(list,ventilatorDTOComparatorBrandDesc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<VentilatorDTO> ventilatorDTOComparatorColorAsce=(o1,o2)->{
            return o1.getColor().compareTo(o2.getColor());
        };
        Collections.sort(list,ventilatorDTOComparatorColorAsce);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<VentilatorDTO> ventilatorDTOComparatorColorDesc=(o1,o2)->{
            return o2.getColor().compareTo(o1.getColor());
        };
        Collections.sort(list,ventilatorDTOComparatorColorDesc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<VentilatorDTO> ventilatorDTOComparatorCostAsce=(o1,o2)->{
            return Double.compare(o1.getCost(),o2.getCost());
        };
        Collections.sort(list,ventilatorDTOComparatorCostAsce);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<VentilatorDTO> ventilatorDTOComparatorCostDesc=(o1,o2)->{
            return Double.compare(o2.getCost(),o1.getCost());
        };
        Collections.sort(list,ventilatorDTOComparatorCostDesc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<VentilatorDTO> ventilatorDTOComparatorWattageAsce=(o1,o2)->{
            return Integer.compare(o1.getWattage(),o2.getWattage());
        };
        Collections.sort(list,ventilatorDTOComparatorWattageAsce);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }

        Comparator<VentilatorDTO> ventilatorDTOComparatorWattageDesc=(o1,o2)->{
            return Integer.compare(o1.getWattage(),o2.getWattage());
        };
        Collections.sort(list,ventilatorDTOComparatorWattageDesc);
        for (VentilatorDTO dto:list){
            System.out.println(dto);
        }
    }
}
