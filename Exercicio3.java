import java.util.Scanner;

public class Exercicio3 {
    

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int Metros, Centimetros;

        System.out.println("\n Informe os Metros:");
        Metros = input.nextInt();

        Centimetros = Metros * 100;

        System.out.printf("\n O Valor é " + Centimetros + " Cm \n");
    
    }
}