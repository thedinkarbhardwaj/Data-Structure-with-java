import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class program_of_prime_number {
    public static void main(String[] args) {
        
        System.out.println("Prime Number Program");

        Scanner scanner = new Scanner(System.in);

        int enter_number = scanner.nextInt(); // 4

        int div = 2;

        boolean primecheck = false;

        
        
        while(div<enter_number){

            if(enter_number%div == 0){
                System.out.println("Not prime Number");
                primecheck = false;
                break;
            }
            else{
                div = div+1;
                primecheck = true;
            }

        }

        if(primecheck == true){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime");
        }
    

    }
}
