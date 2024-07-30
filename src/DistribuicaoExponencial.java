import java.text.DecimalFormat;
import java.util.Random;

public class DistribuicaoExponencial extends Distribuicao {
    private float lambda;
    private Random random;

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
}