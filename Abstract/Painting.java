public class Painting extends Art {
    private String paintType;

    public Painting(String title, String author, String description, String paintType) {
        super(title, author, description);
        this.paintType = paintType;
    }

    @Override
    public void viewArt() {
        System.out.println("Painting Title: " + title);
        System.out.println("Artist: " + author);
        System.out.println("Description: " + description);
        System.out.println("Paint Type: " + paintType);
    }
}
