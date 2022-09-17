package br.com.mvalentim.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.mvalentim.mvc.mudi.model.Pedidos;
import br.com.mvalentim.mvc.mudi.repository.PedidosRepository;

@Controller
public class HomeController {

	@Autowired
	private PedidosRepository pedidosRepository;

//	@GetMapping("/home")
//	public String home(Model model) {
//		List<Pedidos> pedidos = pedidosRepository.recuperaTodosOsPedidos();
//		model.addAttribute("pedidos", pedidos);
//		return "home";
//	}

	@GetMapping("/home")
	public ModelAndView home(Model model) {
		ModelAndView mv = new ModelAndView("home");
		List<Pedidos> pedidos = pedidosRepository.findAll();
		model.addAttribute("pedidos", pedidos);
		return mv;
	}
}
