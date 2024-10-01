package first2;



public class my1calc {
	public int sum(int a, int b) {
		int c;
		c=5+10;
		return c;
	}
	public int diff(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public void show() {
		System.out.println("hii i am naurez");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my1calc c=new my1calc();
		System.out.println("sum is"+c.sum(20, 10));
		System.out.println("diff is"+c.diff(20, 10));
	}

}
