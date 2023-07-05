package prg.es08;

public class TestVeicolo{
	public static void main(String[] args){
		Bicicletta bici = new Bicicletta(0.0, 0.0, 5.0, 5.0, 9.81, 9.81, "BMX");
		Automobile auto = new Automobile(0.0, 0.0, 5.0, 5.0, 9.81, 9.81, 2000, "GD628PL");
		Ciclomotore moto = new Ciclomotore(0.0, 0.0, 5.0, 5.0, 9.81, 9.81, 700, 12893929);
		
	    System.out.println("ecco le informazioni dei veicoli: ");
	    System.out.println(bici);
		System.out.println("");
		System.out.println(auto);
		System.out.println("");
		System.out.println(moto);
		System.out.println("");

		bici.muovi(10.0);
		auto.muovi(10.0);
		moto.muovi(10.0);
		System.out.println("La posizione dopo 10 secondi è ");
		System.out.println(bici);
		System.out.println(auto);
		System.out.println(moto);
		System.out.println();

	   	bici.muovi(5.0);
	   	auto.muovi(5.0);
	   	moto.muovi(5.0);
		System.out.println("La posizione dopo altri 5 secondi è ");
		System.out.println(bici);
		System.out.println(auto);
		System.out.println(moto);
		
	}
}