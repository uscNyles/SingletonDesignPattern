import java.util.ArrayList;
import java.util.Iterator;

/**
 * An object that keeps track of patients and each
 * patients' allergies
 * @author nylesgeiger
 *
 */
public class HospitalSystem {

	private ArrayList<Patient> patients;
	private static HospitalSystem hospitalsystem;

	/**
	 * Creates an HospitalSystem object and a patients array list
	 */
	public HospitalSystem() {
		patients = new ArrayList<Patient>();
	}

	/**
	 * creates an instance of a Hospital System if one doesn't already exist
	 * @return
	 * returns an instance of a Hospital System object.
	 * There is only ever one at a time
	 */
	public static HospitalSystem getInstance() {
		if (hospitalsystem == null) {
			hospitalsystem = new HospitalSystem();
		}
		return hospitalsystem;
	}

	/**
	 * Adds patients to the ArrayList which stores each patient
	 * @param firstName
	 * The patients first name(String)
	 * @param lastName
	 * the patients last name(String)
	 * @return
	 * returns the id(int) of the new patient
	 */
	public int addPatient(String firstName, String lastName) {
		Patient tmepX = new Patient(this.patients.size() - 1, firstName, lastName);
		this.patients.add(tmepX);
		return this.patients.size() - 1;
	}

	/**
	 * Used to view the patient with a specific id
	 * @param id
	 * used to locate desired patient
	 * @return
	 * returns the patient(Patient) with the corresponding id
	 */
	public Patient getRecord(int id) {
		return this.patients.get(id);
	}

	/**
	 * Adds an allergy to a specific patient
	 * @param id
	 * (int) used to identify the patient to which the 
	 * allergy is being added to
	 * @param allergy
	 * (String) the allergy which is being added to the patient
	 */
	public void addAllergy(int id, String allergy) {
		this.patients.get(id).addAllergy(allergy);
	}

	/**
	 * Returns patient information for all parents
	 * within current object instance
	 * @return
	 * (String) a concatenated representation of 
	 * patients and their information
	 */
	public String getAllPatientsData() {
		String toReturn = "";
		Iterator<Patient> toReturnIt = patients.iterator();
		for (Patient patient : this.patients) {
			if (toReturnIt.hasNext()) {

				toReturn += patient.toString() + "\n\n";
			} else {
				toReturn += patient.toString();
			}
			toReturnIt.next();
		}
		return toReturn;
	}

}
