package com.faisal.appointment.service;

import com.faisal.appointment.dto.AppointmentDTO;
import com.faisal.appointment.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public List<AppointmentDTO> getAppointmentsForPatient(String patientId) {
        return repository.findByPatientId(patientId);
    }
}
