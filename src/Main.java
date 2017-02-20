import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Computations computations = new Computations();
        promptLetter();

    }

    public static int doComputation(String letter, int i, int j){
        Computations computations = new Computations();
        switch(letter){
            case "a" : return computations.add(i, j);

            case "s" : return computations.subtract(i,j);

            case "m" : return computations.multiply(i,j);

            case "d" : return computations.divide(i, j);

            default : return 0;
        }
    }

    public static void promptLetter(){
        System.out.println("What would you like to do? a=add s=subtract m=multiply d=divide: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        getNumbers(userInput);

    }

    public static void getNumbers(String userInput){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter another number");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("result: " + doComputation(userInput, num1, num2));
    }
}
