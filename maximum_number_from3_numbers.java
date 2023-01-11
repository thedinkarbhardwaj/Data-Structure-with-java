import java.util.Scanner;

public class maximum_number_from3_numbers {
    
    public static void main(String[] args) {
        
        System.out.println("Find Maximum number from 3 numbers");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        Float a = scanner.nextFloat();

        System.out.println("Enter Second number");
        Float b = scanner.nextFloat();

        System.out.println("Enter Third number");
        Float c = scanner.nextFloat();

        if(a>b){

            if(a>c){
                System.out.println("A is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }
        else{
            if(b>c){
                System.out.println("B is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }

    }
}
