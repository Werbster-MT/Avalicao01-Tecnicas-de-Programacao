public class Estatisticas<T extends Distribuicao> {
    private T distribuicao;
    private float[] valores;
    public Estatisticas(T distribuicao) {
        this.distribuicao = distribuicao;
    }

    public void imprimirValoresGerados(int n) {
        this.valores = distribuicao.gerarValores(n);
        distribuicao.imprimirValores(valores);
    }

    public void imprimirMedia() {
        double media = distribuicao.calcularMedia(this.valores);
        System.out.println("Média: " + String.format("%.2f", media));
    }

    public void imprimirVariancia() {
        double variancia = distribuicao.calcularVariancia(this.valores);
        System.out.println("Variância: " + String.format("%.2f", variancia));
    }
}
