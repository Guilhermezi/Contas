@@ -1,59 +1,45 @@
 /*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  */
 
 package com.mycompany.calculos;
 
 /**
  *
  * @author FATEC ZONA LESTE
  */
package com.mycompany.calculos;

public class Calculos {

    public static void main(String[] args) {
        
        // Definição das variáveis
        double num1 = 10.75; // Comporta números com casas decimais (2 casas após a vírgula)
        double num2 = 40.98;
        double Pi = 3.14; // Valor de Pi para o cálculo da área da circunferência
        int Quadrado = 6; // Lado do quadrado (inteiro)
        int AlturaRetangulo = 5; // Altura do retângulo
        int BaseRetangulo = 8; // Base do retângulo
        int BaseTriangulo = 9; // Base do triângulo
        int AlturaTriangulo = 5; // Altura do triângulo
        int Diagonal = 10; // Diagonal do losango
        int Diagonal_2 = 2; // Outra diagonal do losango
        int Raio = 5; // Raio da circunferência
        
        // Realização dos cálculos
        double Soma = num1 + num2; // Soma de num1 e num2
        double Subtracao = num1 - num2; // Subtração de num1 e num2
        double Multiplicacao = num1 * num2; // Multiplicação de num1 e num2
        double Divisao = num2 != 0 ? num1 / num2 : Double.NaN; // Verifica se num2 é diferente de 0 antes de dividir
        double Resto = num1 % num2; // Resto da divisão de num1 por num2
        double Media = Soma / 2; // Média dos dois números
        int Area = Quadrado * Quadrado; // Cálculo da área do quadrado
        int AreaRetangulo = AlturaRetangulo * BaseRetangulo; // Cálculo da área do retângulo
        int AreaTriangulo = BaseTriangulo * AlturaTriangulo / 2; // Cálculo da área do triângulo
        int AreaLosango = Diagonal * Diagonal_2 / 2; // Cálculo da área do losango
        double AreaCircunferencia = Raio * Raio * Pi; // Cálculo da área da circunferência
        
        // Exibindo os resultados dos cálculos
        System.out.println("A soma: " + Soma); // Exibe a soma
        System.out.println("A Subtracao: " + Subtracao); // Exibe a subtração
        System.out.println("A Multiplicacao: " + Multiplicacao); // Exibe a multiplicação
        System.out.println("A Divisao: " + Divisao); // Exibe a divisão
        System.out.println("o Resto: " + Resto); // Exibe o resto da divisão
        System.out.println("A Media: " + Media); // Exibe a média
        System.out.println("A area do Qudrado: " + Area); // Exibe a área do quadrado
        System.out.println("A area do Retangulo: " + AreaRetangulo); // Exibe a área do retângulo
        System.out.println("A area do Triangulo: " + AreaTriangulo); // Exibe a área do triângulo
        System.out.println("A area do Losango: " + AreaLosango); // Exibe a área do losango
        System.out.println("A area do Circunferencia: " + AreaCircunferencia); // Exibe a área da circunferência
    }
}
