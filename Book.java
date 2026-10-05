public class book{
	String isbn;
	String title;
	String author;
	Book (String isbn,String title,String author){
		this.isbn=isbn;
		this.title=title;
		this.author = author;
	}
	Book(String isbn){
		this.isbn=isbn;
		this.title="unknown";
		this.author="unknown";
	}
	public String toString(){
		return isbn +"-"+title+"-"+author;
	}
}