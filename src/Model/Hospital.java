package Model;

import Database.DoctorDB;
import Database.PatientDB;
import Model.Interfaces.Doctor;

public class Hospital {
    String hospitalName;
    int totalBeds;
    String hospitalAddress;
    int hospitalPhoneNumber;

    DoctorDB doctorDatabase;

    PatientDB patientDatabase;

    public Hospital(String hospitalName, int totalBeds, String hospitalAddress, int hospitalPhoneNumber) {
        this.hospitalName = hospitalName;
        this.totalBeds = totalBeds;
        this.hospitalAddress = hospitalAddress;
        this.hospitalPhoneNumber = hospitalPhoneNumber;
        doctorDatabase = new DoctorDB();
        patientDatabase = new PatientDB();
    }

    public void getHospitalName() {
        System.out.println(hospitalName);
    }

    public void getTotalBeds() {
        System.out.println(totalBeds);
    }

    public void getHospitalAddress() {
        System.out.println(hospitalAddress);
    }

    public void getHospitalPhoneNumber() {
        System.out.println(hospitalPhoneNumber);
    }
    public void getTotalPatientsAvailable() {

    }
    public void getTotalDoctors() {

    }
    public void getPatientDetails(String pId) {

    }

    public void getDoctorDetails(String docId) {

    }
    public void admitPatient(String patientName, String patientIllness, int patientAge, String patientGender) {

    }
    public void appointDoctor(String doctorName, String doctorDegree, int doctorAge, String doctorSpeciality) {
        int totalDocs = doctorDatabase.getTotalDocs();
        String docId = "HSP" + (totalDocs+1);
        Doctor doc = new OfflineDoctors(docId, doctorName, doctorDegree, doctorSpeciality, doctorAge);
        doctorDatabase.addDoctorToDB(doc);
    }
}
