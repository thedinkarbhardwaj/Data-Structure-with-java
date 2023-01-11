import java.util.Scanner;

public class calculate_simple_interest {

    public static void main(String[] args) {
        
        System.out.println("Calculate Simple Interest");

    
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Principal Amount");
        int principle_amount = sc.nextInt();

        System.out.println("Enter Rate of Interest");
        Float rate_of_interest = sc.nextFloat();

        System.out.println("Enter time Period"); 
        Float time = sc.nextFloat();


        Float calculate = (principle_amount*rate_of_interest*time)/100;

        System.out.println(calculate);

    }

}
