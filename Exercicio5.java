import java.util.Scanner;

public class Exercicio5 {
    

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        int n1;

        System.out.println("\n Informe um número Inteiro de 1 a 7:");
        n1 = input.nextInt();


        if (n1 == 1){
            System.out.print("Segunda Feira \n");
        } else if (n1 == 2 ) {
            System.out.print("Terça-Feira\n");
        }  else if (n1 == 3 ) {
            System.out.print("Quarta-Feira\n");
        }else if (n1 == 4 ) {
            System.out.print("Quinta-Feira\n");
        }else if (n1 == 5 ) {
            System.out.print("Sexta-Feira\n");
        }else if (n1 == 6 ) {
            System.out.print("Sábado\n");
        }else if (n1 == 7 ) {
            System.out.print("Domingo\n");
        }else{ 
            System.out.print("N° Invalido, não seja burro \n");
            }
        }
    }
    
