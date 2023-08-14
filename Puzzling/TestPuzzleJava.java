import java.util.ArrayList;

public class TestPuzzleJava {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // Testing getTenRolls
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Ten Random Rolls: " + randomRolls);
        
        // Testing getRandomLetterWithArray
        System.out.println("Random Letter (With Array): " + generator.getRandomLetterWithArray());
        
        // Testing getRandomLetter
        System.out.println("Random Letter: " + generator.getRandomLetter());
        
        // Testing generatePassword
        System.out.println("Generated Password: " + generator.generatePassword());

        // Testing getNewPasswordSet
        ArrayList<String> newPasswordSet = generator.getNewPasswordSet(5);
        System.out.println("New Password Set: " + newPasswordSet);

        // Testing shuffleArray (Ninja Bonus)
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("Original Array: " + numbers);
        System.out.println("Shuffled Array: " + generator.shuffleArray(numbers));
    }
}
