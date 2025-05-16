import java.util.Scanner;

public class FibDemo {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Voer in 'n getal: ");
        int getal = scanner.nextInt();
        scanner.nextLine();
        int voorige = 0;
        int huidige = 1;
        Fibonacci(getal,huidige,voorige);
    }

    public static void Fibonacci(int getal, int huidige, int voorige){

        if(getal == huidige){
            System.out.print(getal);
        } else if(huidige < getal){
            System.out.print(huidige+" ");
            Fibonacci(getal,huidige+voorige,huidige);
        } else {
            return;
        }

    }
    
}