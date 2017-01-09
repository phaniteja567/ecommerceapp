package com.backend.backend;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfig;
import com.backend.dao.CategoryDao;
import com.backend.dao.ProductDao;
import com.backend.dao.SupplierDao;
import com.backend.dao.UsersDao;
import com.backend.model.CategoryModel;
import com.backend.model.ProductModel;
import com.backend.model.SupplierModel;
import com.backend.model.UsersModel;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext annotationConfigApplicationnContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
    	UsersDao userDao=(UsersDao) annotationConfigApplicationnContext.getBean("userDaoImpl");
    	UsersModel user=new UsersModel();
    	user.setUsername("phaniteja");
    	user.setPassword("phaniteja");
    	userDao.registerUser(user);
    	/*ProductDao productDao=(ProductDao) annotationConfigApplicationnContext.getBean("ProductDaoImpl");
    	ProductModel product=new ProductModel();
    	product.setProductName("TestProduct");
    	product.setProductPrice(900.0f);
    	productDao.addProduct(product);*/
    	/*CategoryDao categoryDao=(CategoryDao) annotationConfigApplicationnContext.getBean("CategoryDaoImpl");
    	CategoryModel category=new CategoryModel();
    	category.setCategoryName("psychology");
    	categoryDao.addCategory(category);*/
    	/*SupplierDao supplierDao=(SupplierDao) annotationConfigApplicationnContext.getBean("SupplierDaoImpl");
    	SupplierModel supplier=new SupplierModel();
    	supplier.setSupplierName("NIITPublications");
    	supplier.setSupplierAddress("Bhasheerbagh,Hyerabad,500044");
    	supplierDao.addSupplier(supplier);
    	*/
    	
    }
}
