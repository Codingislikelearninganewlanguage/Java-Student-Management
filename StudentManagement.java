import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        for (; ; ) {
            int[] ids = {1245, 2034, 3049, 3029, 2934};
            int[] passwords = {2045, 4056, 9345, 2456};
            var passwordattempts = 0;
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter your student id!");
            var identered = userInput.nextInt();
            if (identered == 1245 || identered == 2034 || identered == 3049 || identered == 3029 || identered == 2934) {
                System.out.println("Welcome Please Enter Your Password");
                var passentered = userInput.nextInt();
                if (passentered == 2045 || passentered == 4056 || passentered == 9345 || passentered == 2456) {
                    System.out.println("Sucess you are logged into " + identered);
                } else {
                    for(;;){
                        System.out.println("Sorry that password was incorrect please try another password");
                        passwordattempts+=2.5;
                        identered = userInput.nextInt();
                        if (passwordattempts >= 5) {
                            System.out.println("Too Many Password Attempts Locking Up System");
                            break;
                    }
                    }




                }
            }
        }
    }
}
