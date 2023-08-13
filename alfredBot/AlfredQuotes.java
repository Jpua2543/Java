// Required imports
import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {

    // Basic greeting method
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    // Greeting that includes the person's name
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    // Returns a polite announcement of the current date and time
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "It is currently " + currentDate.toString() + ".";
    }
    
    // Responds to a conversation string
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    
    // NINJA BONUS
    // Overloaded method for Ninja Bonus to return greeting based on time of day
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    // SENSEI VERSION
    // Overloaded method using Date to determine the day period
    public String guestGreeting() {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        int hour = Integer.parseInt(formatter.format(currentDate));

        String dayPeriod;
        if(hour < 12) {
            dayPeriod = "morning";
        } else if(hour < 17) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }
        return String.format("Good %s, sir. Lovely to see you.", dayPeriod);
    }

    // SENSEI BONUS
    // Your own method where Alfred yells
    public String angryYelling(String message) {
        return message.toUpperCase() + "!!!";
    }
}
