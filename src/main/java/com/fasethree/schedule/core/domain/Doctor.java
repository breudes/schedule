package com.fasethree.schedule.core.domain;

import com.fasethree.schedule.core.domain.appointment.Appointment;
import com.fasethree.schedule.core.domain.user.User;

import java.util.List;

public class Doctor {
    private Long id;
    private String doctorLicense;
    private String specialty;
    private User user;
    private List<Appointment> appointments;
}
