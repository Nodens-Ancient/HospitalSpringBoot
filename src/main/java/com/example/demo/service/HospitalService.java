package com.example.demo.service;

import com.example.demo.models.PatientInfo;
import com.example.demo.models.Prescription;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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
        this.patientInfo.setId(patientService.findById(idPatient).getId());
        this.patientInfo.setName(patientService.findById(idPatient).getName());
        this.patientInfo.setPhone_Number(patientService.findById(idPatient).getPhoneNumber());
        this.patientInfo.setTreatment(getTreatments(idPatient));
        return this.patientInfo;
    }

    private List<String> getTreatments(int patientId){
        ArrayList<String> treatmentList = new ArrayList<>();
        for (Prescription p:
                prescriptionService.findAll()) {
            if(p.getIdPatient() == patientId){
                treatmentList.add(treatmentService.findById(p.getIdTreatment()).getTreatment());
            }
        }
        return treatmentList;
    }
}
