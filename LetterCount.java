package letterCount;

import java.util.Scanner;

public class LetterCount
{
    static int count;
    static String sentence;
    static char letter;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        input();
        count();
        answer();
    }
    static void input(){
        System.out.print("Enter Sentence:");
        sentence = sc.nextLine().toLowerCase();
        System.out.print("Enter letter:");
        letter=sc.nextLine().toLowerCase().charAt(0);
    }
    static void count(){
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==letter){
                count++;
            }
        }
    }
    static void answer(){
        System.out.println("The letter occurred " + count + " time/s");
        System.out.println("""
                +-----------------------------------+
                | Made by: Chris Daniel B. Cayabyab |
                +-----------------------------------+""");
    }
}