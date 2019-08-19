/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe07;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exe07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Classe Scanner deve ser importada de 
        dentro do pacote java.util.Scanner */
        /* Definir um objeto 'entrada' de classe Scanner
        usando a palavra reservada NEW */
        
        String nome = "Moraes";
        Scanner entrada = new Scanner(System.in);
        
        /* Criar um programa que receba ENTRADA de 2 (dois
        valores (num1 e num2) e verifique qual o maior e o menor
        numero entre os dois */
        
        int num1, num2;
        
        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt ();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt ();
        
        // Valor atribuidos a num1 e num2
        
        System.out.println("Valor NUM1: " + num1);
        System.out.println("Valor NUM2: " + num2);
        
        // Comparação usando IF ELSE
        if (num1 > num2){
            System.out.println("Maior número é: " + num1);
            System.out.println("Menor número é: " + num2);
        }
        else{
            System.out.println("Maior número é: " + num2);
            System.out.println("Menor número é: " + num1);

        }
    }
        
}
