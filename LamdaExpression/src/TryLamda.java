import java.util.function.Predicate;

interface myinterface{
	void say();
	default void hello() {
		System.out.println("hello");
	}
}

interface addition {
	int add(int a,int b );
}
public class TryLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myinterface say= () -> System.out.println("Hello From Myside");
      say.say();
      
      addition add= (a,b) ->(a+b)*2;
      System.out.println(add.add(5, 5));
      
      Predicate<Integer> isEven = (x) -> x%2==0;
      System.out.println(isEven.test(9));
      
	}

}
