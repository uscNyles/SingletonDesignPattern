import java.util.ArrayList;
import java.util.Iterator;

public class Patient {

	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies;
	
	public Patient(int id, String firstName, String lastName) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		allergies = new ArrayList<String>();
	}
	
	public void addAllergy(String allergy) {
		this.allergies.add(allergy);
	}
	
	public String toString() {
		String toReturn = "";
		Iterator<String> Josh = allergies.iterator();
		
		for( String allergy: this.allergies) {
			if(Josh.hasNext()) {
			toReturn += allergy + ',';
			} else {
			toReturn = allergy;
			}
			Josh.next();
		}
		
		return "Patient " + (this.id+1) + ": " + this.firstName + " " + this.lastName + "\n" +"  Allergies: " + toReturn;
	}
}
