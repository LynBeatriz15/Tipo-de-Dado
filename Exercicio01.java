import java.util.Scanner;

public class Exercicio01 {
    

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        Double Novo, Atual;

        System.out.println("Informe seu salário atual :");
        Atual = input.nextDouble();

    
        if (Atual >= 1000 &&  Atual < 2000 ){
           Novo = Atual * 1.15;
            System.out.printf("Seu novo salário é R$  \n" + Novo + " \n ");
        } else if (Atual >= 2000 && Atual < 3000) {
            Novo = Atual * 1.10;
            System.out.printf("Seu novo salário é R$ \n" + Novo + " \n ");
        }  else if (Atual >= 3000 ) {
            Novo = Atual * 1.05;
            System.out.printf("Seu novo salário é R$  \n", + Novo + " \n ");
    
        }
    }
}