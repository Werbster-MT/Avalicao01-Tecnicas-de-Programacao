public abstract class Distribuicao {
    public abstract float[] gerarValores(int n);
    public float calcularMedia(float[] valores) {
        float soma = 0.0F;
        for (float valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }
    public float calcularVariancia(float[] valores) {
        float media = calcularMedia(valores);
        float soma = 0.0F;
        for (float valor : valores) {
            soma += (float) Math.pow(valor - media, 2);
        }
        return soma / valores.length;
    }

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
