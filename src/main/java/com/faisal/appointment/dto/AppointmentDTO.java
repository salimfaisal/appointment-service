package com.faisal.appointment.dto;

import java.time.Instant;
import java.util.UUID;

public record AppointmentDTO(
        UUID id,
        String patientId,
        String description,
        Instant scheduledAt,
        String status
) {}
