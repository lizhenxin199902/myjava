package object_orientend;
/**
 * java只有单继承，用接口实现多继承；
 * 子类可以获得父类所有的属性和方法（除了构造方法）但不一定能用（如私有属性和方法）
 * object是所有类的默认父类
 * ctrl+T查看类的继承层次结构
 * instanceof 判断
 * @author me
 *
 */
public class Extend {
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.name="小明";
		stu1.height=168;
		stu1.major="软件";
		stu1.rest();
		stu1.study();
		System.out.println(stu1 instanceof Student);
	}
}
class Person /*extends Object*/{
	String name;
	int height;
	
	public void rest() {
		System.out.println("休息一会");
	}
	
}
class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("学习了");
	}
	
	public Student(String name,int height,String major) {
		this.name=name;
		this.height=height;
		this.major=major;
	}
	public Student() {
		
	}
}