import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int turn = 1;
        double n1;
        double n2;


            System.out.println("-------------------------");
            System.out.println("Welcome to a calculator!");
            System.out.println("-------------------------");

            
        while (turn > 0) {

            try{
                System.out.println("Enter a first number");
                n1 = sc.nextDouble();

                System.out.println("Enter a second number");
                n2 = sc.nextDouble();
            }
            catch(InputMismatchException e){
                throw new InputMismatchException("Number invalid, enter only numbers");
            }

            System.out.println("-------------------------");

            System.out.println("Choose a operation math");
            System.out.println("(1) - SUM + ");
            System.out.println("(2) - SUB -");
            System.out.println("(3) - Div /");
            System.out.println("(4) - Mult * ");
            
            int chooseUser = sc.nextInt();
            double resultMath;
            System.out.println("");

            switch (chooseUser) {
                case 1:
                    resultMath = n1 + n2;
                    System.out.println("Sum: " + resultMath);
                    break;

                case 2:
                    resultMath = n1 - n2;
                    System.out.println("Sub: " + resultMath);
                    break;

                case 3:
                    resultMath = n1 / n2;
                    System.out.printf("Div: %.2f%n", resultMath);
                    break;

                case 4:
                    resultMath = n1 * n2;
                    System.out.println("Mult: " + resultMath);
                    break;
            
                default:
                    System.out.println("Operation math is invalid, choose another option!");
                    break;
            }

            System.out.println("Do you want to quit? (1) Yes -- (2) No");
            int chooseUserToQuit = sc.nextInt();

            if(chooseUserToQuit == 1){
                System.out.println("Thanks!");
                sc.close();
                break;
            }else if(chooseUserToQuit == 2){
                turn++;
            }else{
                throw new Exception("Invalid choice, exiting the calculator!");
            }
           
            System.out.println();
        }    

        sc.close();
    }
}