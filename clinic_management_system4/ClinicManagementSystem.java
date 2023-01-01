package clinic_management_system4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClinicManagementSystem {
    List<Patient> patientList = new ArrayList<>();
    List<Doctor> doctorList = new ArrayList<>();
    List<Appointment> appointmentList = new ArrayList<>();


    void addDetails() {
        Patient patient = new Patient();
        patient.setName("Bharat Pathak");
        patient.setAge(24);
        patient.setGender("Male");
        patient.setPhoneNumber("7559201321");

        Patient patient1 = new Patient();
        patient1.setName("Mohit Pathak");
        patient1.setAge(19);
        patient1.setGender("Male");
        patient1.setPhoneNumber("9156821217");

        patientList.add(patient);
        patientList.add(patient1);

        Doctor doctor = new Doctor();
        doctor.setName("Manish Kumar");
        doctor.setAge(50);
        doctor.setGender("Male");
        doctor.setSpecialization("ENT");

        Doctor doctor1 = new Doctor();
        doctor1.setName("Manish Agrawal");
        doctor1.setAge(55);
        doctor1.setGender("Male");
        doctor1.setSpecialization("Dermatologists");

        doctorList.add(doctor);
        doctorList.add(doctor1);

        Appointment appointment = new Appointment();
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointment.setDate("12/01/2022");
        appointment.setTime("10:00 AM");

        Appointment appointment1 = new Appointment();
        appointment1.setPatient(patient1);
        appointment1.setDoctor(doctor1);
        appointment1.setDate("12/01/2022");
        appointment1.setTime("1:00 PM");

        appointmentList.add(appointment);
        appointmentList.add(appointment1);

        System.out.println("Details Added Successfully.");
    }

    void showPatientDetails() {
        patientList.forEach(System.out::println);
    }

    void showDoctorDetails() {
        doctorList.forEach(System.out::println);
    }

    void showAppointmentDetails() {
            appointmentList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ClinicManagementSystem clinicManagementSystem = new ClinicManagementSystem();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.print("1.Add Details ");
            System.out.print(" 2.Show Patient Details ");
            System.out.print(" 3.Show Doctor Details ");
            System.out.print(" 4.show Appointment Details ");
            System.out.print(" 0.exit\n->");

            int options = sc.nextInt();

            switch (options) {
                case 1:
                    clinicManagementSystem.addDetails();
                    break;
                case 2:
                    clinicManagementSystem.showPatientDetails();
                    break;
                case 3:
                    clinicManagementSystem.showDoctorDetails();
                    break;
                case 4:
                    clinicManagementSystem.showAppointmentDetails();
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    System.out.println("Please Choose Valid Option!");
            }
        }
    }
}
