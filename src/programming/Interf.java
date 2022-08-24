package programming;

interface Interf {
	public void methodOne(int a);

}

class Test {

	public static void main(String[] args) {
		Interf i = (a) -> System.out.println(a);
	i.methodOne(5);
	}
}