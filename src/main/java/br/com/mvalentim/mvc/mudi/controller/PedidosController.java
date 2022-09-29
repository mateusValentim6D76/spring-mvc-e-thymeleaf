package br.com.mvalentim.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedido")
public class PedidosController {

	private static String FORMULARIO = "pedido/formulario";
	
	@GetMapping("/formulario")
	public String formulario() {
		return FORMULARIO;
	}
}
