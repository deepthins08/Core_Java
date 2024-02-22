package com.xworkz.map.boot;

import com.xworkz.map.dto.FoodDTO;
import com.xworkz.map.dto.RestaurantDTO;

import java.util.HashMap;
import java.util.Map;

public class RestauarantRunner {

    public static void main(String[] args) {

        RestaurantDTO restaurantDTO=new RestaurantDTO("Café Parisien","Paris",4);
        RestaurantDTO restaurantDTO1=new RestaurantDTO("Taj Mahal Restaurant","Agra",5);
        RestaurantDTO restaurantDTO2=new RestaurantDTO("Golden Gate Grill","San Francisco",4);
        RestaurantDTO restaurantDTO3=new RestaurantDTO("Sushi Samba","Tokyo",4);
        RestaurantDTO restaurantDTO4=new RestaurantDTO("La Piazza Trattoria","Rome",5);
        RestaurantDTO restaurantDTO5=new RestaurantDTO("El Rancho Steakhouse","Buenos Aires",5);
        RestaurantDTO restaurantDTO6=new RestaurantDTO("The Great Wall Bistro","Beijing",4);
        RestaurantDTO restaurantDTO7=new RestaurantDTO("Mama Mia Pizzeria","Naples",3);
        RestaurantDTO restaurantDTO8=new RestaurantDTO("Café Parisien","Paris",5);
        RestaurantDTO restaurantDTO9=new RestaurantDTO("The Red Dragon Inn","Cardiff",4);

        FoodDTO foodDTO=new FoodDTO("Chicken Tikka Masala",true,400);
        FoodDTO foodDTO1=new FoodDTO("California Roll",false,250);
        FoodDTO foodDTO2=new FoodDTO("Hamburger",false,300);
        FoodDTO foodDTO3=new FoodDTO("Margherita Pizza",false,450);
        FoodDTO foodDTO4=new FoodDTO("Chocolate Lava Cake",false,200);
        FoodDTO foodDTO5=new FoodDTO("Jerk Chicken",true,500);
        FoodDTO foodDTO6=new FoodDTO("Chettinad Chicken",true,350);
        FoodDTO foodDTO7=new FoodDTO("Prawn Balchao",true,670);
        FoodDTO foodDTO8=new FoodDTO("Steak Frites",true,320);
        FoodDTO foodDTO9=new FoodDTO("Pad Thai",false,600);

        Map<RestaurantDTO,FoodDTO> map=new HashMap<>();
        map.put(restaurantDTO,foodDTO);
        map.put(restaurantDTO1,foodDTO1);
        map.put(restaurantDTO2,foodDTO2);
        map.put(restaurantDTO3,foodDTO3);
        map.put(restaurantDTO4,foodDTO4);
        map.put(restaurantDTO5,foodDTO5);
        map.put(restaurantDTO6,foodDTO6);
        map.put(restaurantDTO7,foodDTO7);
        map.put(restaurantDTO8,foodDTO8);
        map.put(restaurantDTO9,foodDTO9);

        map.forEach((k,l)-> System.out.println(k+" "+l));
    }
}
