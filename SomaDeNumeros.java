import java.util.Scanner;

public class SomaDeNumeros {
    

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n1, n2, soma;

        System.out.println( "informe o valor do primeiro número:");
        n1 = input.nextInt();
        
        System.out.println("informe o valor do segundo número");
        n2 = input.nextInt();

        soma = n1 + n2;

        System.out.printf("Seu primeiro número foi =" + n1);
        System.out.printf(" + " + n2);
        System.out.printf(" é igual a " + soma + "\n");
    }
}
