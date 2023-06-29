package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;


@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		
		pedido.setNomeProduto("Xiome redme note 8");
		pedido.setValorNegociado(null);
		pedido.setDataEntrega(null);
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-128GB/dp/B0BX4MQH3G/ref=sr_1_1?keywords=xiaomi"
				+ "+redmi+note+8&qid=1687996747&sprefix=%2Caps%2C154&sr=8-1&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/618WlKYjsQL._AC_SL1000_.jpg");
		pedido.setDescricao("uma descrição qualquer");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
