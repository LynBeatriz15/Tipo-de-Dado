import java.util.Scanner;

public class Exercicio4 {
    

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int Idade, Idade2;
        String Nome, Nome2;
    

        System.out.println("Informe o nome da primeira pessoa:");
        Nome = input.next();
        System.out.println("Informe Sua Idade");
        Idade = input.nextInt();

        System.out.println("Informe o nome da Segunda pessoa:");
        Nome2 = input.next();
        System.out.println("Informe Sua Idade");
        Idade2 = input.nextInt();

        System.out.printf("Seu Nome é " + Nome + "\n");
        System.out.printf("\n Sua Idade é " + Idade  + "\n");

        System.out.printf("\n" + "Seu Nome é " + Nome2  + "\n");
        System.out.printf("\n Sua Idade é " + Idade2  + "\n");

        if (Idade > Idade2 ){
            System.out.print("\n" + Nome + " É mais velho(a) que \n" + Nome2 + "\n");
        } else if (Idade2 > Idade ){
            System.out.print("\n" + Nome2 + " É mais velho(a) que \n" + Nome + "\n" );
        }
    }
}