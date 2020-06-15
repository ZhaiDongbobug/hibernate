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
		
//		Category c = new Category();
//		c.setName("c1");
//		s.save(c);
//		
//		Product p = (Product) s.get(Product.class, 8);
//		p.setCategory(c);
//		s.update(p);
		
		
		
		
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
		
		
		s.getTransaction().commit();
		s.close();
		System.out.println("此时p是脱管状态");
		sf.close();
	}

}
