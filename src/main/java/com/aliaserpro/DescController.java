package com.aliaserpro;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class DescController {
	
	@RequestMapping(value="/classify")
	public ModelAndView classifyRecipes() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("classify.jsp");
		
		/*TUTAJ POBRANIE INDEKSÓW, NAZW I OPISÓW PRZEPISÓW KTORE CHCEMY KLASYFIKOWAÆ
		  */
		  
		Integer id1=1;
		Integer id2=2;
		String name1="nazwa 1";
		String name2="nazwa 2";
		String desc1 = "przepis 1";
		String desc2 = "przepis 2";
		
		// dodanie atrybutów do modelu
		mv.addObject("id1", id1);
		mv.addObject("id2", id2);
		mv.addObject("n1", name1);
		mv.addObject("n2", name2);
		mv.addObject("d1", desc1);
		mv.addObject("d2", desc2);
		
		return mv;
	}
	
	@RequestMapping(value="/diff")
	public RedirectView descriptionsAreDifferent(HttpServletRequest request) {
		System.out.println("different button clicked");
		
		// Integer id1 = Integer.parseInt(request.getParameter("id1"));
		//Integer id2= Integer.parseInt(request.getParameter("id2"));
		
		 Integer id1 = 1;
		 Integer id2= 2;
		
		//TUTAJ OZNACZENIE PRZEPISÓW JAKO ROZNE
		
		
		
		//
		
		RedirectView redirect = new RedirectView("/InterfaceMVC/classify");
	    //redirect.setExposeModelAttributes(false);
	    return redirect;
	}
	
	@RequestMapping(value="/same")
	public ModelAndView descriptionsAreSame(HttpServletRequest request) {
		System.out.println("same button clicked");
		
		//Integer id1 = Integer.parseInt(request.getParameter("id1"));
		//Integer id2= Integer.parseInt(request.getParameter("id2"));
		
		Integer id1 = 1;
		Integer id2= 2;
		String n1="nazwa 1";
		String n2="nazwa 2";
		String d1="opis1";
		String d2="opis2";
		
	    ModelAndView mv = new ModelAndView();
		mv.setViewName("whichOne.jsp");

		// dodanie atrybutów do modelu
		mv.addObject("id1", id1);
		mv.addObject("id2", id2);
		mv.addObject("n1", n1);
		mv.addObject("n2", n2);
		mv.addObject("d1", d1);
		mv.addObject("d2", d2);
		
		return mv;
	}
	
	
	@RequestMapping(value="/choose")
	public RedirectView chooseFirst(HttpServletRequest request) {
		//USUNIECIE NIEPOPRAWNEGO
		//usun(id)
		
		RedirectView redirect = new RedirectView("/InterfaceMVC/classify");
	    //redirect.setExposeModelAttributes(false);
	    return redirect;
	}

	
	@RequestMapping(value="/goback")
	public RedirectView backToMainPage() {
		RedirectView redirect = new RedirectView("/InterfaceMVC/index.jsp");
	    redirect.setExposeModelAttributes(false);
	    return redirect;
	}
}
