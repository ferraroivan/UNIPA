package prg.es07;
import java.util.ArrayList;
import java.util.Arrays;


public class Voto{
	// private methods
	ArrayList<Integer> list = new ArrayList<>();
	private int[] voto = new int[15];
	private String[] cantanti = {"Mattia Miraglio","Leonardo Berlini","Enzo Iacchetto","Pino Insegne","Ciro Immobile","Cristiano Rolando",
								"Killian Mbappe","Micheal Phelps","Floyd Loton","Oliver Queen","Bruce Wayne","Silver Surfer","Ivan Ferraro",
								"Ezio Gregio","Aldo Baglio"};
	
	/*
	private int partition(int arr[], int begin, int end){
		int pivot = arr[end];
		int i = (begin-1);
		
		for(int j = begin; j<end;j++){
			if(arr[j] <= pivot){
				i++;
				int swapTerm = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTerm;
			}
		}
		
		int swapTerm = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = swapTerm;
		return i+1;
	}
	
	public static void quickSort(int[] arr, int begin, int end){
		if (begin < end){
			int partitionIndex = partition(arr,begin,end);
			quickSort(arr,begin,partitionIndex-1);
			quickSort(arr,partitionIndex+1,end);
		}
	}*/
	
	// public methods
	public Voto(){
		
	}
	
	public void aggiungiVoto(int index, int phone){
		voto[index-1]++;
		addPhoneNumber(phone);
	}
	
	public void addPhoneNumber(int id){
		list.add(id);
	}
	
	public void stampaCantanti(){
		int i = 1;
		for(String tmp : cantanti){
			System.out.println(i + ") " + tmp);
			++i;
		}
	}
	
	public String getCantante(int x){
		return cantanti[x-1];
	}
	

	public void stampaVotiPerCantante(){
		int n = voto.length;
		Arrays.sort(voto);
		reverse(voto);
		//quickSort(voto,0,n-1);
		for(int i = 0;i<n;i++){
			 cantanti[voto[i]] = cantanti[i];
		}
		for(int i = 0;i<n;i++){
			System.out.println(i+1 + ") "+ "Voti: " + voto[i] + " " + cantanti[i]);
		}
	}

	public void stampaClassifica(){
		int n = voto.length;
		//quickSort(voto,0,n-1);
		Arrays.sort(voto);
		reverse(voto);
		for(int i = 0;i<n;i++){
			 cantanti[voto[i]] = cantanti[i];
		}
		for(int i = 0;i<n;i++){
			System.out.println(i+1 + ") " + cantanti[i]);
		}
	}
	
	// reverse the order of the array
	public static void reverse(int[] array){
		int n = array.length;
		for(int i = 0;i<n/2;i++){
			int temp = array[i];
			array[i] = array[n-i-1];
			array[n-i-1] = temp;
		}
	}
}

// 1. Display list of singers
// 2. Vote one of the singers for a max of 5 times
// 3. Display the ranking of the singers