package clinic_management_system1;

public class ClinicManagementSystem {
    public static void main(String[] args) {
        Patient patient = new Patient("Bharat Pathak", 24, "Male", "7559201321");
        Doctor doctor = new Doctor("Manish Kumar", 50, "Male", "ENT");
        Appointment appointment = new Appointment(patient, doctor, "12/01/2022", "10:00 AM");

        System.out.println(patient);
        System.out.println(doctor);
        System.out.println(appointment);
    }
}
