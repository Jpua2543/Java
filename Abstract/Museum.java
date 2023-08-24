import java.util.ArrayList;
import java.util.Collections;

public class Museum {
    public static void main(String[] args) {
        ArrayList<Art> museum = new ArrayList<Art>();

        Painting painting1 = new Painting("Starry Night", "Vincent van Gogh", "A masterpiece depicting the night sky.", "Oil");
        Painting painting2 = new Painting("Mona Lisa", "Leonardo da Vinci", "A famous portrait of a woman with a mysterious smile.", "Oil");
        Painting painting3 = new Painting("The Persistence of Memory", "Salvador Dali", "Surreal painting featuring melting clocks.", "Oil");
        Sculpture sculpture1 = new Sculpture("David", "Michelangelo", "A marble sculpture of a biblical hero.", "Marble");
        Sculpture sculpture2 = new Sculpture("The Thinker", "Auguste Rodin", "A bronze sculpture of a man deep in thought.", "Bronze");

        museum.add(painting1);
        museum.add(painting2);
        museum.add(painting3);
        museum.add(sculpture1);
        museum.add(sculpture2);

        Collections.shuffle(museum);

        for (Art artwork : museum) {
            artwork.viewArt();
            System.out.println();
        }
    }
}
