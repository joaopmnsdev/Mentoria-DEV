import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to a calculator!");
        System.out.println("Choose a first number ");
        Double n1 = sc.nextDouble();

        System.out.println("Chosse a Second number ");
        Double n2 = sc.nextDouble();

        System.out.println("Sum: " + (n1 + n2));
        System.out.println("Sub: " + (n1 - n2));
        System.out.println("Mult: " + (n1 * n2));
        System.out.println("Div: " + (n1 / n2));
       
        sc.close();

    }
}
