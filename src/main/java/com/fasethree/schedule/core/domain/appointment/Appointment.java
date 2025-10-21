package com.fasethree.schedule.core.domain.appointment;

import java.time.LocalDateTime;

public class Appointment {
    private Long id;
    private Long patientId;
    private Long doctorId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private AppointmentType appointmentType;
}
