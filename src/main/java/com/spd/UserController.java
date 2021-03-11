package com.spd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
		
	@GetMapping("/viewBooks")
	public String viewBooks() {
		System.out.println("UserController  -- viewBooks()");
		return "viewBooks";
	}
	
	@GetMapping("/addBook")
	public String addBooks() {
		System.out.println("UserController  -- addBooks()");
		return "addBooks";
	}
	
	@GetMapping("/editBook")
	public String editBook() {
		System.out.println("UserController  -- editBook()");
		return "editBook";
	}
	
	@GetMapping("/deleteBook")
	public String deleteBook() {
		System.out.println("UserController  -- deleteBook()");
		return "deleteBook";
	}
	
	@GetMapping("/placeOrder")
	public String placeOrder() {
		System.out.println("UserController  -- placeOrder()");
		return "placeOrder";
	}
	

}
