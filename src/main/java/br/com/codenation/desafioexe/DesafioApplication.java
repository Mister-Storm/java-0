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

		List<Integer> fib = new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
		while (fib.size() <= 350) {
			Integer valor;
			valor = fib.get(fib.size()-1) + fib.get(fib.size()-2);
			fib.add(valor);
		}
		return fib;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {
		if (a == null) throw new IllegalArgumentException();
		Boolean boleano;
		boleano = Boolean.FALSE;
		List<Integer> fib = new ArrayList<Integer>();
		fib = fibonacci();

		for(int i: fib) {
			if(i== a.intValue()) boleano = Boolean.TRUE;
		}
		return boleano;

	}

}
