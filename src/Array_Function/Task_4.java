package Array_Function;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int count = 0;
        int score = 0;
        System.out.println("Press Enter to continue.");
        System.out.println("Press 0 then press Enter to End the Program ");
        while(true){
            Scanner input = new Scanner(System.in);
            String enter = input.nextLine();
            if (enter.equals("")){
                double rand_num_1 = Math.random() * (max - min) + min; // Math.random() returns a random number
                // between 0 and 1; that's why used this technique
                int num1 = (int) rand_num_1;    // typecast
               // System.out.println(num1);
                if(num1==1) {
                    System.out.println("One");
                }
                else if(num1==2){
                    System.out.println("Two");
                }
                else if(num1==3){
                    System.out.println("Three");
                }
                else if(num1==4){
                    System.out.println("Four");
                }
                else if(num1==5){
                    System.out.println("Five");
                }
                else if(num1==6){
                    System.out.println("Six");
                }
                else if(num1==7){
                    System.out.println("Seven");
                }
                else if(num1==8){
                    System.out.println("Eight");
                }
                else if(num1==9){
                    System.out.println("Nine");
                }
                else{
                    System.out.println("Ten");
                }
            }
            else if(enter.compareTo("0")==0) {
                System.out.println("Random Number Generating Ended.");
                break;
            }

        }

    }
}
