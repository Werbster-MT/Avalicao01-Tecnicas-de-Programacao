import java.util.Random;

public class DistribuicaoNormal extends Distribuicao {
    private float media;
    private float desvioPadrao;
    private Random random;

    public DistribuicaoNormal(float media, float desvioPadrao) {
        this.media = media;
        this.desvioPadrao = desvioPadrao;
        this.random = new Random();
    }

    @Override
    public float[] gerarValores(int n) {
        float[] valores = new float[n];
        for (int i = 0; i < n; i++) {
            valores[i] = (float) (media + desvioPadrao * random.nextGaussian());
        }
        return valores;
    }
}
