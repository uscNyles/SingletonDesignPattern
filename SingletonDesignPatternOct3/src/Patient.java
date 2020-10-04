import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
		if (this.allergies.size() > 0) {
			toReturn = "Allergies: ";
		}

		ListIterator<String> Josh = allergies.listIterator();
		for (String allergy : this.allergies) {
			Josh.next();
			if (Josh.hasNext()) {
				toReturn += allergy + ", ";
			} else {
				toReturn += allergy;
			}
		}

		return "Patient " + (this.id + 2) + ": " + this.firstName + " " + this.lastName + "\n" + "  " + toReturn;
	}
}
