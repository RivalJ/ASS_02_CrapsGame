import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int die1 = 0;
        int die2 = 0;
        int dieSum = 0;
        int pointSum = 0;

        boolean playGame = true;
        boolean done = false;

        System.out.println("Hello, welcome to Craps");
        //play game loop
        do{

            playGame = SafeInput.getYNconfirm(in, "Would you like to play Craps?");

            pointSum = 0;
            // craps loop
            if(playGame) {
                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    dieSum = die1 + die2;

                    System.out.println("die1: " + die1 + "\t die2: " + die2);

                    switch (dieSum) {
                        case 2:
                        case 3:
                        case 12:
                            System.out.println("Player Loss: ");
                            System.out.println("\t craps: " + dieSum);
                            done = true;
                            break;
                        case 7:
                        case 11:
                            System.out.println("Player win: ");
                            System.out.println("\t natural: " + dieSum);
                            done = true;
                            break;
                        default:
                            System.out.println("point: " + dieSum);
                            pointSum += 1;
                            System.out.println(" ");
                            break;
                    }


                } while (!done);
                System.out.println("\t point score: " + pointSum);
            }
        }while(playGame);
        System.out.println("Goodbye");
    }
}