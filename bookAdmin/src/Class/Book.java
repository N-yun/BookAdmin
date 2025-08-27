package Class;

public class Book implements Cloneable {
//	isbn(ISBN), 책이름(name), 저자(author), 페이지수(page), 출판사(pub)
	private String isbn;
	private String name;
	private String author;
	private int page;
	private String pub;
	
	public Book(String isbn, String name, String author, int page, String pub) {
		// TODO Auto-generated constructor stub
		setIsbn(isbn);
		setName(name);
		setAuthor(author);
		setPage(page);
		setPub(pub);
	}
	
	public String getIsbn() {
		return isbn;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public int getPage() {
		return page;
	}
	public String getPub() {
		return pub;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}

	@Override
    public Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }
}
