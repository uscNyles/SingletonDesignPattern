import java.util.ArrayList;
import java.util.Iterator;

public class HospitalSystem {

	private ArrayList<Patient> patients;
	private static HospitalSystem hospitalsystem;

	public HospitalSystem() {
		patients = new ArrayList<Patient>();
	}

	public static HospitalSystem getInstance() {
		if (hospitalsystem == null) {
			hospitalsystem = new HospitalSystem();
		}
		return hospitalsystem;
	}

	public int addPatient(String firstName, String lastName) {
		Patient tmepX = new Patient(this.patients.size() - 1, firstName, lastName);
		this.patients.add(tmepX);
		return this.patients.size() - 1;
	}

	public Patient getRecord(int id) {
		return this.patients.get(id);
	}

	public void addAllergy(int id, String allergy) {
		this.patients.get(id).addAllergy(allergy);
	}

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
