package com.aliaserpro;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.aliaserpro.api.DataBaseApi;

@Controller
public class AddController {
	
	@RequestMapping(value="/add")
	public String createRecipe() {
		System.out.println("new recipe button clicked");
		return "newrecipe.jsp";
	}
		
	@RequestMapping(value="/done")
	public RedirectView recipeDone(HttpServletRequest request) {
		System.out.println("recipe done button clicked");
		
		String name = request.getParameter("name");
		String recipe = request.getParameter("recipe");
		boolean vege = false;
		
		if(request.getParameter("vege")!=null) {
			vege=true;
		}
		
		System.out.println("dodanie przepisu");
		System.out.println(name);
		System.out.println(recipe);
		System.out.println(vege);
		
		//TUTAJ DODANIE NOWEGO PRZEPISU\
		DataBaseApi databaseApi = new DataBaseApi();
		databaseApi.createNewRecord(name, recipe, vege);
		
		
		//powrót do strony g³ównej
		RedirectView redirect = new RedirectView("/InterfaceMVC/index.jsp");
	    redirect.setExposeModelAttributes(false);
	    return redirect;
	}
	
}