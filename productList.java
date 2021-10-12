package week4;

import java.util.List;
import java.util.ArrayList;

public class productList extends product{

    public static void main(String[] args) {

        ArrayList fruitArr = new ArrayList();
        product fruit1 = new product("Apple", "Type of fruit", 3.5, 2.5);
        String apple = "Name: " + fruit1.name + " Description: " + fruit1.description + " Price: " + fruit1.price + " Discount Price: " + fruit1.discountPrice;
        fruitArr.add(fruit1);

        product fruit2 = new product("Pear", "Type of fruit", 4, 3.5);
        String pear = "Name: " + fruit2.name + " Description: " + fruit2.description + " Price: " + fruit2.price + " Discount Price: " + fruit2.discountPrice;
        fruitArr.add(pear);

        product fruit3 = new product("Grape", "Type of fruit", 8, 5);
        String grape = "Name: " + fruit3.name + " Description: " + fruit3.description + " Price: " + fruit3.price + " Discount Price: " + fruit3.discountPrice;
        fruitArr.add(grape);
        //System.out.println(fruitArr);

        ArrayList vegetableArr = new ArrayList();
        product vegetable1 = new product("Tomato", "Type of vegetable", 4, 3.5);
        String tomato = "Name: " + vegetable1.name + " Description: " + vegetable1.description + " Price: " + vegetable1.price + " Discount Price: " + vegetable1.discountPrice;
        vegetableArr.add(tomato);

        product vegetable2 = new product("Pepper", "Type of vegetable", 6, 4.5);
        String pepper = "Name: " + vegetable2.name + " Description: " + vegetable2.description + " Price: " + vegetable2.price + " Discount Price: " + vegetable2.discountPrice;
        vegetableArr.add(pepper);

        product vegetable3 = new product("Eggplant", "Type of vegetable", 9, 7);
        String eggplant = "Name: " + vegetable3.name + " Description: " + vegetable3.description + " Price: " + vegetable3.price + " Discount Price: " + vegetable3.discountPrice;
        vegetableArr.add(eggplant);
        //System.out.println(vegetableArr);

        ArrayList chipsArr = new ArrayList();
        product chips1 = new product("Lays", "Type of chips", 7.90, 6.90);
        String lays = "Name: " + chips1.name + " Description: " + chips1.description + " Price: " + chips1.price + " Discount Price: " + chips1.discountPrice;
        chipsArr.add(lays);

        product chips2 = new product("Doritos", "Type of chips", 7.50, 6.50);
        String doritos = "Name: " + chips2.name + " Description: " + chips2.description + " Price: " + chips2.price + " Discount Price: " + chips2.discountPrice;
        chipsArr.add(doritos);

        product chips3 = new product("Ruffles", "Type of chips", 7, 6);
        String ruffles = "Name: " + chips3.name + " Description: " + chips3.description + " Price: " + chips3.price + " Discount Price: " + chips3.discountPrice;
        chipsArr.add(ruffles);
        //System.out.println(chipsArr);

        ArrayList chocolateArr = new ArrayList();
        product chocolate1 = new product("Tadelle", "Type of chocolate", 5, 4.5);
        String tadelle = "Name: " + chocolate1.name + " Description: " + chocolate1.description + " Price: " + chocolate1.price + " Discount Price: " + chocolate1.discountPrice;
        chocolateArr.add(tadelle);

        product chocolate2 = new product("Albeni", "Type of chocolate", 2.5, 2);
        String albeni = "Name: " + chocolate2.name + " Description: " + chocolate2.description + " Price: " + chocolate2.price + " Discount Price: " + chocolate2.discountPrice;
        chocolateArr.add(albeni);

        product chocolate3 = new product("Metro", "Type of chocolate", 2, 1.25);
        String metro = "Name: " + chocolate3.name + " Description: " + chocolate3.description + " Price: " + chocolate3.price + " Discount Price: " + chocolate3.discountPrice;
        chocolateArr.add(metro);

        product chocolate4 = new product("Hobby", "Type of chocolate", 1.5, 1);
        String hobby = "Name: " + chocolate4.name + " Description: " + chocolate4.description + " Price: " + chocolate4.price + " Discount Price: " + chocolate4.discountPrice;
        chocolateArr.add(hobby);

        ArrayList milkArr = new ArrayList();
        product milk1 = new product("fullFatMilk", "Type of milk", 8, 7);
        String fullFatMilk = "Name: " + milk1.name + " Description: " + milk1.description + " Price: " + milk1.price + " Discount Price: " + milk1.discountPrice;
        milkArr.add(fullFatMilk);

        product milk2 = new product("lowFatMilk", "Type of milk", 7.5, 7);
        String lowFatMilk = "Name: " + milk2.name + " Description: " + milk2.description + " Price: " + milk2.price + " Discount Price: " + milk2.discountPrice;
        milkArr.add(lowFatMilk);

        product milk3 = new product("lactoFreeMilk", "Type of milk", 9, 8);
        String lactoFreeMilk = "Name: " + milk3.name + " Description: " + milk3.description + " Price: " + milk3.price + " Discount Price: " + milk3.discountPrice;
        milkArr.add(lactoFreeMilk);

        ArrayList delicatessenArr = new ArrayList();
        product delicatessen1 = new product("Cheddar", "Type of delicatessen", 20, 18);
        String cheddar = "Name: " + delicatessen1.name + " Description: " + delicatessen1.description + " Price: " + delicatessen1.price + " Discount Price: " + delicatessen1.discountPrice;
        delicatessenArr.add(cheddar);

        product delicatessen2 = new product("Cheese", "Type of delicatessen", 23, 20);
        String cheese = "Name: " + delicatessen2.name + " Description: " + delicatessen2.description + " Price: " + delicatessen2.price + " Discount Price: " + delicatessen2.discountPrice;
        delicatessenArr.add(cheese);

        product delicatessen3 = new product("Salami", "Type of delicatessen", 12, 10);
        String salami = "Name: " + delicatessen3.name + " Description: " + delicatessen3.description + " Price: " + delicatessen3.price + " Discount Price: " + delicatessen3.discountPrice;
        delicatessenArr.add(salami);

        product delicatessen4 = new product("Sausage", "Type of delicatessen", 30, 25);
        String sausage = "Name: " + delicatessen4.name + " Description: " + delicatessen4.description + " Price: " + delicatessen4.price + " Discount Price: " + delicatessen4.discountPrice;
        delicatessenArr.add(sausage);

        product delicatessen5 = new product("Olive", "Type of delicatessen", 23, 30);
        String olive = "Name: " + delicatessen5.name + " Description: " + delicatessen5.description + " Price: " + delicatessen5.price + " Discount Price: " + delicatessen5.discountPrice;
        delicatessenArr.add(olive);

    }
}
