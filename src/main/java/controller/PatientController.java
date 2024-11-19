package controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import model.Appointment;
import service.AppointmentService;


public class PatientController {

	@Autowired
    private AppointmentService patientService;

    @GetMapping("/appointments")
    public String viewAppointments(Model model) {
        model.addAttribute("appointments", patientService.getAppointments());
        return "appointments";
    }

    @GetMapping("/book")
    public String bookAppointmentForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        return "bookAppointment";
    }

    @PostMapping("/book")
    public String bookAppointment(@ModelAttribute Appointment appointment) {
        patientService.bookAppointment(appointment);
        return "redirect:/patient/appointments";
    }
	
	
}
