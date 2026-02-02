package oop.challenge;

public class AmazonBook {
	
	private String title;
	private String author;
	private double price;
	private int pages;
	private String isbn10;
	private int rating;
	private String language;
	
	// Constructor
	/**
	 * 
	 * @param title
	 * @param author
	 * @param price
	 * @param pages
	 * @param isbn10
	 * @param rating
	 * @param language
	 */
	public AmazonBook(String title, String author, double price,int pages,String isbn10,int rating,String language) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
		this.isbn10 = isbn10;
		this.rating = ratingValidation(rating);
		this.language = language;
	}
	
	public AmazonBook() {}
	
	// Get/Set 
	
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	public double getPrice() {return price;}
	public int getPages() {return pages;}
	public String getIsbn() {return isbn10;}
	public int getRating() {return rating;}
	public String getLanguage() {return language;}
	
	public void setTitle(String title) {this.title = title;}
	public void setAuthor(String author) {this.author = author;}
	public void setPrice(double price) {this.price = price;}
	public void setPages(int pages) {this.pages = pages;}
	public void setIsbn(String isbn) {this.isbn10 = isbn;}
	public void setRating(int rating) {this.rating = ratingValidation(rating);}
	public void setLanguage(String language) {this.language = language;}

	private int ratingValidation(int rating) {
		if (rating > 1 && rating < 6) {
			return rating;
		}
		else {
			throw new java.lang.IllegalArgumentException();
		}		
	}

	@Override
	public String toString() {
		return "AmazonBook [title=" + title + ", author=" + author + ", price=" + price + ", pages=" + pages
				+ ", isbn10=" + isbn10 + ", rating=" + rating + ", language=" + language + "]";
	}

	
}