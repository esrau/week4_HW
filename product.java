package week4;

public class product {
    String name;
    String description;
    double price;
    double discountPrice;

    public product(){
        this.name = null;
        this.description = null;
        this.price = 0;
        this.discountPrice = 0;

    }

    product(String name, String description, double price, double discountPrice){
        this.name = name;
        this.description = description;
        this.price = price;
        this.discountPrice = discountPrice;
    }



}