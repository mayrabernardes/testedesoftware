/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

import java.util.Scanner;
import java.lang.*;


public class App {
    public String getGreeting() {
        return "Entrega 2";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Scanner number = new Scanner(System.in); //Criação de Scanner para receber input do usuario
		System.out.println("\nConversao de metros inteiros para milimetros no intervalo de 1 a 999999\n");
        System.out.println("\nDigite um valor inteiro positivo em metros:");
        Integer n = number.nextInt(); //Lê valor do usuário
        Conversion con = new Conversion(); //Instancia classe de conversao
        System.out.printf("\nValor em milimetros: %d\n", con.toMillimeters(n)); //Imprime o resultado da funcao
    }
}
