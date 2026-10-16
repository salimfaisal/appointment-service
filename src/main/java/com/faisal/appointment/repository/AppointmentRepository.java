package com.faisal.appointment.repository;

import com.faisal.appointment.dto.AppointmentDTO;

import java.util.List;

public interface AppointmentRepository {

    List<AppointmentDTO> findByPatientId(String patientId);
}
