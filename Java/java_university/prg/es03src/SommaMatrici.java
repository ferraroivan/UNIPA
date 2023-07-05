package prg.es03;
import java.lang.Math;

public class SommaMatrici{
	public static void main(String[] args) {
		double[][] matrice1 = new double[3][5];
		double[][] matrice2 = new double[3][5];
		double[][] sum = new double[3][5];

		for(int i = 0; i< matrice1.length;++i){
			for(int j = 0;j< matrice1[i].length;++j){
				matrice1[i][j] = (Math.random() * 100);
				matrice2[i][j] = (Math.random() * 100);
				sum[i][j] = matrice1[i][j] + matrice2[i][j];
				System.out.println(sum[i][j]);
			}
		}
		
	}
}