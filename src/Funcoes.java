import java.util.Scanner;

public class Funcoes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		/*
		if (a > b && a > c) {
			System.out.println("Maior é: " + a);
		}
		else if (b > c) {
			System.out.println("Maior é: " + b);
		}
		else {
			System.out.println("Maior é: " + c);
		}
		*/
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		} 
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int valor) {
		System.out.println("Maior = " + valor);
	}

}
