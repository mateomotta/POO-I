class ProgressaoFibonacci extends Progressao {
    private int anterior;
    private int atual;

    public ProgressaoFibonacci() {
        this.reset();
    }

    @Override
    public int proximo() {
        int resultado = this.atual;
        int novoAtual = this.anterior + this.atual;
        this.anterior = this.atual;
        this.atual = novoAtual;
        return resultado;
    }

    @Override
    public void reset() {
        this.anterior = 0;
        this.atual = 1;
    }
}
