package com.fasethree.schedule.core.domain;

import com.fasethree.schedule.core.domain.appointment.Appointment;
import com.fasethree.schedule.core.domain.user.User;

import java.util.List;

public class Nurse {
    private Long id;
    private String nurseLicense;
    private User user;
    private List<Appointment> appointments;
}
