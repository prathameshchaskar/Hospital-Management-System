package Model;

import Model.Interfaces.Doctor;

public class OfflineDoctors implements Doctor {

    String docId;
    String docName;
    String docDegree;
    String docSpeciality;
    int docAge;

    OfflineDoctors(String docId, String docName, String docDegree, String docSpeciality, int docAge) {
        this.docId = docId;
        this.docName = docName;
        this.docDegree = docDegree;
        this.docSpeciality = docSpeciality;
        this.docAge = docAge;
    }
    public void diagnosis(){
        System.out.println("Doing diagnosis offline");
    }
    public void getMyPatients(){

    }
    public void getMyDetails(){
        System.out.println("Hello, I am doctor "+ docName);
        System.out.println("My degree is "+ docDegree);
        System.out.println("My speciality is "+ docSpeciality);
        System.out.println("My age is "+ docAge);

    }

    public String docId(){
        return docId;
    }
}
