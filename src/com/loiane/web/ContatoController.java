package com.loiane.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.loiane.model.Contato;
import com.loiane.service.GerenciaContatos;

public class ContatoController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//gera os contatos
		List<Contato> contatos = GerenciaContatos.geraContatos();

		//prepara o objeto map no formato necessário para o JsonReader
		//no data.Store
		Map<String,Object> modelMap = new HashMap<String,Object>(2);
		modelMap.put("total", contatos.size());
		modelMap.put("rows", contatos);
		
		//indica que será transformado para formato JSON
		return new ModelAndView("jsonView", modelMap);
		
	}
}



