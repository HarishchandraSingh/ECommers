package com.day4.dto;

public class ProductDTO {
	

	private int id;
	private String name;
	
	private int CategoryId;
	private double price;
	private double weight;
	private String description;
	private String imageName;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(int id, String name, int categoryId, double price, double weight, String description,
			String imageName) {
		super();
		this.id = id;
		this.name = name;
		CategoryId = categoryId;
		this.price = price;
		this.weight = weight;
		this.description = description;
		this.imageName = imageName;
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
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", CategoryId=" + CategoryId + ", price=" + price
				+ ", weight=" + weight + ", description=" + description + ", imageName=" + imageName + "]";
	}
	
	

}
