package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

import java.util.List;

public class Book {
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	public Book() {
		
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("The "+authorName+" is already exists in list");
			System.exit(0);
		}
		else {
			authors.add(authorName);
			System.out.println("The author has added");
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("The "+authorName+" is not already exists in List");
			System.exit(0);
		}
		else {
			authors.remove(authorName);
			System.out.println("The Author has removed");
		}
	} 

}
