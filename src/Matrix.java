import java.text.DecimalFormat;
import java.util.Random;
import java.util.function.Function;

/**
 * Created by stt44293 on 10.10.2017.
 */
public class Matrix  {
   private double[][] matrix;
    private Random rng = new Random();
    public int x,y;
    DecimalFormat df = new DecimalFormat("#.##");
    public Matrix(int x, int y) {
        matrix = new double[x][y];
        this.x = x;
        this.y = y;
    }

    public double get(int x, int y){
        return matrix[x][y];
    }

    public void random(){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                matrix[i][j] = rng.nextDouble();
            }
        }
    }

    public void set(int x, int y, double v) {
        matrix[x][y] = v;
    }


    public void process(Funktion f){
        for (int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++){
                set(j, i, f.compute(get(j,i)));
            }
        }

    }


    public void print(){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(df.format(matrix[i][j]) + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Matrix m = new Matrix(5,5);
        m.random();
        m.print();
    }
}
