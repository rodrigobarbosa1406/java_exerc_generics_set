package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Quantos alunos para o curso A? ");
			int x = sc.nextInt();
			
		} catch (RuntimeException e) {
			System.out.println("Erro...");
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
