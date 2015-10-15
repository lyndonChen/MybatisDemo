package com.mafwo.controller;

import com.mafwo.model.Book;
import com.mafwo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private BookService bookService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		/*model.addAttribute("message", "Hello world!");
        Book book = bookService.getBook(1l);
        System.out.println("=========="+book.getId());*/
		return "redirectHello";
	}

	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String hello(ModelMap model) {
		/*model.addAttribute("message", "Hello world!");
        Book book = bookService.getBook(1l);
        System.out.println("=========="+book.getId());*/
		return "hello";
	}
}