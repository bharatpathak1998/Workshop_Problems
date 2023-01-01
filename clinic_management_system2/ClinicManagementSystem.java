package clinic_management_system2;

import java.util.Scanner;

public class ClinicManagementSystem {

    Patient patient = new Patient();

    void patientDetails() {
        patient.setName("Bharat Pathak");
        patient.setAge(24);
        patient.setGender("Male");
        patient.setPhoneNumber("7559201321");
        System.out.println(patient);
    }

    Doctor doctor = new Doctor();

    void doctorDetails() {
        doctor.setName("Manish Kumar");
        doctor.setAge(50);
        doctor.setGender("Male");
        doctor.setSpecialization("ENT");
        System.out.println(doctor);
    }

    void appointmentDetails() {
        Appointment appointment = new Appointment();
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointment.setDate("12/01/2022");
        appointment.setTime("10:00 AM");
        System.out.println(appointment);
    }

    public static void main(String[] args) {
        ClinicManagementSystem clinicManagementSystem = new ClinicManagementSystem();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.print("1.Patient Details ");
            System.out.print(" 2.Doctor Details ");
            System.out.print(" 3.Appointment Details ");
            System.out.print(" 0.exit\n->");

            int options = sc.nextInt();

            switch (options) {
                case 1:
                    clinicManagementSystem.patientDetails();
                    break;
                case 2:
                    clinicManagementSystem.doctorDetails();
                    break;
                case 3:
                    clinicManagementSystem.appointmentDetails();
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
