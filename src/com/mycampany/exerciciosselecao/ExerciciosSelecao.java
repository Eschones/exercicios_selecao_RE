package com.mycampany.exerciciosselecao;

import java.util.Scanner;

/**
 *
 * @author raphael.rosas
 */
public class ExerciciosSelecao {

    public static void main(String[] args) {
//        tipoNum();
//        numInteiros();
    }
    
    static void tipoNum(){
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Informe um numero positivo, um zero ou um numero negativo: ");
        numero = scanner.nextInt();
        
        if (numero > 0){
            System.out.println("Numero eh positivo");
        } else {
            if (numero == 0){
                System.out.println("Numero eh um zero");
            } else {
                System.out.println("Numero eh negativo");
            }
        }
        
        scanner.close();
        
    }
    
    static void numInteiros(){
        Scanner scanner = new Scanner(System.in);
        
        int n1, n2, n3, n4;
        
        System.out.println("Informe o primeiro numero: ");
        n1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        n2 = scanner.nextInt();
        System.out.println("Informe o terceiro numero: ");
        n3 = scanner.nextInt();
        System.out.println("Informe o quarto numero: ");
        n4 = scanner.nextInt();
     
        if ((n1 % 2 == 0) && (n1 % 3 == 0)){
            System.out.println("O numero " + n1 + " eh divisivel por 2 e 3");
        } else {
            System.out.println("O numero " + n1 + " nao eh divisivel por 2 e 3");
        }
        
        if ((n2 % 2 == 0) && (n2 % 3 == 0)){
            System.out.println("O numero "  + n2 +  " eh divisivel por 2 e 3");
        } else {
            System.out.println("O numero " + n2 + " nao eh divisivel por 2 e 3");
        }
        
        if ((n3 % 2 == 0) && (n3 % 3 == 0)){
            System.out.println("O numero " + n3 + " eh divisivel por 2 e 3");
        } else {
            System.out.println("O numero " + n3 + " nao eh divisivel por 2 e 3");
        }
        
        if ((n4 % 2 == 0) && (n4 % 3 == 0)){
            System.out.println("O numero " + n4 + " eh divisivel por 2 e 3");
        } else {
            System.out.println("O numero " + n4 + " nao eh divisivel por 2 e 3");
        }
        
        scanner.close();
        
    }
    
}
