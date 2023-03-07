import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Double Altura, Peso, Imc;
        
        System.out.println("Informe sua Altura? ");
        Altura = input.nextDouble();
        
        System.out.println("Informe seu peso ");
        Peso = input.nextDouble();
        

    Imc = Peso / (Altura * Altura);

        System.out.printf("Seu Imc é igual a " + (Double)Imc + "\n");
        
        if (Imc < 18.5) {
            System.out.printf ( "\n Abaixo do peso \n");
        } else if (Imc >= 18.5 && Imc <= 24.9) {
            System.out.printf  (" Peso Normal \n");
        } else if (Imc >= 25.0 && Imc <=29.9 ) {
            System.out.printf ( " Obesidade grau 1 \n");
        } else if (Imc >= 30.0 && Imc<= 34.9) {
            System.out.printf ("Obesidade grau 2 \n");
        } else {
            System.out.printf ("Obesidade grau 3 (mórbida) \n");
        }
    }
}