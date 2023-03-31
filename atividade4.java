import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = input.nextLine();
        
        char[] chars = original.toCharArray();
        int inicio = 0;
        int fim = chars.length - 1;
        
        while (fim > inicio) {
            char temp = chars[inicio];
            chars[inicio] = chars[fim];
            chars[fim] = temp;
            inicio++;
            fim--;
        }
        
        String invertida = new String(chars);
        
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}