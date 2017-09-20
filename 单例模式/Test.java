public class Test{

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s.x);

		Singleton d = Singleton.getInstance();
		System.out.println(d.x);

		s.x++;

		System.out.println(d.x);

		//System.out.println(new Singleton()); 出错，因为无法访问private型构造函数；

	}
}