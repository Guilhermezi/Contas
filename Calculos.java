/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Calculos {

    public static void main(String[] args) {
        
        double num1 = 10.75; // números com casas decimais
        double num2 = 40.98;
        double Pi = 3.14;
        
        int Quadrado = 6; // números inteiros
        int AlturaRetangulo = 5;
        int BaseRetangulo = 8;
        int BaseTriangulo = 9;
        int AlturaTriangulo = 5;
        int Diagonal = 10;
        int Diagonal_2 = 2;
        int Raio = 5;

        // Cálculos aritméticos
        double Soma = num1 + num2;
        double Subtracao = num1 - num2;
        double Multiplicacao = num1 * num2;
        double Divisao = num2 != 0 ? num1 / num2 : Double.NaN;
        double Resto = num1 % num2;
        double Media = Soma / 2;

        // Cálculos geométricos
        int AreaQuadrado = Quadrado * Quadrado;
        int AreaRetangulo = AlturaRetangulo * BaseRetangulo;
        int AreaTriangulo = (BaseTriangulo * AlturaTriangulo) / 2;
        int AreaLosango = (Diagonal * Diagonal_2) / 2;
        double AreaCircunferencia = Raio * Raio * Pi;

        // Exibição dos resultados
        System.out.println("\n=== Operações Aritméticas ===");
        System.out.println("Soma: " + Soma);
        System.out.println("Subtração: " + Subtracao);
        System.out.println("Multiplicação: " + Multiplicacao);
        System.out.println("Divisão: " + Divisao);
        System.out.println("Resto: " + Resto);
        System.out.println("Média: " + Media);

        System.out.println("\n=== Áreas de Figuras Geométricas ===");
        System.out.println("Área do Quadrado: " + AreaQuadrado);
        System.out.println("Área do Retângulo: " + AreaRetangulo);
        System.out.println("Área do Triângulo: " + AreaTriangulo);
        System.out.println("Área do Losango: " + AreaLosango);
        System.out.printf("Área da Circunferência: %.2f\n", AreaCircunferencia);
    }
}
