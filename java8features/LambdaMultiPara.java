package java8features;

@FunctionalInterface
interface Addable{
	int add(int a,int b);
}
public class LambdaMultiPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a1=(x,y)->x+y;
		System.out.println("Add : "+a1.add(22, 12));
		
		Addable a2 = (int x,int y)->{
			return x+y;
		};
		
		System.out.println("Add : "+a2.add(5,9));

	}

}
