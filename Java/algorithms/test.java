public class test{
	public static void main(String[] args) {
		double l = 2.0;
		double b = 90.0;
		double sinb = 1.0;
		double a = 0;
		for(int i = 2;i<32;i++){
			a = l * sinb ;
			l = Math.pow(2.0,i);
			sinb = Math.sqrt(1-(Math.sqrt(1-Math.sin(b)*Math.sin(b)))*0.5);
			b/=2;
			System.out.println("n="+i+" " + a);
		}
	}
}