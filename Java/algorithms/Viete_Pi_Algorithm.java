public class Viete_Pi_Algorithm{
	public static void main(String[] args) {
		double p = 2.0;
		double beta = 45.0;
		double cosb = 0;
		for(int n = 3;n<=30;n++){
			cosb = Math.sqrt(1+Math.cos(beta)/2);
			p=p/cosb;
			beta=beta/2;
			System.out.println("n="+n+" "+p);
		}
	}
}