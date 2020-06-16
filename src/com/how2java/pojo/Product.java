package com.how2java.pojo;

import java.util.Set;

public class Product {
	int id;
    String name;
    float price;
    Category category;
    int version;
    public int getVersion() {
    	return version;
    }
    public void setVersion(int version) {
    	this.version = version;
    }
    Set<User> users;
    
    public Set<User> getUsers() {
    	return users;
    }
    public void setUsers(Set<User> users) {
    	this.users = users;
    }
    public Category getCategory() {
    	return category;
    }
    public void setCategory(Category category) {
    	this.category = category;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
