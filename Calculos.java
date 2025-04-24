package com.mycompany.calculos;

public class Calculos {

    public static void main(String[] args) {

        double num1 = 10.75; // Comporta números com duas casas após a vírgula   
        double num2 = 40.98;
        double Pi = 3.14;
        int Quadrado = 6; // Números inteiros 
        int AlturaRetangulo = 5;
        int BaseRetangulo = 8;
        int BaseTriangulo = 9;
        int AlturaTriangulo = 5;
        int Diagonal = 10;
        int Diagonal_2 = 2;
        int Raio = 5;
                
        // Cálculos
        double Soma = num1 + num2;
        double Subtracao = num1 - num2;
        double Multiplicacao = num1 * num2;
        double Divisao = num2 != 0 ? num1 / num2 : Double.NaN; // != diferente de, exemplo num2 != 0 ? 
        int Resto = (int)(num1 % num2); // Mudança para 'int', pois o operador '%' retorna um inteiro
        double Media = Soma / 2;
        int Area = Quadrado * Quadrado;
        int AreaRetangulo = AlturaRetangulo * BaseRetangulo;
        int AreaTriangulo = (BaseTriangulo * AlturaTriangulo) / 2; // Mantendo a fórmula correta de área do triângulo
        int AreaLosango = Diagonal * Diagonal_2 / 2;   
        double AreaCircunferencia = Raio * Raio * Pi;

        // Mostrar na tela o valor dos cálculos
        System.out.println("A soma: " + Soma);
        System.out.println("A Subtracao: " + Subtracao);
        System.out.println("A Multiplicacao: " + Multiplicacao);
        System.out.println("A Divisao: " + Divisao);
        System.out.println("O Resto: " + Resto); // Corrigido o 'o' para 'O' na frase
        System.out.println("A Media: " + Media);
        System.out.println("A área do Quadrado: " + Area);
        System.out.println("A área do Retângulo: " + AreaRetangulo);
        System.out.println("A área do Triângulo: " + AreaTriangulo);
        System.out.println("A área do Losango: " + AreaLosango);
        System.out.println("A área da Circunferência: " + AreaCircunferencia);
    }
}
