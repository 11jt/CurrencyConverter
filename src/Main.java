import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        exchangeHandler();
    }

    private static double exchangeUsdToCad(double USD) {
        // 1 usd = 1.39845 cad
        return USD * 1.39845;
    }

    private static double exchangeCadToUsd(double CAD) {
        // 1 cad = 0.71508 usd
        return CAD * 0.71508;
    }

    private static void exchangeHandler() {
        Scanner conversionChecker = new Scanner(System.in);

        System.out.println("Please enter your currency.");
        String typeOfCurrency = conversionChecker.nextLine();

        if (!typeOfCurrency.equalsIgnoreCase("cad") && !typeOfCurrency.equalsIgnoreCase("usd")) {
            System.out.println("Invalid currency");
            return;
        }

        System.out.println("What is your current money?");
        double value = conversionChecker.nextDouble();

        if (typeOfCurrency.equalsIgnoreCase("usd")) {
            System.out.println(exchangeUsdToCad(value) + " CAD");
        }
        if (typeOfCurrency.equalsIgnoreCase("cad")) {
            System.out.println(exchangeCadToUsd(value) + " USD");
        }
    }
}