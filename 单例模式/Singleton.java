public class Singleton{

	private Singleton(){

	}
	private static Singleton s = new Singleton();

	public int x = 1;

	public static Singleton getInstance(){

		return s;
	} 
}