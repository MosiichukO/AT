package Randomizer;

import java.util.Scanner;


public class Randomizer {
    int minNumber = 0;
    int maxNumber = 0;
    public String login = "Oleksandr";
    public Scanner scanner;

    public static void main(String[] args) {
//        Randomizer a = new Randomizer();
//        a.checklogin("");


        Randomizer a = new Randomizer();
        a.login("");

        Randomizer b = new Randomizer();
        b.game ();

    }

//    public Randomizer (String login) {
//        this.login = login;
//        this.scanner = new Scanner(System.in);
//    }

    private void login (String hi) {

        System.out.println("Hello " + login);
    }

    public void game() {

        System.out.println("Enter min number: ");
        Scanner number1 = new Scanner(System.in);
        minNumber = number1.nextInt();
        System.out.println("Enter max number: ");
        Scanner number2 = new Scanner(System.in);
        maxNumber = number2.nextInt();
        if (minNumber < 0 || maxNumber > 500) {
            throw new IllegalArgumentException("wrong number");
        }
        System.out.println("Your min number = " + minNumber + "; your max number = " + maxNumber);

        this.scanner = new Scanner(System.in);
        boolean isRunning = true;
        int[] array = new int[maxNumber - minNumber + 1];
        int index = 0;
        while (isRunning) {
            System.out.println("Choose the command: generate, help or exit");
            String command = scanner.next();
            if (command.equals("generate")) {
                int randomNumber = minNumber + (int) (Math.random() * maxNumber);
                array[index++] = randomNumber;
                System.out.println("Your random number = " + randomNumber);
            } else if (command.equals("exit")) {
                System.out.println("I will wait for next meeting, " + login);
                isRunning = false;
            } else if (command.equals("help")) {
                System.out.println("Command generate - generating random number");
                System.out.println("Command exit - quit the game");
            } else if (command.equals("switch")) {
                game();
            } else {
                System.out.println("Wrong command was entered, please try again");
            }
        }
    }

}


