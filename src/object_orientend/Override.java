package object_orientend;

public class Override {
	public static void main(String[] args) {
		Horse hor=new Horse();
		hor.run();
	}
}
class Vehicle{
	public void run() {
		System.out.println("�ܡ�����");
	}
	public void stop() {
		System.out.println("ֹͣ");
	}
	public Person whoispsg() {
		return new Person();
	}
}
class Horse extends Vehicle{
	public void run() {
		System.out.println("�ɿ���ܡ�����");
	}
	public Student whoispsg() {
		return new Student();
	}
}
