public class Main {

    public static void main(String[] args) {

        Square a = new Square("00", "Green");
        Square b = new Square("1", "Red");
        Square c = new Square("2", "Black");
        ficha fichapreta = new ficha(50, "Black");
        ficha fichabranca = new ficha(5, "white");
        jogador player1 = new jogador("osvaldo", 2000);
        
        /*for (int i = 1; i < 12; i++) {

            
            System.out.println(i);
        }
*/

        int p = player1.converter()/fichapreta.fi();
        int h = (player1.converter()-p)/fichabranca.fi();
        int[] dist = {p, h};
        

        aposta ap = new aposta(player1, dist, g);

        System.out.println("|     " + a.toGameFormat() + "    |");
        System.out.println("| " + b.toGameFormat() + " | " + c.toGameFormat() + " |" );

        Square[] arraiDeCasas = {a,b,c};

        Group g = new Group("3-initial-squares", arraiDeCasas);

        System.out.println("|     " + g.toGameFormat() + "    |");
        g.squaresToConsole();

        System.out.println("|     " + fichapreta.toGameFormat() + "    |");
        System.out.println("|¬_¬ " + player1.player() + " |");
    }

}