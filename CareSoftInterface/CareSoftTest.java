public class CareSoftTest {
    public static void main(String[] args) {
        // Testing Physician
        Physician doctor = new Physician(12345);
        System.out.println(doctor.assignPIN(1234));  // Should return true
        System.out.println(doctor.accessAuthorized(12345));  // Should return true
        System.out.println(doctor.accessAuthorized(54321));  // Should return false

        // Testing AdminUser
        AdminUser admin = new AdminUser(67890);
        System.out.println(admin.assignPIN(1234567));  // Should return true
        System.out.println(admin.accessAuthorized(67890));  // Should return true
        System.out.println(admin.accessAuthorized(12345));  // Should return false
        System.out.println(admin.reportSecurityIncidents());  // Should display the incident report
    }
}
