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
		fib.add(new Integer(0));
		fib.add(new Integer(1));
		// while (fib.size() <= 350) {
		while (fib.get(fib.size()-1).intValue() <= 350) {
			int valor;
			valor = fib.get(fib.size()-1).intValue() + fib.get(fib.size()-2).intValue();
			fib.add(new Integer(valor));
		}
		return fib;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {
		if (a == null) throw new IllegalArgumentException();
		Boolean bolRet;
		bolRet = Boolean.FALSE;
		List<Integer> fib;
		fib = fibonacci();

		for(int i: fib) if (i == a.intValue()) bolRet = Boolean.TRUE;
		return bolRet;

	}

}
