package view;

import controller.ThreadSoma;

public class Main {
	public static void main(String[] args) {
		
		int[][] mat = new int[3][5];
		
		System.out.println("Matriz:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				mat[i][j] = (int)(Math.random()*10);
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nSoma das linhas:");
		for (int i = 0; i < 3; i++) {
			ThreadSoma soma = new ThreadSoma(mat[i], i);
			soma.start();
		}
		
	}
}
