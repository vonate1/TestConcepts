	//Creating the instance variables
public class WineCourse {
	private String dinnerWine;
	private String dessertWine;
	private String appetizerWine;

	//The constructors 
	public WineCourse(String dinnerWine, String dessertWine, String appetizerWine) {
		super();
		this.dinnerWine = dinnerWine;
		this.dessertWine = dessertWine;
		this.appetizerWine = appetizerWine;
	}

	//GETTERS START
	public String getDinnerWine() { return dinnerWine;}
	public String getDessertWine() { return dessertWine;}
	public String getAppetizerWine() { return appetizerWine;}
	//GETTERS END
	
}