package test_1;

public class µÝ¹é {
	public static void main(String[] args) {
		//a();
		long d1 = System.currentTimeMillis();
		System.out.println(b(5));
		long d2 = System.currentTimeMillis();
		System.out.println(d2-d1);//¼ÆËãºÄÊ±£»
		factorialLoop(5);
	}
	
//	static int count = 0;
//	static void a() {
//		System.out.println("a");
//		count++;
//		if(count<10) {
//			a();
//		}else {
//			return;
//		}
//	}
	
	static long b(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*b(n-1);
		}
	}
	static long factorialLoop(int m) {
		long result = 1;
		while(m>1) {
			result *= m*(m-1);
			m-=2;
		}
		System.out.println(result);
		return result;
	}
}
