package br.com.on.fiap;

public class OperadoresAritimeticos {
	
	public static void main(String[] args) {
		int x = 9;
		int y = 2;
		
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;
		
		System.out.println("Resultado da soma"      +soma);
		System.out.println("Resuultado da subtração"     +subtracao);
		System.out.println("Resultado da multiplicação"   +multiplicacao);
		System.out.println("Resultado da divisão"    +divisao);
		System.out.println("Resultado do resto"    +resto);
		
		x++;
		System.out.println("Resultado do incermento de x: "   + x);
		y--;
		System.out.println("Resultado do decremento de y: "  + y);
		x += 10;
		System.out.println("Atribuição aditiva de x: "  + x);
		y -= 10;
		System.out.println("Atribuição subtrativa de y: "  + y);
	}

}
