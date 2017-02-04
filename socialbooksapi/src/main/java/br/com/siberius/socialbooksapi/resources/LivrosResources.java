package br.com.siberius.socialbooksapi.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.siberius.socialbooksapi.domain.Livro;

@RestController
public class LivrosResources {

	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar(){
		
		Livro l1 = new Livro("Rest Aplicado");
		Livro l2 = new Livro("Git passo-paasso");
		
		Livro[] livros = {l1,l2};
		
		return Arrays.asList(livros);
	}
	
}
