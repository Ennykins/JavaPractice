package JavaForEveryone;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the price for a six-pack: ");
        double packPrice = in.nextInt();

        System.out.println("Please enter the volume for each can (in ounces): ") ;
        double canVolume = in.nextDouble();

        final double CANS_PER_PACK = 6;
        double packVolume = canVolume * CANS_PER_PACK;

    }
}
