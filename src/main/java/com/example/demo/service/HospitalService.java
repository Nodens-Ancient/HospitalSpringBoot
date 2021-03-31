package com.example.demo.service;

import com.example.demo.models.Diagnose;
import com.example.demo.models.DischargeForm;
import com.example.demo.models.PatientInfo;
import com.example.demo.models.Prescription;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class HospitalService {
    private PatientInfo patientInfo;
    private final DiagnoseService diagnoseService;
    private final DischargeFormService dischargeFormService;
    private final PatientService patientService;
    private final PersonalService personalService;
    private final PrescriptionService prescriptionService;
    private final QualificationService qualificationService;
    private final TreatmentService treatmentService;

    public HospitalService(PatientInfo patientInfo, DiagnoseService diagnoseService, DischargeFormService dischargeFormService, PatientService patientService, PersonalService personalService, PrescriptionService prescriptionService, QualificationService qualificationService, TreatmentService treatmentService) {
        this.patientInfo = patientInfo;
        this.diagnoseService = diagnoseService;
        this.dischargeFormService = dischargeFormService;
        this.patientService = patientService;
        this.personalService = personalService;
        this.prescriptionService = prescriptionService;
        this.qualificationService = qualificationService;
        this.treatmentService = treatmentService;
    }

    public PatientInfo getPatientInfo(int idPatient){
        try{
            this.patientInfo.setId(patientService.findById(idPatient).getId());
        }
        catch (NullPointerException exception){
            return null;
        }
        this.patientInfo.setIdPatient(idPatient);
        this.patientInfo.setName(patientService.findById(idPatient).getName());
        this.patientInfo.setPhone_Number(patientService.findById(idPatient).getPhoneNumber());
        this.patientInfo.setTreatment(getPatientTreatments(idPatient));
        return this.patientInfo;
    }

    public List<String> getPatientTreatments(int patientId){
        ArrayList<String> treatmentList = new ArrayList<>();
        prescriptionService.findAll().stream()
                .filter(prescription -> prescription.getIdPatient().equals(patientId))
                .forEach(prescription -> treatmentList.add(treatmentService.findById(prescription.getIdTreatment())
                        .getTreatment()));
        return treatmentList;
    }

    public List<DischargeForm> getPatientDischargeForm(int id_Patients){
        return dischargeFormService.getDischargeFormsByPatientId(id_Patients);
    }

    public List<Diagnose> getPatientDiagnoses(int id_Patients){
        return diagnoseService.getDiagnosesByPatientId(id_Patients);
    }

    public void dischargePatient(int id_Patient, String discharge_Date, String final_Diagnose){
        DischargeForm dischargeForm = new DischargeForm();
        dischargeForm.setIdPatient(id_Patient);
        dischargeForm.setDischargeDate(discharge_Date);
        dischargeForm.setFinalDiagnose(final_Diagnose);
        dischargeFormService.save(dischargeForm);
    }

    public Diagnose addDiagnose(int id_Patient, String symptoms, String diagnose){
        return new Diagnose(id_Patient, symptoms, diagnose);
    }

    public Prescription addPrescription(int id_Patient, int id_Prescription){
        return new Prescription(id_Patient, id_Prescription);
    }
}
