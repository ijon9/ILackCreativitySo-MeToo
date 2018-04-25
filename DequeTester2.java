public class DequeTester2 {

	public static void main(String[] args) {
		Deque<String> gummo = new QQKachoo<String>();

		//testing addFirst and addLast
		gummo.addFirst("Yeet");
		gummo.addFirst("Yote");
		gummo.addLast("Yate");
		gummo.addLast("Yute");
		gummo.addFirst("Yite");

		System.out.println("gummo: " + gummo + "\n");//expecting Yite, Yote, Yeet, Yate, Yute

		System.out.println("TESTING pollFirst()");
		gummo.pollFirst();
		gummo.pollFirst();
		System.out.println("gummo:" + gummo);

		gummo.addFirst("Yeet");
		gummo.addFirst("Yote");
		gummo.addLast("Yate");
		gummo.addLast("Yute");
		gummo.addFirst("Yite");

		System.out.println(" after add gummo: " + gummo + "\n");

		System.out.println("TESTING pollLast()");
		gummo.pollLast();
		System.out.println("gummo: " + gummo);
	}
}
