package Array_Function;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        int[] notes = new int[]{ 1000, 500, 200, 100, 50, 20, 10, 5, 2};
        int[] Counter = new int[9];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = input.nextInt();

        for (int i = 0; i <= 8; i++) {
            if (amount >= notes[i]) {
                Counter[i] = amount / notes[i];
                amount = amount - Counter[i] * notes[i];
            }
        }

        System.out.println("Minimum number of currency notes to sum of this amount: ");
        for (int i = 0; i <= 8; i++) {
            if (Counter[i] != 0) {
                System.out.println(notes[i] + " : " + Counter[i]);
            }
        }
        if(amount==1){
            System.out.println("1 Tk. note not available. Sorry!");
        }
    }
}
