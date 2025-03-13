package controller;

public class ThreadSoma extends Thread {
	
	private int[] vetor;
	private int linha;
	
	public ThreadSoma(int[] vetor, int linha){
		this.vetor = vetor;
		this.linha = linha;
	}

	public void run() {
		soma();
	}

	public void soma() {
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			soma += vetor[i];
		}

		int tid = (int) getId();

		System.out.println("#" + tid + " | Soma da linha "+(linha+1)+" => " + soma);

	}

}
