package com.company;
import java.util.Scanner;

public class Main {
    // Create a program that asks the user for his/her fullname,
    // sex(female or male) and if he/she has a plus one. Make use of methods to do the following:
    // if the user comes alone, greet them to welcome them to the party (include salutation).
    // If he/she is with a plus one, greet them both. Use overloading.

    static String userInput(String A, String B){
        return "";
    }

    static String userInput(){
        Scanner sc = new Scanner(System.in);
        String sex;

        System.out.println( "What is your gender (M or F): " );
        sex = sc.next();

        switch(sex.charAt(0)){
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Error. Please Enter M or F only");
                break;
        }
        return sex;
    }

    public static void main( String[] args )
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("=======================================================================");
            System.out.println( "First Name: " );
            String fname = sc.next();
            System.out.println( "Last Name: " );
            String lname = sc.next();
            userInput(fname,lname);
            String Sex = userInput();
            System.out.println();
            String plusOne;
            System.out.println( "Are you accompanied by someone? (Press Y if Yes and N if otherwise): " );
            plusOne = sc.next();
            System.out.println();
            System.out.println("=======================================================================");

            switch(plusOne.charAt(0)){ //change prints to salutations and add name in no
                case 'y':
                case 'Y':
                    System.out.println("Welcome " + fname + " " + lname + " and company! We are glad to have you here today.");
                    break;
                case 'n':
                case 'N':
                    System.out.println("Welcome to the party " + fname + " " + lname + "! I hope you have a great time.");
                    break;
                default:
                    System.out.println("Error. Please Enter Y or N only");
                    break;
            }
        }catch (Exception ime){
            System.out.println("Please enter only the required letters/words");
        }
    }
}
