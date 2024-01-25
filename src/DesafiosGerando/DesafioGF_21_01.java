package DesafiosGerando;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioGF_21_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sou o separador de caracteres, Spord!!");
        System.out.println("=========================================================");
        System.out.println("Sou capaz de identificar e Classificar os caracteres em:");
        System.out.println("1. Letras Maiúsculas");
        System.out.println("2. Letras Minúsculas");
        System.out.println("3. Números");
        System.out.println("4. Caracteres Especiais");
        System.out.println("=========================================================");
        System.out.println("Vamos começar!!!");
        System.out.println("Digite a vontade e de Enter a vontade :)");
        System.out.println("Eu só iniciarei a analise quando você escrever \"ok\" duas vezes!");


        String frase = "";

        int quantidadeNumeros = 0;
        int quantidadeEspeciais = 0;
        int quantidadeMinuscula = 0;
        int quantidadeMaiuscula = 0;
        StringBuilder sepNumeros = new StringBuilder();
        StringBuilder sepEspeciais = new StringBuilder();
        StringBuilder sepMinusculas = new StringBuilder();
        StringBuilder sepMaiusculas = new StringBuilder();


        int okCounter = 0;


        while (okCounter < 2) {

            frase = sc.nextLine().replaceAll("\\s", "");
            //Regex para qualquer espaço em branco versão curta de: [\t\n\x0B\f\r] isso resolve o problema de contabilizar o espaço como um character especial!

            if (!frase.equals("ok")) {
                for (int i = 0; i < frase.length(); i++) {
                    char character = frase.charAt(i);

                    if (Character.isUpperCase(character)) {
                        quantidadeMaiuscula++;
                        sepMaiusculas.append(character);
                    } else if (Character.isLowerCase(character)) {
                        quantidadeMinuscula++;
                        sepMinusculas.append(character);
                    } else if (Character.isDigit(character)) {
                        quantidadeNumeros++;
                        sepNumeros.append(character);
                    } else {
                        quantidadeEspeciais++;
                        sepEspeciais.append(character);
                    }
                }
                okCounter = 0;
            } else {
                okCounter++;
            }
        }



        System.out.println("Contém Letras maiúsculas: " + quantidadeMaiuscula + " Que no caso são: " + Arrays.toString(sepMaiusculas.toString().toCharArray()));
        System.out.println("Letras minúsculas: " + quantidadeMinuscula + " Que no caso são: " + Arrays.toString(sepMinusculas.toString().toCharArray()));
        System.out.println("Números: " + quantidadeNumeros + " Que no caso são: " + Arrays.toString(sepNumeros.toString().toCharArray()));
        System.out.println("Caracteres especiais: " + quantidadeEspeciais + " Que no caso são: " + Arrays.toString(sepEspeciais.toString().toCharArray()));

        sc.close();
    }
}
