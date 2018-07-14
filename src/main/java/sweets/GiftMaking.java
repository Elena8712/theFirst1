package sweets;

import java.util.Scanner;

public class GiftMaking {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        GiftBox gift = new GiftBox();
        gift.addSweets(); //добавление конфет в подарок
        gift.addSweets();
        gift.addSweets();
        gift.printResult();
        // нужен ли метод для удаления
    }
}
