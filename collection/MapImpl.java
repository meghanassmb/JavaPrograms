package collection;

//created by Meghana K S
import java.util.*;

public class MapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("In", "India");
		map.put("Br", "Brazil");
		map.put("De", "Germany");
		map.put("Fr", "France");
		map.put(null, null);
	    map.put(null, null);

		System.out.println("implementing HashMap : ");
		for (Map.Entry<String, String> entry : map.entrySet()) {

			System.out.println("Country code : " + entry.getKey() + ",Country :" + entry.getValue());
		}
		System.out.println(map.get("Br"));
		
		Map<String, String> treemap = new TreeMap<>();
		treemap.put("BR102", "Coffee");
		treemap.put("L207", "Tea");
		treemap.put("D305", "Pizza");
		treemap.put("BR105", "Burger");
		//treemap.put(null, null);
	   // treemap.put(null, null);

		System.out.println("implementing TreeMap : ");
		for (Map.Entry<String, String> entry : treemap.entrySet()) {

			System.out.println("code : " + entry.getKey() + " ,Menu :" + entry.getValue());
		}
	   Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("KA", "Kannada");
		hashtable.put("AP", "Telugu");
		hashtable.put("TN", "Tamil");
		hashtable.put("MP", "Hindi");
		//hashtable.put(null, null);
	   // hashtable.put(null, null);

		System.out.println("implementing hashtable : ");
		for (Map.Entry<String, String> entry : hashtable.entrySet()) {

			System.out.println("Country: " + entry.getKey() + " ,Language :" + entry.getValue());
		}
		
		
							
	}

}
