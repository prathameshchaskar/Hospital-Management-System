package Database;

import Model.Interfaces.Doctor;
import Model.Interfaces.Patient;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDB {

    HashMap<String, Doctor> docDetails;
    HashMap<String, ArrayList<Patient>> docVsPatients;

    public DoctorDB(){
        docDetails = new HashMap<>();
        docVsPatients = new HashMap<>();

    }

    public int getTotalDocs(){
        return docDetails.size();
    }

    public ArrayList<Patient> getAssignedPatients(String docId) {
        return docVsPatients.get(docId);
    }

    public Doctor assignPatientToDoctor(Patient p) {
        String docId = "";
        int min = Integer.MAX_VALUE; // which doc is handling min patients
        for(String docIds : docVsPatients.keySet()){
            if(min > docVsPatients.get(docIds).size()) {
                min = docVsPatients.get(docIds).size();
                docId = docIds;
            }
        }
        ArrayList<Patient> allPatients = docVsPatients.get(docId);
        allPatients.add(p);

        return docDetails.get(docId);
    }

    public void addDoctorToDB(Doctor d) {
        String docId = d.docId();
        docDetails.put(docId, d);
        docVsPatients.put(docId, new ArrayList<>());
        System.out.println("New doctor got added into doctor database with docId ->" + docId ) ;
    }
}
