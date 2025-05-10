package Headfirst_3_Guessinggame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){

       // Create three Player objects and instance variables.
        p1=new Player();
        p2=new Player();
        p3=new Player();

      //  Declare three variables to hold the three guesses the Players make. 
      int guessp1=0;
      int guessp2=0;
      int guessp3=0;

     
    // Declare three variables to hold a true or false based on the player’s answer.
       
    boolean p1IsRight=false;
    boolean p2IsRight=false;
    boolean p3IsRight=false;

    int targetNumber=(int) (Math.random() *10);
    System.out.println("I am thinking about number between 0 to 9....");
     
    while(true){
        System.out.println("Number to guess is :"+targetNumber);

        p1.guess();
        p2.guess();
        p3.guess();

        guessp1=p1.number;
        System.out.println("Palyer one Guessed...."+guessp1);
        guessp2=p2.number;
        System.out.println("Palyer two Guessed...."+guessp2);
        guessp3=p3.number;
        System.out.println("Palyer three Guessed...."+guessp3);

        if (guessp1==targetNumber){
            p1IsRight=true;

        }
        if(guessp2==targetNumber){
            p2IsRight=true;
        }
        if(guessp3==targetNumber){
            p3IsRight=true;
        }

        if(p1IsRight || p2IsRight || p3IsRight){
            System.out.println("yeh....we have winner");
            System.out.println("Player one got it right? " + p1IsRight);
            System.out.println("Player two got it right? " + p2IsRight);
            System.out.println("Player three got it right? " + p3IsRight);
            System.out.println("Game is over.");
            break; //we can use brake statemmet inside switch block and 
        }else
        {
            System.out.println("Bad luck.......");
            System.out.println("No one guessed right");
            System.out.println("play again");
        }
     }
    


    }
}
