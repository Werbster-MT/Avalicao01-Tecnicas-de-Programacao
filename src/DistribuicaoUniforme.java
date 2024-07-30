import java.util.Random;

public class DistribuicaoUniforme extends Distribuicao {
    private float minimo;
    private float maximo;
    private Random random;
    private float[] valores;

    public DistribuicaoUniforme(float minimo, float maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
        this.random = new Random();
    }

    @Override
    public float[] gerarValores(int n) {
        float[] valores = new float[n];
        for (int i = 0; i < n; i++) {
            valores[i] = minimo + (maximo - minimo) * random.nextFloat();
        }
        return valores;
    }

    @Override
    public float calcularMedia(float[] valores) {
        float soma = 0.0F;
        for (float valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    @Override
    public float calcularVariancia(float[] valores) {
        float media = calcularMedia(valores);
        float soma = 0.0F;
        for (float valor : valores) {
            soma += (float) Math.pow(valor - media, 2);
        }
        return soma / valores.length;
    }
}