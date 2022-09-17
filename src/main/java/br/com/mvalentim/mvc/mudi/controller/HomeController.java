package br.com.mvalentim.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mvalentim.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@PersistenceContext
	private EntityManager entityManager;

	@GetMapping("/home")
	public String home(Model model) {

		javax.persistence.Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		List<Pedido> pedidos = query.getResultList();

		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Apple iPhone 13 Pro Max (128 GB) - Verde-alpino");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/41e-pX1OqPL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B09V48865W?ie=UTF8&viewID=&ref_=fs_a_atv_0");
		pedido.setDescricao(
				"Tela Super Retina XDR de 6,7 polegadas com ProMotion para uma experiência mais rápida e responsiva");

		model.addAttribute(pedidos);
		return "home";
	}
}
