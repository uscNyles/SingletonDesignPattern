import java.util.ArrayList;
import java.util.ListIterator;

public class Patient {

	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies;

	/**
	 * Creates a Patient object 
	 * @param id
	 * the id of the patient. 
	 * Used for the machine to identify the patient
	 * @param firstName
	 * A corresponding first name
	 * @param lastName
	 * A corresponding last name
	 */
	public Patient(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		allergies = new ArrayList<String>();
	}

	/**
	 * Used to attach allergies to patients
	 * @param allergy
	 * (String) an allergy which a patient has
	 */
	public void addAllergy(String allergy) {
		this.allergies.add(allergy);
	}

	/**
	 * Returns a String representation of a patients information
	 * @return
	 * (String) concatenates a patients information to a string
	 */
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
