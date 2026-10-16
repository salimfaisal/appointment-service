package com.faisal.appointment.controller;

import com.faisal.appointment.dto.AppointmentDTO;
import com.faisal.appointment.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @GetMapping("/patients/{patientId}")
    public List<AppointmentDTO> getAppointmentsForPatient(
            @PathVariable String patientId) {
        return service.getAppointmentsForPatient(patientId);
    }
}
