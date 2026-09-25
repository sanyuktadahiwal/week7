public abstract class ArtPiece{
    public abstract String describe();
}
public class GalleryDescriptionCards extends ArtPiece{
    private String title;
    public Painting(String title) {
        this.title = title;
        System.out.println(describe());
    }
    public Sculpture(String title) {
        this.title = title;
        System.out.println(describe());
    }
    @Override
    public String describe() {
        return "Painting: " + title + " framed on canvas";
    }
    @Override
    public String describe() {
        return "Sculpture: " + title + " carved from stone";
    }
    public static void main(String[] args){
        Painting p = new Painting("Sunset Fields");
        p.describe();
        Sculpture s = new Sculpture("The Thinker II");
        s.describe();
    }
}