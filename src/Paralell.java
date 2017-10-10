/**
 * Created by stt44293 on 10.10.2017.
 */
public class Paralell {
    public static void main(String[] args) {
        Matrix m = new Matrix(100,100);
        m.random();
        m.print();
        for(int i = 0; i < m.x; i++){
            for(int j = 0; j < m.y; j++){
                for(int k = 0; k < 1000; k++){
                    m.set(i,j, Math.pow(Math.E, Math.log(m.get(i,j))));
                }
            }

        }
        System.out.println();
        m.print();

    }
}
