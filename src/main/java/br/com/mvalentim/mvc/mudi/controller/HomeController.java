package br.com.mvalentim.mvc.mudi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mvalentim.mvc.mudi.model.Pedidos;

@Controller
public class HomeController {

	@PersistenceContext
	private EntityManager entityManager;

	@GetMapping("/home")
	public String home(Model model) {

		javax.persistence.Query query = entityManager.createQuery("select p from Pedidos p", Pedidos.class);
		List<Pedidos> pedidos = query.getResultList();

		model.addAttribute("pedidos",pedidos);
		return "home";
	}
}
