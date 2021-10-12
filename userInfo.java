package week4;

import java.util.ArrayList;

public class userInfo extends user{


    public static void main(String[] args) {

        ArrayList userArr = new ArrayList();
        user user1 = new user("Ahmet", "05552909999", "İstanbul /Avcılar", "ahmet", "1234");
        userArr.add(user1);

        user user2 = new user("Mehmet", "05552909998", "Kocaeli / Gebze", "mehmet", "1234+");
        userArr.add(user2);

        user user3 = new user("Ayse", "12345", "Konya / Meram", "Ayse", "02121682898");
        userArr.add(user3);

        user user4 = new user("Fatma", "01111111111", "Ordu / Ünye", "Fatma", "A12345+");
        userArr.add(user4);

        user user5 = new user("Auspicious", "09999999999", "Samsun /Çarşamba", "hayride", "1234");
        userArr.add(user5);

    }


}
