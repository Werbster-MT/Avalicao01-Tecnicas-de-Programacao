public abstract class Distribuicao {
    public abstract float[] gerarValores(int n);
    public abstract float calcularMedia(float[] valores);
    public abstract float calcularVariancia(float[] valores);

    public void imprimirValores(float[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f", valores[i]);
            if (i < valores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
