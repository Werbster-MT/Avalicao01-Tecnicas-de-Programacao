import java.util.Random;

public class DistribuicaoUniforme extends Distribuicao {
    private float minimo;
    private float maximo;
    private Random random;

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
}