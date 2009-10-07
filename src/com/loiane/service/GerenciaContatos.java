package com.loiane.service;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.loiane.model.Contato;

/**
 * Classe utilitária - gera contatos
 * @author Loiane Groner
 *
 */
public class GerenciaContatos {
	
	/**
	 * Gera uma lista de contatos de tamanho 8
	 * @return lista de contatos
	 */
	public static List<Contato> geraContatos(){
		
		List<Contato> contatos = new ArrayList<Contato>(8);
		
		GregorianCalendar aniversario = new GregorianCalendar(1984, 02, 01);
		Contato contato = new Contato("Maria","11-12345678","maria@provedor.com",aniversario.getTime());
		contatos.add(contato);
		
		aniversario = new GregorianCalendar(1983, 04, 12); //12/04/1983
		contato = new Contato("Pedro","12-55698745","pedro@provedor.com",aniversario.getTime());
		contatos.add(contato);
		
		aniversario = new GregorianCalendar(1983, 05, 23); //23/05/1986
		contato = new Contato("João","21-78542359","joao@provedor.com",aniversario.getTime());
		contatos.add(contato);
		
		aniversario = new GregorianCalendar(1982, 01, 07); //07/01/1982
		contato = new Contato("Tiago","27-25854567","tiago@provedor.com",aniversario.getTime());
		contatos.add(contato);
		
		aniversario = new GregorianCalendar(1984, 10, 30); //30/10/1984
		contato = new Contato("Carla","33-31595187","carla@provedor.com",aniversario.getTime());
		contatos.add(contato);
		
		aniversario = new GregorianCalendar(1985, 06, 29); //29/06/1985
		contato = new Contato("Estela","21-98652938","estela@provedor.com",aniversario.getTime());
		contatos.add(contato);
		
		aniversario = new GregorianCalendar(1984, 11, 25); //25/11/1984
		contato = new Contato("Lucas","71-87241548","lucas@provedor.com",aniversario.getTime());
		contatos.add(contato);
		
		aniversario = new GregorianCalendar(1983, 12, 02); //02/12/1983
		contato = new Contato("Mariana","85-33984526","mariana@provedor.com",aniversario.getTime());
		contatos.add(contato);
		
		return contatos;
	}
}
