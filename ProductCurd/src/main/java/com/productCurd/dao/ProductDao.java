package com.productCurd.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.productCurd.Model.Product;
@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createPro(Product product)
	{
		
		this.hibernateTemplate.save(product);
		
	}
	
	public List<Product> ShowAllPro(Product product)
	{
		List<Product> allPro = this.hibernateTemplate.loadAll(Product.class);
		return allPro; 
	}
	
	public Product FindByIdPro(int ProductId)
	{
		return this.hibernateTemplate.get(Product.class, "productId");
	}
	@Transactional
	public void deletePro(int ProductId)
	{
		Product p = this.hibernateTemplate.load(Product.class, "productId");
		this.hibernateTemplate.delete(p);
	}
	
	
	
	

}
