package object_orientend;

public class Override {
	public static void main(String[] args) {
		Horse hor=new Horse();
		hor.run();
	}
}
class Vehicle{
	public void run() {
		System.out.println("變◎◎◎");
	}
	public void stop() {
		System.out.println("礿砦");
	}
	public Person whoispsg() {
		return new Person();
	}
}
class Horse extends Vehicle{
	public void run() {
		System.out.println("滄辦華變◎◎◎");
	}
	public Student whoispsg() {
		return new Student();
	}
}
