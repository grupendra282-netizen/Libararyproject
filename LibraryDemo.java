
public class LibraryDemo{
public static void main(String[] args){
Book b1 = new Book ("101","java","james");
Book b2 = new Book ("102","Python","Guido");
Book b3 = new Book("103");
Book b4 = new Book("104");	
Patron p1 = new Patron();
Patron p2 = new Patron(2);
Patron p3 = new Patron(3,"Rupendra");
Library library = new Library();
library.addBook(b1);
library.addBook(b2);
library.addBook(b3);
library.addBook(b4);
library.registerPatron(p1);
library.registerPatron(p2);	
library.registerPatron(p3);
System.out.println(library.loanBook("101",3));
System.out.println("After Loan:");
System.out.println(library.listAvailbleBooks());
System.out.println(library.returnBook("101"));
System.out.println("After return:");
System.out.println(library.listAvailbleBooks());
}
}
