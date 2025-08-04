import java.util.Scanner;

public  class CurrencyConverter {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");
        System.out.println("1. GBP to Rupee");
        System.out.println("2. Rupee to GBP");
        System.out.println("3. RUB to Rupee");
        System.out.println("4. Rupee to RUB");
        System.out.println("Enter your choice(1 or 2 or 3 or 4)");
        int choice = scanner.nextInt();


        if (choice == 1) {
            System.out.println("Enter the amount in GBP");
            double GBP = scanner.nextDouble();
            double Rupee = GbpToRupee(GBP);
            System.out.println("Converted amount in Rupee:" + Rupee);
        } else if (choice == 2) {
            System.out.println("Enter the amount in Rupee");
            double Rupee = scanner.nextDouble();
            double GBP = RupeeToGbp(Rupee);
            System.out.println("Converted amount in GBP:" + GBP);
        } else if (choice == 3) {
            System.out.println("Enter the amount in RUB");
            double AUB = scanner.nextDouble();
            double Rupee = aubToRupee(AUB);
            System.out.println("Converted amount in Rupee: + Rupee");
        } else if (choice == 4) {
            System.out.println("Converted amount in Rupee");
            double Rupee = scanner.nextDouble();
            double AUB = RupeeToAub(Rupee);
            System.out.println("Converted amount in AUB: + AUB");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2 or 3 or 4");
        }

        scanner.close();
    }

    public static double GbpToRupee(double GBP) {
        return GBP * 67.56;
    }

    public static double RupeeToGbp(double Rupee) {
        return Rupee * 2.5678;
    }

    public static double aubToRupee(double AUB) {
        return AUB * 48.90;
    }

    public static double RupeeToAub(double Rupee) {
        return Rupee * 5.656;
    }


}








