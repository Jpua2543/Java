import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    private Random rand = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            random10.add(rand.nextInt(20) + 1);
        }
        return random10;
    }

    public String getRandomLetterWithArray() {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
        return alphabet[rand.nextInt(26)];
    }

    public String getRandomLetter() {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = alphabetString.charAt(rand.nextInt(26));
        return String.valueOf(randomChar);
    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

    // Ninja Bonus
    public ArrayList<Integer> shuffleArray(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int randomIndex = rand.nextInt(arr.size());
            int temp = arr.get(i);
            arr.set(i, arr.get(randomIndex));
            arr.set(randomIndex, temp);
        }
        return arr;
    }
}
