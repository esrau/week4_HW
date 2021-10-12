package week4;

public class categories {

    public class mainCategories extends categories {
        String[] mainCategories = {"Fruit & Vegetable", "Snack", "Breakfast"};
    }

    public class subCategories extends mainCategories {
        String[] subCategories = {"Fruit", "Vegetable", "Chips", "Chocolate", "Milk", "Delicatessen"};
    }

    public class products extends subCategories {
        String[] products = {"Apple", "Pear", "Grape", "Tomato", "Pepper", "Eggplant", "Lays", "Doritos", "Ruffles", "Tadelle", "Albeni", "Metro", "Hobby", "Full-fat", "Low-fat", "Lacto-free", "Cheddar", "Cheese", "Salami", "Sausage", "Olive"};

    }
}
