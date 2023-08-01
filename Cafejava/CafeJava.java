public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 4.5;
    
        // Customer name variables
        String customer1 = "Cindhuri";
        String customerSam = "Sam";
        String customerJimmy = "Jimmy";
        String customerNoah = "Noah";
    
        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrderSam = false;
        boolean isReadyOrderJimmy = false;
        boolean isReadyOrderNoah = true; // Assumption based on the task
    
        // APP INTERACTION SIMULATION
        System.out.println(generalGreeting + customer1 + pendingMessage); // Cindhuri's Order Status
        // Noah's Order
        System.out.println(generalGreeting + customerNoah);
        if(isReadyOrderNoah) {
            System.out.println(customerNoah + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customerNoah + pendingMessage);
        }
        
        // Sam's Order
        System.out.println(generalGreeting + customerSam);
        double samTotal = 2 * lattePrice; // 2 lattes
        System.out.println(displayTotalMessage + samTotal);
        if(isReadyOrderSam) {
            System.out.println(customerSam + readyMessage);
        } else {
            System.out.println(customerSam + pendingMessage);
        }
        
        // Jimmy's Order adjustment
        System.out.println(generalGreeting + customerJimmy);
        double jimmyTotalDifference = lattePrice - dripCoffeePrice; // Difference between latte and drip coffee
        System.out.println(displayTotalMessage + jimmyTotalDifference);
    }
}
