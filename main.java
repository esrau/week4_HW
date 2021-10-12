package week4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main extends product {

    public static void main(String[] args) {

        System.out.println("Welcome :) Please enter login information...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter username");
        String username = scanner.next();
        System.out.println("Please enter password");
        String password = scanner.next();

        String[] nameArr = {"Ahmet", "Mehmet", "Ayse", "Fatma", "Auspicious"};
        String[] userNameArr = {"ahmet", "mehmet", "Ayse", "Fatma", "hayride"};
        String[] passwordArr = {"1234", "1234+", "02121682898", "A12345+", "1234"};
        String[] phoneArr = {"05552909999", "05552909998", "12345", "01111111111", "09999999999"};
        String[] addressArr = {"İstabul / Avcılar", "Kocaeli / Gebze", "Konya / Meram", "Ordu / Ünye", "Samsun /Çarşamba"};

        List mainCategories = new ArrayList();
        mainCategories.add("Fruit & Vegetable");
        mainCategories.add("Snack");
        mainCategories.add("Breakfast");


        List subCategories1 = new ArrayList();
        subCategories1.add("Fruit");
        subCategories1.add("Vegetable");

        List subCategories2 = new ArrayList();
        subCategories2.add("Chips");
        subCategories2.add("Chocolate");

        List subCategories3 = new ArrayList();
        subCategories3.add("Milk");
        subCategories3.add("Delicatessen");

        List fruit = new ArrayList();
        fruit.add("Apple");
        fruit.add("Pear");
        fruit.add("Grape");

        List vegetable = new ArrayList();
        vegetable.add("Tomato");
        vegetable.add("Pepper");
        vegetable.add("Eggplant");

        List chips = new ArrayList();
        chips.add("Lays");
        chips.add("Doritos");
        chips.add("Ruffles");

        List chocolate = new ArrayList();
        chocolate.add("Tadelle");
        chocolate.add("Albeni");
        chocolate.add("Metro");
        chocolate.add("Hobby");

        List milk = new ArrayList();
        milk.add("Full-fat");
        milk.add("Low-fat");
        milk.add("Lacto-free");

        List delicatessen = new ArrayList();
        delicatessen.add("Cheddar");
        delicatessen.add("Cheese");
        delicatessen.add("Salami");
        delicatessen.add("Sausage");
        delicatessen.add("Olive");

        ArrayList basket = new ArrayList();

        if ((username.equals(userNameArr[0]) && password.equals(passwordArr[0])) || (username.equals(userNameArr[1]) && password.equals(passwordArr[1])) || (username.equals(userNameArr[2]) && password.equals(passwordArr[2])) || (username.equals(userNameArr[3]) && password.equals(passwordArr[3])) || (username.equals(userNameArr[4]) && password.equals(passwordArr[4]))) {
            System.out.println("Congurations.You are login...");
            System.out.println("You can choose three options: Number 1 for MainMenu, Number 2 for Seach, Number 3 for Profile");
            System.out.println("Please write your choose...");
            String choose = scanner.next();

            if (choose.equals("1")) {
                System.out.println(mainCategories);
                System.out.println("Please choose a category...");
                System.out.println("You can choose three options: Number 1 for Fruit & Vegetable, Number 2 for Snack, Number 3 for Breakfast");
                String chooseCategory = scanner.next();

                if (chooseCategory.equals("1")) {
                    System.out.println(subCategories1);
                    System.out.println("Please choose a subcategory...");
                    System.out.println("You can choose three options: Number 1 for Fruit and Number 2 for Vegetable");
                    String chooseSubcategory1 = scanner.next();

                    if (chooseSubcategory1.equals("1")) {
                        System.out.println(fruit);
                        System.out.println("You can choose three options: Number 1 for adding apple to basket, Number 2 for adding pear to basket, Number 3 for adding grape to basket, Number 4 for back, Number 5 for basket  ");
                        int chooseProduct1 = scanner.nextInt();

                        switch (chooseProduct1) {
                            case (1): {
                                int amount = scanner.nextInt();
                                product apple = new product();
                                productDetail(apple);
                                productPrice(amount, "apple");
                                basket.add("Apple");
                                break;
                            }
                            case (2): {
                                int amount = scanner.nextInt();
                                product pear = new product();
                                productDetail(pear);
                                productPrice(amount, "pear");
                                basket.add("Pear");
                                break;
                            }
                            case (3): {
                                int amount = scanner.nextInt();
                                product grape = new product();
                                productDetail(grape);
                                productPrice(amount, "grape");
                                basket.add("Grape");
                                break;
                            }
                            case (4): {
                                break;
                            }
                            case (5): {
                                System.out.println(basket);
                            }
                        }
                    } else if (chooseSubcategory1.equals("2")) {
                        System.out.println(vegetable);
                        System.out.println("You can choose three options: Number 1 for adding tomato to basket, Number 2 for adding pepper to basket, Number 3 for adding eggplant to basket, Number 4 for back, Number 5 for basket ");
                        int chooseProduct2 = scanner.nextInt();

                        switch (chooseProduct2) {
                            case (1): {
                                int amount = scanner.nextInt();
                                product tomato = new product();
                                productDetail(tomato);
                                productPrice(amount, "tomato");
                                basket.add("Tomato");
                                break;
                            }
                            case (2): {
                                int amount = scanner.nextInt();
                                product pepper = new product();
                                productDetail(pepper);
                                productPrice(amount, "pepper");
                                basket.add("Pepper");
                                break;
                            }
                            case (3): {
                                int amount = scanner.nextInt();
                                product eggplant = new product();
                                productDetail(eggplant);
                                productPrice(amount, "eggplant");
                                basket.add("Eggplant");
                                break;
                            }
                            case (4): {
                                break;
                            }
                            case (5): {
                                System.out.println(basket);
                            }
                        }
                    }
                }
                if (chooseCategory.equals("2")) {
                    System.out.println(subCategories2);
                    System.out.println("Please choose a subcategory...");
                    System.out.println("You can choose three options: Number 1 for Chips and Number 2 for Chocolate");
                    String chooseSubcategory2 = scanner.next();

                    if (chooseSubcategory2.equals("1")) {
                        System.out.println(chips);
                        System.out.println("You can choose three options: Number 1 for adding lays to basket, Number 2 for adding doritos to basket, Number 3 for adding ruffles to basket, Number 4 for back, Number 5 for basket  ");
                        int chooseProduct3 = scanner.nextInt();

                        switch (chooseProduct3) {
                            case (1): {
                                int amount = scanner.nextInt();
                                product lays = new product();
                                productDetail(lays);
                                productPrice(amount, "lays");
                                basket.add("Lays");
                                break;
                            }
                            case (2): {
                                int amount = scanner.nextInt();
                                product doritos = new product();
                                productDetail(doritos);
                                productPrice(amount, "doritos");
                                basket.add("Doritos");
                                break;
                            }
                            case (3): {
                                int amount = scanner.nextInt();
                                product ruffles = new product();
                                productDetail(ruffles);
                                productPrice(amount, "ruffles");
                                basket.add("Ruffles");
                                break;
                            }
                            case (4): {
                                break;
                            }
                            case (5): {
                                System.out.println(basket);
                            }
                        }

                    } else if (chooseSubcategory2.equals("2")) {
                        System.out.println(chocolate);
                        System.out.println("You can choose three options: Number 1 for adding tadelle to basket, Number 2 for adding albeni to basket, Number 3 for adding metro to basket, Number 4 for adding hobby to basket, Number 5 for back, Number 6 for basket ");
                        int chooseProduct4 = scanner.nextInt();

                        switch (chooseProduct4) {
                            case (1): {
                                int amount = scanner.nextInt();
                                product tadelle = new product();
                                productDetail(tadelle);
                                productPrice(amount, "tadelle");
                                basket.add("Tadelle");
                                break;
                            }
                            case (2): {
                                int amount = scanner.nextInt();
                                product albeni = new product();
                                productDetail(albeni);
                                productPrice(amount, "albeni");
                                basket.add("Albeni");
                                break;
                            }
                            case (3): {
                                int amount = scanner.nextInt();
                                product metro = new product();
                                productDetail(metro);
                                productPrice(amount, "metro");
                                basket.add("Metro");
                                break;
                            }
                            case (4): {
                                int amount = scanner.nextInt();
                                product hobby = new product();
                                productDetail(hobby);
                                productPrice(amount, "hobby");
                                basket.add("Hobby");
                                break;
                            }
                            case (5): {
                                break;
                            }
                            case (6): {
                                System.out.println(basket);
                            }
                        }
                    }
                }
                if (chooseCategory.equals("3")) {
                    System.out.println(subCategories3);
                    System.out.println("Please choose a subcategory...");
                    System.out.println("You can choose three options: Number 1 for Milk and Number 2 for Delicatessen");
                    String chooseSubcategory3 = scanner.next();

                    if (chooseSubcategory3.equals("1")) {
                        System.out.println(milk);
                        System.out.println("You can choose three options: Number 1 for adding Full-fat milk to basket, Number 2 for adding Low-fat milk to basket, Number 3 for adding Lacto-free milk to basket, Number 4 for back, Number 5 for basket  ");
                        int chooseProduct5 = scanner.nextInt();

                        switch (chooseProduct5) {
                            case (1): {
                                int amount = scanner.nextInt();
                                product fullFatMilk = new product();
                                productDetail(fullFatMilk);
                                productPrice(amount, "fullFatMilk");
                                basket.add("Full-fat");
                                break;
                            }
                            case (2): {
                                int amount = scanner.nextInt();
                                product lowFatMilk = new product();
                                productDetail(lowFatMilk);
                                productPrice(amount, "lowFatMilk");
                                basket.add("Low-fat");
                                break;
                            }
                            case (3): {
                                int amount = scanner.nextInt();
                                product lactoFreeMilk = new product();
                                productDetail(lactoFreeMilk);
                                productPrice(amount, "lactoFreeMilk");
                                basket.add("Lacto-free");
                                break;
                            }
                            case (4): {
                                break;
                            }
                            case (5): {
                                System.out.println(basket);
                            }
                        }
                    } else if (chooseSubcategory3.equals("2")) {
                        System.out.println(delicatessen);
                        System.out.println("You can choose three options: Number 1 for adding Cheddar to basket, Number 2 for adding Cheese to basket, Number 3 for adding Salami to basket, Number 4 for adding Sausage to basket, Number 5 for adding Olive to basket, Number 6 for back, Number 7 for basket");
                        int chooseProduct6 = scanner.nextInt();

                        switch (chooseProduct6) {
                            case (1): {
                                int amount = scanner.nextInt();
                                product cheddar = new product();
                                productDetail(cheddar);
                                productPrice(amount, "cheddar");
                                basket.add("Cheddar");
                                break;
                            }
                            case (2): {
                                int amount = scanner.nextInt();
                                product cheese = new product();
                                productDetail(cheese);
                                productPrice(amount, "cheese");
                                basket.add("Cheese");
                                break;
                            }
                            case (3): {
                                int amount = scanner.nextInt();
                                product salami = new product();
                                productDetail(salami);
                                productPrice(amount, "salami");
                                basket.add("Salami");
                                break;
                            }
                            case (4): {
                                int amount = scanner.nextInt();
                                product sausage = new product();
                                productDetail(sausage);
                                productPrice(amount, "sausage");
                                basket.add("Sausage");
                                break;
                            }
                            case (5): {
                                int amount = scanner.nextInt();
                                product olive = new product();
                                productDetail(olive);
                                productPrice(amount, "olive");
                                basket.add("Olive");
                                break;
                            }
                            case (6): {
                                break;
                            }
                            case (7): {
                                System.out.println(basket);
                            }
                        }
                    }
                }
            } else if (choose.equals("2")) {
                List productList = new ArrayList();
                productList.addAll(fruit);
                productList.addAll(vegetable);
                productList.addAll(chips);
                productList.addAll(chocolate);
                productList.addAll(milk);
                productList.addAll(delicatessen);

                System.out.println("Please enter seach key...");

                String searchKey = scanner.next();
                int wordLength = searchKey.length();
                ArrayList searchResult = new ArrayList();

                if (wordLength >= 3) {
                    for (int i = 0; i < productList.size(); i++) {
                        String productResult = productList.get(i).toString();
                        if (productList.contains(searchKey)) {
                            searchResult.add(productResult);
                            System.out.println(searchResult);
                        }
                    }

                } else {
                    System.out.println("Please enter more than 3 words");
                }
            } else if (choose.equals("3")) {
                System.out.println("Please enter user name for checking...");
                String userName = scanner.next();

                for (int j = 0; j <= userNameArr.length; j++) {
                    if (userName.equals(userNameArr[j])) {
                        System.out.println("Client Name:" + nameArr[j] + " Client Username:" + userNameArr[j] + " Client Address:" + addressArr[j] + "Client Phone Number:" + phoneArr[j] + "Client Password:" + passwordArr[j]);
                    }

                }

            }

        } else {
            System.out.println("Please check login informations, wrong username or password...");
        }
    }

    public static void productPrice(int productNumber, String product) {

        double price = product.discountPrice;
        double basketPrice = productNumber * price;

        if (basketPrice < 100) {
            System.out.println("5 TL delivery fee is added, because the basket amount is less than 100 TL.");
            basketPrice = basketPrice + 5;
        } else {
            System.out.println("You do not delivery fee, because the basket amount is more than 100 TL.");

        }
        System.out.println("Total Amount: " + basketPrice);

    }

    public static void productDetail(product productName) {

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
        System.out.println("Product Name:" + delicatessen5.name + " Description:" + delicatessen5.description + " Price:" + delicatessen5.price + " Discounted Price:" + delicatessen5.discountPrice);
        delicatessenArr.add(olive);

    }
}





