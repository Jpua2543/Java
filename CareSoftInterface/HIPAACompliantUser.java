public interface HIPAACompliantUser {
    boolean assignPIN(int pin);
    boolean accessAuthorized(Integer id);
}
