import java.text.DecimalFormat;
import java.util.Random;

public class DistribuicaoExponencial extends Distribuicao {
    private float lambda;
    private Random random;
    private DecimalFormat df;

    public DistribuicaoExponencial(double lambda) {
        this.lambda = (float) lambda;
        this.random = new Random();
    }

    @Override
    public float[] gerarValores(int n) {
        float[] valores = new float[n];
        for (int i = 0; i < n; i++) {
            valores[i] = (float) ((-Math.log(1 - random.nextFloat()) / lambda));
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
