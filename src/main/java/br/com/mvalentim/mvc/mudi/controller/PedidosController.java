package br.com.mvalentim.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mvalentim.mvc.mudi.dto.NovoPedidoDTO;
import br.com.mvalentim.mvc.mudi.model.Pedidos;
import br.com.mvalentim.mvc.mudi.repository.PedidosRepository;

@Controller
@RequestMapping("/pedido")
public class PedidosController {

	@Autowired
	private PedidosRepository pedidoRepository;

	private static String FORMULARIO = "pedido/formulario";
	
	@GetMapping("/formulario")
	public String formulario(NovoPedidoDTO novoPedidoDTO) {
		return FORMULARIO;
	}
	
	@PostMapping("novo")
	public String novo(@Valid NovoPedidoDTO novoPedidoDTO, BindingResult result) {
		if(result.hasErrors()) {
			return "pedido/formulario";
		}
		
		Pedidos pedido = novoPedidoDTO.toPedido();
		pedidoRepository.save(pedido);
		return "pedido/formulario";
	}
}
