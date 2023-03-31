import java.util.Scanner;
public class Main
{   
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int n, a = 0, b = 1, c = 1;
        boolean pertence = false;
        
        System.out.print("Digite um número inteiro positivo: ");
        n = input.nextInt();
        
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        
        if (c == n) {
            pertence = true;
        }
        
        if (pertence) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }
        
        input.close();
	}
}