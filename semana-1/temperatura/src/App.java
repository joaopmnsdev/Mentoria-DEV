import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to a conversor of temperature");
        System.out.println("Enter the value in Celsius to convert a Fahrenheit and Kelvin");
        Double value = sc.nextDouble();

        Double fahrenheit = (value * 1.8 + 32);
        Double kelvin = (value + 273.15);

        System.out.println("------------");
        System.out.println("Fahrenheit " + fahrenheit + " F");
        System.out.println("Kelvin " + kelvin + " K");

        sc.close();
    }
}
