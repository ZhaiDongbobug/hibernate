package com.how2java.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.pojo.User;

public class TestHibernate {

	public static void main(String[] args) {
			
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		String name = "iphone";
		Criteria c = s.createCriteria(Product.class);
		c.add(Restrictions.like("name", "%"+name+"%"));
		c.setFirstResult(2);
		c.setMaxResults(5);
		
		List<Product> ps = c.list();
		for (Product p : ps) {
			System.out.println(p.getName());
		}
		
		
		
		
		
		
		
		
//		Category c1 = (Category) s.get(Category.class, 1);
//		System.out.println("log1");
//		Category c2 = (Category) s.get(Category.class, 1);
//		System.out.println("log2");
//		s.getTransaction().commit();
//		s.close();
//		Session s2 = sf.openSession();
//		s2.beginTransaction();
//		Category c3 = (Category) s2.get(Category.class, 1);
//		System.out.println("log3");
//		s2.getTransaction().commit();
//		s2.close();
		//System.out.println("此时p是脱管状态");
		sf.close();
		
		
		
		
		
		
		
		
//		Product p = (Product) s.get(Product.class, 5);
//		System.out.println("id=6的产品名称是" + p.getName());
//		p.setName("iphone-modified");
//		s.update(p);
		
		
//		String name = "iphone";
//		String sql = "select * from product_ p where p.name like '%"+name+"%'";
//		Query q = s.createSQLQuery(sql);
//		List<Object[]> list = q.list();
//		for (Object[] os : list) {
//			for (Object field : os) {
//				System.out.print(field+"\t");
//			}
//			System.out.println();
//		}
//		for(int i=2;i<8;i++) {
//			Category c = new Category();
//			c.setName("c"+i);
//			s.save(c);
//			Product p = (Product) s.get(Product.class, i);
//			p.setCategory(c);
//			s.update(p);
//		}
		
//		

		
		
		
		
		
//		Category c = (Category) s.get(Category.class, 12); 
//		Set<Product> ps = c.getProducts();
//		for (Product p : ps) {
//			System.out.println(p.getName());
//		}
		
//		Set<User> users = new HashSet();
//		for(int i=0;i<3;i++) {
//			User u = new User();
//			u.setName("user" + i);
//			users.add(u);
//			s.save(u);
//		}
//		
//		Product p1 = (Product) s.get(Product.class, 1);
//		
//		p1.setUsers(users);
//		s.save(p1);
		
//		Product p = (Product) s.get(Product.class, 1);
//		s.delete(p);
//		
//		Product p2 = (Product) s.get(Product.class, 2);
//		p2.setName("长度超过30的字符串作为产品名称长度超过30的字"
//				+ "符串作为产品名称长度超过30的字符串作为产品名称长度"
//				+ "超过30的字符串作为产品名称");
//		s.update(p2);
		
//		Product p = (Product) s.load(Product.class, 2);
//		System.out.println("log1");
//		System.out.println(p.getName());
//		System.out.println("log2");
		
//		Category p = (Category) s.get(Category.class, 1);
//		
//		System.out.println("log1");
//		System.out.println(p.getProducts());
//		System.out.println("log1");
		
		
		
//		Category c = (Category) s.get(Category.class, 3);
//		s.delete(c);
//		System.out.println("log1");
//		Category c1 = (Category) s.get(Category.class, 1);
//		System.out.println("log2");
//		Category c2 = (Category) s.get(Category.class, 1);
//		System.out.println("log3");
//		Product p1 = new Product();
//		p1.setName("product_501");
//		Product p2 = new Product();
//		p2.setName("product_502");
//		Product p3 = new Product();
//		p3.setName("product_503");
//		
//		c.getProducts().add(p1);
//		c.getProducts().add(p2);
//		c.getProducts().add(p3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Criteria c = s.createCriteria(Product.class);
//		c.add(Restrictions.like("name", "%"+name+"%"));
//		List<Product> ps = c.list();
//		for(Product p:ps) {
//			System.out.println(p.getName());
//		}
		
		
		
		
		
		
		
//		Query q = s.createQuery("from Product p where p.name like ?");
//		q.setString(0, "%"+name+"%");
//		List<Product> ps = q.list();
//		for(Product p : ps) {
//			System.out.println(p.getName());
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Product p = new Product();
//		p.setName("iphone6");
//		System.out.println("此时p是瞬时状态");
//		p.setPrice(6000);
//		p.setId(1);
//		s.save(p);
//		System.out.println("此时p是持久状态");
//		for (int i=0;i<10;i++) {
//			Category c = new Category();
//			c.setName("分类"+i);
//			s.save(c);
//		}
		
		
		
	}

}
