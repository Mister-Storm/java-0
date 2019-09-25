package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

import br.com.codenation.TestadorFibonacci;
import br.com.codenation.annotation.Desafio;

public class DesafioApplication {

	public static void main(String[] args) {
		new TestadorFibonacci().testaDesafio(DesafioApplication.class);
	}

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {

		List<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(0);
		fibonacci.add(1);
		while (!fibonacci.contains(350)) {
			Integer valor;
			valor = fibonacci.get(fibonacci.size()-1) + fibonacci.get(fibonacci.size());
			fibonacci.add(valor);
		}
		return fibonacci;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {

		Boolean boleano;
		boleano = Boolean.FALSE;
		List<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(0);
		fibonacci.add(1);
		while (fibonacci.get(fibonacci.size()).intValue() <= a.intValue()) {
			Integer valor;
			valor = fibonacci.get(fibonacci.size()) + fibonacci.get(fibonacci.size())-1;
			fibonacci.add(valor);
			if (fibonacci.get(fibonacci.size()).equals(a)) {
				boleano = Boolean.TRUE;
			}
		}
		return boleano;
	}

}
