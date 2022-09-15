package br.com.mvalentim.mvc.mudi.controller;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mvalentim.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Apple iPhone 13 Pro Max (128 GB) - Verde-alpino");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/41e-pX1OqPL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B09V48865W?ie=UTF8&viewID=&ref_=fs_a_atv_0");
		pedido.setDescricao("Tela Super Retina XDR de 6,7 polegadas com ProMotion para uma experiência mais rápida e responsiva");
		
		Arrays.asList(pedido);
		model.addAttribute(pedido);
		return "home";
	}
}
