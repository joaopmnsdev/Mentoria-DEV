import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        int turn = 1;

            System.out.println("-------------------------------------");
            System.out.println("Welcome to a conversor of temperature");
            System.out.println("-------------------------------------");


       while (turn>0){

            System.out.println("Enter the value to convert");
            double value = sc.nextDouble();
            sc.nextLine();

            System.out.println("");

            System.out.println("What type of your value");
            System.out.println("(C) - Celsius // (F) - Fahrenheit // (K) - Kelvin");
            String choiceCurrent = sc.nextLine().trim().toUpperCase();

            System.out.println("");

            System.out.println("Choose the type do you want to convert");
            System.out.println("(C) - Celsius // (F) - Fahrenheit // (K) - Kelvin");
            String choiceConvert = sc.nextLine().trim().toUpperCase();


            System.out.println("------------------");

            //Celsius -> Fahrenheit & Kelvin
            if (choiceCurrent.equals("C") && choiceConvert.equals("F")) {
                double fahrenheit = (value * 1.8 + 32);
                System.out.println("Celsius to Fahrenheit " + fahrenheit + " °F");
            } 
            else if (choiceCurrent.equals("C") && choiceConvert.equals("K")) {
                double kelvin = (value + 273.15);
                System.out.println("Celsius to Kelvin " + kelvin + " K");
            } 

            //Fahrenheit -> Celsius & Kelvin
            else if (choiceCurrent.equals("F") && choiceConvert.equals("C")) {
                double celsius = (value - 32) / 1.8; 
                System.out.println("Fahrenheit to Celsius " + celsius + " °C");
            } 
            else if(choiceCurrent.equals("F") && choiceConvert.equals("K")){
                double kelvin = (value - 32) * 5 / 9 + 273.15;
                System.out.println("Fahrenheit to kelvin " + kelvin + " K");
            }

            //Kelvin -> Fahrenheit & Celsius
            else if (choiceCurrent.equals("K") && choiceConvert.equals("F")) {
                double fahrenheit = (value - 273.15) * 9 / 5 + 32;
                System.out.println("Kelvin to Fahrenheit " + fahrenheit + " °F");
            } 
            else if(choiceCurrent.equals("K") && choiceConvert.equals("C")){
                double celsius = (value - 273.15);
                System.out.println("Kelvin to Celsius" + celsius + " °C");
            }


            System.out.println("------------------");
            System.out.println("Do you want to continue? (1) - Yes // (2) - No");
            System.out.println("------------------");
            int continueOrNot = sc.nextInt();

            if (continueOrNot == 1) {
                turn++;
            }else{
                sc.close();
                break;
            }

        }

        sc.close();
    }
}
