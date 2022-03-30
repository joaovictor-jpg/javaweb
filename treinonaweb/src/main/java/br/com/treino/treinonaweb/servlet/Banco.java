package br.com.treino.treinonaweb.servlet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Banco {
	
	private static List<Navio> navios = new LinkedList();
	private static Integer chaveSequencial = 1;

	static {
		Navio navio = new Navio();
		navio.setNome("Going Merry");
		navio.setId(chaveSequencial++);
		Navio navio2 = new Navio();
		navio2.setNome("Thousand Sunny");
		navio2.setId(chaveSequencial++);
		navios.add(navio);
		navios.add(navio2);
	}
	
	public void add(Navio navio) {
		navio.setId(chaveSequencial);
		navios.add(navio);
	}

	public List<Navio> navios() {
		return Banco.navios;
	}

	public void remove(Integer id) {
		Iterator<Navio> it = navios.iterator();
		while(it.hasNext()) {
			Navio navio = it.next();
			if(navio.getId() == id) {
				it.remove();
			}
		}
	}

	public Navio buscaPorId(Integer id) {
		System.out.println("class banco " + id);
		for (Navio navio : navios) {
			if(navio.getId() == id) {
				return navio;
			}
		}
		return null;
	}
}
