public class jogador {
    private String nome;
    private int dindin;

        
    public jogador(String n, int d) {
        this.nome = n;
        this.dindin = d;
    }

    public String player(){
        return this.nome + " $" + this.dindin;
    }

    public int converter(){
        return this.dindin;
    }

}
/*tuplaCasas{{1,vermelho} , {2,preto} , {3,vermelho} , {4,preto} }


for casa in tuplaCasas
Square c = new Square(casa[0], casa[1]);*/