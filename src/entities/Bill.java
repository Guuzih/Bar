package entities;

public class Bill {
	
	public char gender;
	public int beer, barbecue, softDrink;

	
	public double cover(){
		
		return beer + barbecue + softDrink;
	}
		
	public double ticket() {
		
		if(gender == 'F') {
			
			return 8.0;
		}
		
		else {
			
			return 10.0;
			
		}
	} 
	
	public double feeding() {
		
		if(cover() >= 30) {
			
			return 0;
		}
		else {
			return 4.0;
		}
	}
	
	public double total() {
		
		return cover() + ticket() + feeding();
	}
	
}

