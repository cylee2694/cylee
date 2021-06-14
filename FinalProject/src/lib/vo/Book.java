package lib.vo;

public class Book {
	
	private String name;
	private String publisher;
	private String author;
	private int stock;
	
	public Book() {}
	
	public Book(String name, String publisher, String author, int stock) {
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.stock = stock;
	}

	public Book(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
