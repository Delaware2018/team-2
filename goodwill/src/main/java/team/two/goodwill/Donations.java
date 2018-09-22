package team.two.goodwill;

import java.util.Scanner;


public class Donations {

    // Shows what can and cannot be donated.

    public int numberOfItems(){

        Scanner reader = new Scanner(System.in);
        System.out.println("How many items are being donated?");
        String answer = reader.next();
        int i = reader.nextInt();

        return i;
    }
}
