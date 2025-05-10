package Headfirst_1_ObjectandClasses;

public class MovieTest {
    public static void main(String [] args){
        Movie one =new Movie();   //creating object based on blueprint that is class.
        one.title="tere naam";
        one.genre="love story";
        one.rating=5;
        one.playIt();

        //creating another object based on blueprint

        Movie two=new Movie();
        two.title="Hit";
        two.genre="Mystri";
        two.rating=-3;
        two.playIt();

        
    }
    
}
