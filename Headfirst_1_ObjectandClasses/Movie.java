package Headfirst_1_ObjectandClasses;

public class Movie {
    String title;
    String genre;
    int rating;

//here we havent defined any constructor. so defauld constructor will generate.

    public void playIt(){
        System.out.println("Playing the movie : "+title);
    }
    
}
