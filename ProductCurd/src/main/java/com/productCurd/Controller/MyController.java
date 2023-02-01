package com.productCurd.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.productCurd.Model.Product;
import com.productCurd.dao.ProductDao;

@Controller
public class MyController {
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/h")
	public String home()

	{

		System.out.println("This is home page ");
		return "index";
	}

	@RequestMapping("/add")
	public String addProduct()

	{
		System.out.println("add project");
		return "addProduct";
	}

	@RequestMapping(path = "showForm", method = RequestMethod.POST)
	/*
	 * public String showList(@RequestParam("productId") int
	 * id, @RequestParam("productName") String name,
	 * 
	 * @RequestParam("productDes") String des, @RequestParam("productPrice") String
	 * price, Model model) {
	 * 
	 * return price;
	 * 
	 * }
	 */

	public RedirectView showForm(@ModelAttribute("product") Product product,HttpServletRequest httpServletRequest) {
		String name = product.getProductName();
		int id = product.getProductId();
		long price = product.getProductPrice();
		String Dec = product.getProductDes();
		System.out.println(product);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(httpServletRequest.getContextPath()+"/");

		productDao.createPro(product);

		return redirectView ;

	}

	/*
	 * @RequestMapping(path = "showForm", method = RequestMethod.POST) public
	 * RedirectView showForm(@ModelAttribute Product product,HttpServletRequest req)
	 * {
	 * 
	 * productDao.createPro(product);
	 * 
	 * System.out.println(product); RedirectView rv= new RedirectView();
	 * rv.setUrl(req.getContextPath()+"/"); return rv; }
	 */

}
