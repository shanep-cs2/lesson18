package lesson;

import java.util.List;
import java.util.Scanner;

/**
 * DO NOT MODIFY
 */
public class App {

    public static void main(String[] args) {
        //Do not modify the main method!
        Scanner scanner = new Scanner(System.in);
        List<Item> items = MyItem.parseItems(scanner);
        for(Item i : items){
            System.out.println(i);
        }
    }
}
