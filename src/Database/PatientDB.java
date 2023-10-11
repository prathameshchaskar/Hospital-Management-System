package Database;

import Model.Interfaces.Patient;

import java.util.HashMap;

public class PatientDB {
    HashMap<String, Patient> patientDetails;
    public PatientDB() {
        patientDetails = new HashMap<>();
    }

    public Patient getPatient(String pId) {
        return patientDetails.get(pId);
    }

    public void addPatient(Patient p) {
        String pId = p.pId();
        patientDetails.put(pId, p);
        System.out.println("New Patient got added into patient database");
    }
}
