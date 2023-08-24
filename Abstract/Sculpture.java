public class Sculpture extends Art {
    private String material;

    public Sculpture(String title, String author, String description, String material) {
        super(title, author, description);
        this.material = material;
    }

    @Override
    public void viewArt() {
        System.out.println("Sculpture Title: " + title);
        System.out.println("Artist: " + author);
        System.out.println("Description: " + description);
        System.out.println("Material: " + material);
    }
}
