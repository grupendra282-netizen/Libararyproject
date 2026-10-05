
	import java.util.*;
	public class Library{
		List<Book> patrons = new HashSet<>();
		Map<Book, Patron> loans=new HashMap<>();
		void addBook(Book b){
			inventory.add(b);
		}
		void registerPatron(Patron p){
			patrons.add(p);
		}
		boolean loanBook(String isbn, int patronId){
			Book foundBook = null;
			for (Book b : inbventory){
            if (b.isbn.equals(isbn)){
            foundBook=b;
    break;
			}
			}
			

if (foundBook == null){
return false;
}
patron foundPatron = null;
for(patron p : patrons){
	if(p.id == patronId){
		foundPatron = p;
		break;
	}
}
if(foundPatron == null){
	return false;
}
if(loans.conatinsKey(foundBook)){
	return false;
}
loans.put(foundBook,foundPatron);
return true;
		}
		boolean returnBook(String isbn)
		{
			Book foundBook = null;
			for(Book b : loans.keySet()){
				if(b.isbn.equals(isbn)){
					foundBook = b;
					break;
				}
			}
			if(foundBook != null){
				loans.remove(foundBook);
				return true;
				
			}
			return false;
		}
		List<Book> listAvailbleBooks(){
			List<Book> available = new ArrayList<>();
for(Book b : inventory){
if(! loans.containsKey(b)){
available.add(b);
}
}
return
available;
		}
	}