package pt.ulht.es.cookbook.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
  
	@RequestMapping(method=RequestMethod.GET, value="/")
	public String showHome(Model model) {

        Date date = new Date(System.currentTimeMillis());
        DateFormat df = DateFormat.getDateInstance();
        model.addAttribute("currentTime", df.format(date));
	    
		return "home";
	}


public class CriarReceita {

string nome;
string titulo;
string descrproblema;
string descrsolucao;

return CriarReceita;

    }

public class ListarReceita{
return Listr«arReceita;

    }

public class ReceitaDetalhe{
return ReceitaDetalhe;

    }

}





