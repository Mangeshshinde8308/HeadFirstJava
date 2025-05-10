package Headfirst_3_Guessinggame;

import java.util.Scanner;

public class Player {
    int number;

    public void guess(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Player please Enter your No");
    
        number=sc.nextInt();
        
        System.out.println("I am guessing..."+number);
    }
}
