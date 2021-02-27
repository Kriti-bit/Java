import java.util.Scanner;
public class HelloWorld {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
    }

        //*******************************************************
    public static void part1() {

        System.out.println("Welcome To Vacation Planner");
        System.out.println("What is your Name ?  ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds like a great trip");
    }


        //*******************************************************

    public static void part2() {
        System.out.println("How many days are you going to spend travelling?");
        Integer days = input.nextInt();
        System.out.println("How much money , in USD, are you planning to spend on your trip?");
        Integer money = input.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        String symbol = input.next();
        System.out.println("How many " + symbol + " are there in 1 USD?");
        Double conversion = input.nextDouble();

        double var = (money * conversion);
        int var1 = days * 24;
        int var2 = days * 24 * 60;
        double var3 = money / days;
        double var4 = var / days;

        System.out.println("If you are travelling for " + days + " days that is the same as " + var1 + " hours or " + var2 + " minutes");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend upto $" + var3 + " USD");
        System.out.println("Your total budegt in " + symbol + " is " + var + " " + symbol + ", which per day is " + var4 + " " + symbol);
    }

        //*******************************************************

    public static void part3() {
        System.out.println("What  is the time difference, in hours, between your home and your destination? ");
        Double tdiff = input.nextDouble();
        Integer var = (tdiff+24)%24;
        Integer var2 = (var+12)%24;
        System.out.println("That means that when it is midnight at home it will be " + var + ":00 in your travel destination and when it is noon at home it will be " + var2+ ":00");
    }

   // public static void part4() {
