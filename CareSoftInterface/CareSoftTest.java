public class CareSoftTest {
    public static void main(String[] args) {
        // Testing Physician
        Physician doctor = new Physician(12345);
        System.out.println(doctor.assignPIN(1234));
        System.out.println(doctor.accessAuthorized(12345));
        System.out.println(doctor.accessAuthorized(54321));

        // Testing AdminUser
        AdminUser admin = new AdminUser(67890);
        System.out.println(admin.assignPIN(1234567));
        System.out.println(admin.accessAuthorized(67890));
        System.out.println(admin.accessAuthorized(12345));
        System.out.println(admin.reportSecurityIncidents());
    }
}
