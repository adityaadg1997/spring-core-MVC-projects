package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String Home(Model model) {
		List<Product> products = productDao.getProducts();
		
		model.addAttribute("products", products);
		return "index";
	}
	
	//show add product form
	@RequestMapping("/add-product")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product App");
		
		return "add_product_form";
	}
	
	//handle-product handler
	@RequestMapping(path = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		
		productDao.createProduct(product);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		
		return redirectView;
	}
	
	//delete product handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		
		this.productDao.deleteProduct(productId);
		
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	//update product handler
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int pId, Model model) {
		Product product = this.productDao.getProduct(pId);
		model.addAttribute("product", product);
		
		return "update_form";
	}

}
