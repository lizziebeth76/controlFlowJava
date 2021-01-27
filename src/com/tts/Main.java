package com.tts;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {



        System.out.println("Welcome to We Scam your Info's Sweepstakes Site!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");  //type a word and hit enter
        String someString = scanner.nextLine();
        System.out.println("Hello " + someString + "! Thanks for visiting our site!");
        System.out.println("The interactive portion of our site can generate a magical powerball number ");
        System.out.println("that you can use to enter our contest, using your responses to a very special set of questions. ");
        System.out.println("Would you like to continue to the interactive portion? Please type yes, or no: ");
        String newString = scanner.nextLine();


        if (newString.equalsIgnoreCase("yes") || newString.equalsIgnoreCase("y")) {
            System.out.println("Great! Let's do it!");
        } else {
            System.out.println("Y'all come back another time to complete our survey!");
            System.exit(0);
        }
            System.out.println("Is your car red? Please type: yes, or no: ");
            String nextString = scanner.nextLine();

            if (nextString.equalsIgnoreCase("yes") || nextString.equalsIgnoreCase("y"))
            {
                System.out.println("Awesome! Did you know Cary Grant drove a red car in \"To Catch a Thief\"?");
            }
            else {
                System.out.println("Phew! Did you know that people who drive red cars are more likely to be rude? It's Science.");
            }
            System.out.println("What is the name of your favorite child?");
            String petString = scanner.nextLine();

            System.out.println("How old is your favorite child?");
            String kidString = scanner.nextLine();

            System.out.println("What is your lucky number?");
            String luckyString = scanner.nextLine();

            System.out.println("Do you like American football? Answer 'no,' or you will be booted from our survey: ");
            String footballString = scanner.nextLine();

            if (footballString.equalsIgnoreCase("no") || footballString.equalsIgnoreCase("n")){
                System.out.println("Oh, good! I had a feeling you were going to stay in the game!");
            }
            else {
                System.out.println("Thanks for trying out our survey! No powerball entry for you!");
                System.exit(0);
            }
            System.out.println("What is the two-digit model year of your car?");
            Integer modelInt = scanner.nextInt();

            System.out.println("Can you tell me the first name of your favorite actress?");
            String actressString = scanner.nextLine();

            System.out.println("Enter a random number between 1 and 50");
            String userRandomString = scanner.nextLine();

            System.out.println("Now, our magical interface will use your private details to generate the powerball number that will be your entry to the contest! *Note, we may also use your private data to open credit cards in your name! You'll have more credit cards - it'll be great!");

//        AsciiChars.printNumbers();
//        AsciiChars.printLowerCase();
//        AsciiChars.printUpperCase();

        char firstLetter = actressString.charAt(0);
        int intOne = (int) firstLetter;
        System.out.println(intOne);

        String modelString = modelInt.toString();
        char secondLetter = modelString.charAt(1);
        System.out.println((int)secondLetter);



        }
    }
//FOR THE POWERBALL STUFF, DO THIS OVER AND OVER:
    //String favActor = "Aretha";
//CONVERT THE FIRST LETTER OF FAVACTOR AND CONVERT TO AN INTEGER
//char firstLetter = favActor.charAt(0);
//CAST IT TO AN
//int intOne = (int) firstLetter:
//TAKES "A" AND CONVERTS TO ITS ASCI VALUE




