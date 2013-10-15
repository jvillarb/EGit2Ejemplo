package spai.egit2;

public class NumeroEntero {
    private int valor;

    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    public NumeroEntero() {
        this(0);
    }

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar() {
        this.setValor(this.valor + 1);
    }

    public void doblar() {
        this.setValor(this.valor * 2);
    }

    public void decrementar() {
        this.valor--;
    }

    //crear un metodo incremetarValor(int valor) y decrementarValor(int valor)
    
    public int incrementarValor(int valor) {
    	return this.valor+valor;
    }

    public int decrementarValor(int valor) {
    	return this.valor-valor;	
    }

}
