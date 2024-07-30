import java.util.Random;

public class DistribuicaoPoisson extends Distribuicao {
    private float lambda;
    private Random random;

    public DistribuicaoPoisson(double lambda) {
        this.lambda = (float) lambda;
        this.random = new Random();
    }

    @Override
    public float[] gerarValores(int n) {
        float[] valores = new float[n];
        for (int i = 0; i < n; i++) {
            int k = 0;
            float p = 1.0F;
            float L = (float) Math.exp(-lambda);
            do {
                k++;
                p *= random.nextFloat();
            } while (p > L);
            valores[i] = k - 1;
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
