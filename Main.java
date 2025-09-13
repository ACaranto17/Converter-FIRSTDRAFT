import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("[Conversion Menu]");

        int choice, ans;
        String response = "";

        do {

            System.out.println("What would you like to do?");
            System.out.println("1) Temperature Conversion\n2) Weight Conversion\n3) Currency Conversion\n4) Time conversion");

            choice = input.nextInt();

            switch (choice) {
                case 1:     // Temperature Conversion
                    TempConversion temp = new TempConversion();

                    System.out.println("What Temperature Conversion:\n1) Celsius to Fahrenheit\n2) Fahrenheit to Celsius");
                    ans = input.nextInt();

                    switch (ans) {
                        case 1:
                            System.out.print("Input Celsius: ");
                            float celsius = input.nextFloat();
                            temp.setCelsius(celsius);

                            System.out.println(temp.getCelsius() + " degrees Celsius is equal to " + temp.celsiusToFahrenheit(celsius) + " degrees Fahrenheit");
                            System.out.println("Would you like to return to the menu? (Yes/No)");
                            response = input.next();

                            break;
                        case 2:
                            System.out.print("Input Fahrenheit: ");
                            float fahrenheit = input.nextFloat();
                            temp.setFahrenheit(fahrenheit);

                            System.out.println(temp.getFahrenheit() + " degrees Fahrenheit is equal to " + temp.fahrenheitToCelsius(fahrenheit) + " degrees Celsius");
                            System.out.println("Would you like to return to the menu? (Yes/No)");
                            response = input.next();

                            break;
                    }
                    break;

                case 2:     // Weight Conversion
                    WeightConversion weight = new WeightConversion();

                    System.out.println("What Weight Conversion:\n1) Pounds to Kilograms\n2) Kilograms to Pounds");
                    ans = input.nextInt();

                    switch (ans) {
                        case 1:
                            System.out.print("Input Pounds: ");
                            float pounds = input.nextFloat();
                            weight.setPounds(pounds);

                            System.out.printf("%,.2f lbs is equal to %,.2f kgs%n", weight.getPounds(), weight.poundToKilogram(pounds));
                            System.out.println("Would you like to return to the menu? (Yes/No)");
                            response = input.next();

                            break;
                        case 2:
                            System.out.print("Input Kilograms: ");
                            float kilograms = input.nextFloat();
                            weight.setKilograms(kilograms);

                            System.out.printf("%,.2f kgs is equal to %,.2f lbs%n", weight.getKilograms(), weight.kilogramToPound(kilograms));
                            System.out.println("Would you like to return to the menu? (Yes/No)");
                            response = input.next();

                            break;

                    }
                    break;

                case 3:     // Currency Conversion

                    CurrencyConversion money = new CurrencyConversion();
                    System.out.println("What currency conversion:\n1) Dollars to Euros\n2) Euros to Dollars\n3) Philippine Peso to Dollars\n4) Dollars to Philippine Peso");
                    ans = input.nextInt();

                    switch (ans) {
                        case 1:
                            System.out.print("Input Dollar amount: ");
                            double dollars = input.nextDouble();
                            money.setDollars(dollars);

                            System.out.println("$" + money.getDollars() + " is €" + money.dollarToEuro(dollars));
                            System.out.println("Would you like to return to the menu? (Yes/No)");
                            response = input.next();

                            break;
                        case 2:
                            System.out.print("Input Euro amount: ");
                            double euro = input.nextDouble();
                            money.setEuros(euro);

                            System.out.println("€" + money.getEuros() + " is $" + money.euroToDollars(euro));
                            System.out.println("Would you like to return to the menu? (Yes/No)");
                            response = input.next();

                            break;
                        case 3:
                            System.out.print("Input Peso amount: ");
                            double peso = input.nextDouble();
                            money.setPeso(peso);

                            System.out.println("PHP " + money.getPeso()+" is $"+money.pesoToDollar(peso));
                            System.out.println("Would you like to return to the menu? (Yes/No)");
                            response = input.next();

                            break;
                        case 4:
                            System.out.print("Input Dollar amount: ");
                            dollars = input.nextDouble();
                            money.setDollars(dollars);

                            System.out.printf("$%,.2f is PHP %,.2f%n", money.getDollars(), money.dollarToPeso(dollars));
                            System.out.println("Would you like to return to the menu? (Yes/No)");
                            response = input.next();

                            break;

                    }
                    break;

                case 4: // Time Conversion
                    int hour, minute, second;
                    System.out.println("Select the time zone:\n1) EST\n2) CST\n3) PST ");
                    ans = input.nextInt();

                    do {

                        System.out.print("Enter the hour: ");
                        hour = input.nextInt();

                        if (hour > 12 || hour < 1) {
                            System.out.println("Invalid time, try again!");
                        }

                    } while (hour > 12 || hour < 1);

                    do {

                        System.out.print("Enter the minute: ");
                        minute = input.nextInt();

                        if (minute > 59 || minute < 0) {
                            System.out.println("Invalid time, try again!");
                        }

                    } while(minute > 59 || minute < 0);

                    do {

                        System.out.print("Enter the second: ");
                        second = input.nextInt();

                        if (second > 59 || second < 0) {
                            System.out.print("Invalid time, try again!");
                        }

                    } while (second > 59 || second < 0);

                    TimeConversion time = new TimeConversion(hour, minute, second);
                    System.out.println(time.getHour() + ":" + time.getMinute()+":"+time.getSecond());

                    break;

                default:
                    System.out.println("Invalid input, try again!");
                    break;
            }

        } while (response.equalsIgnoreCase("Yes") || choice > 4); //(choice != 4);

        if (!response.equalsIgnoreCase("Yes")) {
            System.out.print("Thank you for using my conversion program!");
        }

    }
}
/*
System.out.println("Would you like to return to the menu? (Yes/No)");
String response = in.nextLine();
*/
