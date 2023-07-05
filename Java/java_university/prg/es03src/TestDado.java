package prg.es03;

public class TestDado{
	public static void main(String[] args) {
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		int[] sum = new int[13];
		
		for(int i = 0;i<100;++i){
			if(sum[d1.lancia()+d2.lancia()] == 12){
				System.out.println("12!!!");
			}
		}
		for(int i = 0; i<100;++i){
			sum[d1.lancia()+d2.lancia()]++;
		}
		for(int i = 0; i<sum.length;++i){
			System.out.println(i + ": "+sum[i]);
		}
	}
}