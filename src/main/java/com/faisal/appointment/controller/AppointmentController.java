package com.faisal.appointment.controller;

import com.faisal.appointment.dto.AppointmentDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @GetMapping("/patients/{patientId}")
    public List<AppointmentDTO> getAppointmentsForPatient(
            @PathVariable String patientId) {
        return List.of();
    }
}
