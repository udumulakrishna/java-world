package com.basics;

public class Bool {

	public static void main(String[] args) {
		BookingConclusion a = new BookingConclusion();
		a.setSuccessful(true);
		System.out.println("O{: "+ a.isSuccessful());
		
	}
}

class BookingConclusion {
	
    boolean isSuccessful;
    boolean occupied;
    int auditoriumNumber;
    
	public boolean isSuccessful() {
		return isSuccessful;
	}
	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}
	
	
	public int getAuditoriumNumber() {
		return auditoriumNumber;
	}
	public void setAuditoriumNumber(int auditoriumNumber) {
		this.auditoriumNumber = auditoriumNumber;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	
	
    
    
}



