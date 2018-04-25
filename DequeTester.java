public class DequeTester {
	
	public static void main(String[] args) {
		QQKachoo<Integer> gummo = new QQKachoo<Integer>();

		for(int i = 0; i < 10; i++)
			gummo.addFirst(i);

		for(int i = 10; i < 20; i++)
			gummo.addLast(i);

		for(int i = 0; i < 10; i++)
			gummo.addLast(i);


		System.out.println("State of gummo: " + gummo);

		gummo.removeLastOccurence(9);
		System.out.println("gummo w/out last occurence of 9: " + gummo);

		gummo.removeFirstOccurence(9);
		System.out.println("gummo w/out first occurence of 9: " + gummo);

		System.out.println("gummo should have NO 9s in it now");

		while(!gummo.isEmpty()) {
			gummo.removeLast();
		}
		System.out.println("removed ALL numbers from gummo");
		System.out.println("State of gummo: " + gummo);
	
		System.out.println("readding the previous numbers");

		for(int i = 0; i < 10; i++)
			gummo.addFirst(i);

		for(int i = 10; i < 20; i++)
			gummo.addLast(i);

		for(int i = 0; i < 10; i++)
			gummo.addLast(i);		

		System.out.println("State of gummo: " + gummo);
	
		while(!gummo.isEmpty())
			gummo.removeFirst();

		System.out.println("removed all ints\nCurrent state of gummo: " + gummo);
	}
}
