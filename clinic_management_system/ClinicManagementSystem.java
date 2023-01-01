package clinic_management_system;

import java.util.Scanner;

public class ClinicManagementSystem {

    void patientDetails(Patient patient, Patient patient1) {
        System.out.println("Patient 1 Details : ");
        System.out.println("Name : " + patient.getName());
        System.out.println("Age : " + patient.getAge());
        System.out.println("Gender : " + patient.getGender());
        System.out.println("Phone Number : " + patient.getPhoneNumber());

        System.out.println("\nPatient 2 Details : ");
        System.out.println("Name : " + patient1.getName());
        System.out.println("Age : " + patient1.getAge());
        System.out.println("Gender : " + patient1.getGender());
        System.out.println("Phone Number : " + patient1.getPhoneNumber());
    }

    void doctorDetails(Doctor doctor, Doctor doctor1) {
        System.out.println("Doctor 1 Details : ");
        System.out.println("Name : " + doctor.getName());
        System.out.println("Age : " + doctor.getAge());
        System.out.println("Gender : " + doctor.getGender());
        System.out.println("Specialization : " + doctor.getSpecialization());

        System.out.println("\nDoctor 2 Details : ");
        System.out.println("Name : " + doctor1.getName());
        System.out.println("Age : " + doctor1.getAge());
        System.out.println("Gender : " + doctor1.getGender());
        System.out.println("Specialization : " + doctor1.getSpecialization());
    }

    void appointmentDetails(Appointment appointment, Appointment appointment1) {
        System.out.println("Appointment 1 Details : ");
        System.out.println("Patient : " + appointment.getPatient());
        System.out.println("Doctor : " + appointment.getDoctor());
        System.out.println("Date : " + appointment.getDate());
        System.out.println("Time : " + appointment.getTime());

        System.out.println("\nAppointment 2 Details : ");
        System.out.println("Patient : " + appointment1.getPatient());
        System.out.println("Doctor : " + appointment1.getDoctor());
        System.out.println("Date : " + appointment1.getDate());
        System.out.println("Time : " + appointment1.getTime());
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Bharat Pathak", 24, "Male", "7559201321");
        Doctor doctor = new Doctor("Manish Kumar", 50, "Male", "ENT");
        Appointment appointment = new Appointment(patient, doctor, "12/01/2022", "10:00 AM");

        Patient patient1 = new Patient("Mohit Pathak", 19, "Male", "9156821217");
        Doctor doctor1 = new Doctor("Manish Agrawal", 55, "Male", "Dermatologist");
        Appointment appointment1 = new Appointment(patient1, doctor1, "15/01/2022", "1:00 PM");

        ClinicManagementSystem clinicManagementSystem = new ClinicManagementSystem();

        boolean exit = true;

        while (exit) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1.Show Patient Details ");
            System.out.print(" 2.Show Doctor Details ");
            System.out.print(" 3.Show Appointment Details ");
            System.out.print(" 0.Exit\n->");
            int options = sc.nextInt();
            switch (options) {
                case 1:
                    clinicManagementSystem.patientDetails(patient, patient1);
                    break;
                case 2:
                    clinicManagementSystem.doctorDetails(doctor, doctor1);
                    break;
                case 3:
                    clinicManagementSystem.appointmentDetails(appointment, appointment1);
                    break;
                case 0:
                    exit = false;
                    break;
                default:
                    System.out.println("Please Choose Valid Options!");
            }
        }
    }
}
