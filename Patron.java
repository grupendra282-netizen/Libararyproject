	public class Patron{
		int id;
		String name;
		Patron(){
			this.id=0;
			this.name="Anonymous";
		}
        Patron(){
			this.id=id;
			this.name="Anonymous";
		}
		Patron(int id,String name){
			this.id=id;
			this.name=name;
		}
		print String toString(){
			return id+"-"+name;
		}
	}