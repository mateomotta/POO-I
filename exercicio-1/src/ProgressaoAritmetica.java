class ProgressaoAritmetica extends Progressao {
    private int inicio;
    private int razao;
    private int atual;

    public ProgressaoAritmetica(int inicio, int razao) {
        this.inicio = inicio;
        this.razao = razao;
        this.reset();
    }

    @Override
    public int proximo() {
        int resultado = this.atual;
        this.atual += this.razao;
        return resultado;
    }

    @Override
    public void reset() {
        this.atual = this.inicio;
    }
}
