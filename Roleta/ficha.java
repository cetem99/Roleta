public class ficha {
    private int valor;
    private String cor;
        
    public ficha(int v, String c) {
        this.valor = v;
        this.cor = c;
    }

    public String toGameFormat() {
        return this.valor + "-" + this.cor;
    }
    


}
