package view;

import br.gui.listagenerica.*;

public class Principal {
	public static void main(String x[]) throws Exception {
		Lista<Integer> lista = new Lista<>();
		
		int[] vetor = {3, 5, 8, 12, 9, 7, 6, 2, 3, 7, 16};
		for (int i : vetor) lista.addLast(i);
		int maior = 0, maior2 = 0;
		
		
		int tam = lista.size();
		for (int i = 0; i < tam; i++) {
			if (i == 0) {
				maior = lista.get(i); 
				maior2 = lista.get(i);
				continue;
			}
			
			int valor = lista.get(i);
			
			if (valor > maior) {
				maior2 = maior;
				maior = valor;
            } else if (valor > maior2 && valor < maior) {
                maior2 = valor;
            }
		}
		
		
		System.out.println("Maior valor: " + maior);
        System.out.println("Segundo maior valor: " + maior2);
			
			
		
		
		
	}
}
