package com.numetry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.Entity.Appointment;
import com.numetry.Entity.Doctor;
import com.numetry.Entity.Hospital;
import com.numetry.dto.AppointmentRequest;
import com.numetry.service.IDoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private IDoctorService doctorService;
    
    @PostMapping("/registerDoc")
    public ResponseEntity<Doctor> registerDoctor(@RequestBody Doctor doctor) {
        Doctor registeredDoctor = doctorService.registerDoctor(doctor);
        return new ResponseEntity<>(registeredDoctor, HttpStatus.CREATED);
    }
    @PostMapping("/registerHospital")
    public ResponseEntity<Hospital> registerHospital(@RequestBody Hospital hospital) {
        Hospital registeredHospital = doctorService.registerHospital(hospital);
        return new ResponseEntity<>(registeredHospital, HttpStatus.CREATED);
    }

    @GetMapping("/appointments/{doctorId}")
    public ResponseEntity<List<Appointment>> getDoctorAppointments(@PathVariable Integer doctorId) {
        List<Appointment> appointments = doctorService.getDoctorAppointments(doctorId);
        return new ResponseEntity<>(appointments, HttpStatus.OK);
    }
    
    @PostMapping("/setAppointment")
    public ResponseEntity<Appointment> setAppointment(@RequestBody AppointmentRequest appointmentRequest) {
    
        Doctor doctor = doctorService.getDoctorById(appointmentRequest.getDoctorId());
        Hospital hospital = doctorService.getHospitalById(appointmentRequest.getHospitalId());

        if (doctor == null || hospital == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        }

        // Create an appointment object with the retrieved doctor and hospital
        Appointment appointment = new Appointment();
        appointment.setDoctor(doctor);
        appointment.setHospital(hospital);
       // appointment.setDay(appointmentRequest.getDay());
        //appointment.setTime(appointmentRequest.getTime());
        appointment.setVisitFrequency(appointmentRequest.getVisitFrequency());

        // Set the appointment
        Appointment createdAppointment = doctorService.setAppointment(appointment);
        return new ResponseEntity<>(createdAppointment, HttpStatus.CREATED);
    }
    @GetMapping("/docList")
    public ResponseEntity<List<Doctor>> getAllDoctor(){
    	List<Doctor> list=doctorService.getDoctorList();
    	return new ResponseEntity<>(list,HttpStatus.CREATED);
    }
    
    @GetMapping("/hospitalList")
    public ResponseEntity<List<Hospital>> getAllHospital(){
    	List<Hospital> list=doctorService.getHospitalList();
    	return new ResponseEntity<>(list,HttpStatus.CREATED);
    }
}
    

