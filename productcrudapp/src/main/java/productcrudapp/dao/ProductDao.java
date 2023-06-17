package productcrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create product
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//get all products
	public List<Product> getProducts(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		
		return products;
	}
	
	//get a Single product
	public Product getProduct(int pId) {
		return this.hibernateTemplate.get(Product.class, pId);
	}
	
	//delete a products
	@Transactional
	public void deleteProduct(int pId) {
		Product product = this.hibernateTemplate.load(Product.class, pId);
		
		this.hibernateTemplate.delete(product);
	}
	

}
