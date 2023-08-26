public class Group {

    private String name;
    private Square[] squares;

    public Group(String n, Square[] s) {
        this.name = n;
        this.squares = s;

    }
    
    public String toGameFormat() {
        return this.name;
    }

    public void squaresToConsole() {
        for(int i = 0; i < this.squares.length; i++) {
            System.out.println(this.squares[i].toGameFormat());
        }
        
    }
}
