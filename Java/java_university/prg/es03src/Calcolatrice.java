package prg.es03;

public class Calcolatrice{

	public Calcolatrice(){}

	double[] generaVettori(int L){
		double[] vettore = new double[L];
		for(int i = 0; i < L; i++){
			vettore[i] = Math.random() * 1000;
		}
		return vettore;
	}

	double[] sommaVettori(double[] a, double[] b){
		double[] sum = new double[a.length];
		if(a.length == b.length){
			for(int i=0;i<a.length;i++){
				sum[i] = a[i] + b[i];
			}
			return sum;
		} else {
			return a;
		}
	}

	double[] concatenaVettori(double[]a, double[] b){
		double[] vettore = new double[a.length + b.length];
		for(int i = 0; i<a.length;i++){
			vettore[i] = a[i];
		}	
		for(int i = a.length ;i<a.length + b.length;i++){
			vettore[i] = b[i - a.length];
		}
		return vettore;
	}

	void stampaVettori(double[] a){
		for(double b : a){
			System.out.print(b + " ");
		}
	}

	double[][] generaMatrici(int R, int C){
		double[][] matrice = new double[R][C];
		for(int i = 0; i < R; i++){
			for(int j = 0; j<C;j++){
				matrice[i][j] = Math.random() * 100;
			}
		}
		return matrice;
	}

	double[][] sommaMatrici(double[][] a, double[][] b){
		double[][] sum = new double[a.length][a[0].length];
		if (a.length != b.length) {
			return a;
		}
		for(int i = 0;i<a.length;++i){
			if(a[i].length != b[i].length){
				return a;
			}
		}
		for(int i = 0;i<a.length;++i){
			for(int j=0;j<a[i].length;++j){
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}

	void stampaMatrici(double[][] m){
		int rows = m.length;
		int cols = m[0].length;
		System.out.println(" ");
		for(int i = 0;i<rows;++i){
			for(int j = 0;j<cols;++j){
				System.out.println(m[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
}
