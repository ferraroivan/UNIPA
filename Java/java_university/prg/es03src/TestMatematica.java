package prg.es03;

public class TestMatematica{
	public static void main(String[] args) {
		Calcolatrice miaCalcolatrice = new Calcolatrice();

		double[] v1 = miaCalcolatrice.generaVettori(3);
		miaCalcolatrice.stampaVettori(v1);
		System.out.println(" ");
		double[] v2 = miaCalcolatrice.generaVettori(3);
		miaCalcolatrice.stampaVettori(v2);
		System.out.println(" ");
		double[] v3 = miaCalcolatrice.generaVettori(5);
		miaCalcolatrice.stampaVettori(v3);
		System.out.println(" ");

		double[] sumV1 = miaCalcolatrice.sommaVettori(v1,v2);
		miaCalcolatrice.stampaVettori(sumV1);
		System.out.println(" ");
		double[] sumV2 = miaCalcolatrice.sommaVettori(v1,v3);
		miaCalcolatrice.stampaVettori(sumV2);
		System.out.println(" ");
		double[] sumV3 = miaCalcolatrice.concatenaVettori(v1,v3);
		miaCalcolatrice.stampaVettori(sumV3);
		System.out.println(" ");

		double[][] m1 = miaCalcolatrice.generaMatrici(3,5);
		miaCalcolatrice.stampaMatrici(m1);
		System.out.println(" ");
		double[][] m2 = miaCalcolatrice.generaMatrici(3,5);
		miaCalcolatrice.stampaMatrici(m2);
		System.out.println(" ");
		double[][] m3 = miaCalcolatrice.generaMatrici(3,5);
		miaCalcolatrice.stampaMatrici(m3);
		System.out.println(" ");

		double[][] sumM1 = miaCalcolatrice.sommaMatrici(m1,m2);
		miaCalcolatrice.stampaMatrici(sumM1);
		System.out.println(" ");
		double[][] sumM2 = miaCalcolatrice.sommaMatrici(m1,m3);
		miaCalcolatrice.stampaMatrici(sumM2);
		System.out.println(" ");



		

	}
}