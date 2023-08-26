public class Square {

    private String number;

    // TODO: transformar em enum
    private String color;

    public Square(String n, String c) {
        this.number = n;
        this.color = c;
    }

    public String toGameFormat() {
        return this.number + "-" + this.color;
    }
    
}
