package com.faisal.appointment.repository;

import com.faisal.appointment.dto.AppointmentDTO;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Repository
public class InMemoryAppointmentRepository implements AppointmentRepository {

    private final List<AppointmentDTO> appointments = List.of(
            new AppointmentDTO(
                    UUID.fromString("aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa"),
                    "11111111-1111-1111-1111-111111111111",
                    "Annual check-up",
                    Instant.parse("2026-11-15T14:00:00Z"),
                    "SCHEDULED"
            ),
            new AppointmentDTO(
                    UUID.fromString("bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb"),
                    "11111111-1111-1111-1111-111111111111",
                    "Follow-up consultation",
                    Instant.parse("2026-11-22T15:30:00Z"),
                    "SCHEDULED"
            )
    );

    @Override
    public List<AppointmentDTO> findByPatientId(String patientId) {
        return appointments.stream()
                .filter(appointment -> appointment.patientId().equals(patientId))
                .toList();
    }
}
