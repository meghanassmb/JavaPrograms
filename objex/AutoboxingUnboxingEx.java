package objex;

public class AutoboxingUnboxingEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a = 10;
		Integer objInt = new Integer(a);
		Integer objInt2 = a;
		
		Integer objInt3 = new Integer(20);
		int b = objInt3;
		
		System.out.println(a+ " "+objInt2);
		System.out.println(b+ " "+objInt3);
		
		
		

	}

}
