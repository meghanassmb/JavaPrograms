package designpatterns;

class SingleObject{
	//create an object
	private static SingleObject instance = new SingleObject();
	
	// create private constructor so that this class cannot be instantiated
     private SingleObject() {}
    
     public static SingleObject getInstance() {
    	 return instance;
     }

     public void show() {
    	 System.out.println("accessing methods using single-object");
     }
}


public class SingletonPatternEx {

	public static void main(String[] args) {
		//we can't create object of SingleObject class because constructor is private
		//SingleObject singleObject = new SingleObject();
		SingleObject obj = SingleObject.getInstance();
		obj.show();
		

	}

}
