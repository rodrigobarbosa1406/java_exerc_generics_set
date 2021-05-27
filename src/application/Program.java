package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			Set<Course> course = new HashSet<>();
			String turma = null; 
			
			System.out.print("Informe a quantidade de turmas: ");
			int y = sc.nextInt();
			System.out.println();
			
			for (int j = 1; j<=y; j++) {
				System.out.print("Informe o código da " + j + "ª turma: ");
				turma = sc.next();
				sc.nextLine();
				
				System.out.print("Quantos alunos para o turma " + turma + "? ");
				int x = sc.nextInt();
	
				for (int i = 1; i <= x; i++) {
					System.out.print("Código do aluno " + i + ": ");
					course.add(new Course(sc.nextInt(), turma));
				}
				
				System.out.println();
			}

			Set<Course> intersection = new HashSet<>();
			
			for (Course c : course) {
				intersection.add(new Course(c.getCodigo(), c.getTurma()));
			}
			
			System.out.println();
			System.out.println("RELAÇÃO DE ALUNOS");
			turma = null;
			
			for (Course c : course) {
				if (turma == null || ! turma.equals(c.getTurma())) {
					if (turma != null) {
						System.out.println();
					}
					
					System.out.println("TURMA " + c.getTurma());
				}
				
				System.out.println(c.toString());
				
				turma = c.getTurma();
			}
			
			System.out.println();
			System.out.print("Total de alunos:");
			System.out.print(intersection.size());

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
