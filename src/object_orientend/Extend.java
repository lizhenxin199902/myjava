package object_orientend;
/**
 * javaֻ�е��̳У��ýӿ�ʵ�ֶ�̳У�
 * ������Ի�ø������е����Ժͷ��������˹��췽��������һ�����ã���˽�����Ժͷ�����
 * object���������Ĭ�ϸ���
 * ctrl+T�鿴��ļ̳в�νṹ
 * instanceof �ж�
 * @author me
 *
 */
public class Extend {
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.name="С��";
		stu1.height=168;
		stu1.major="���";
		stu1.rest();
		stu1.study();
		System.out.println(stu1 instanceof Student);
	}
}
class Person /*extends Object*/{
	String name;
	int height;
	
	public void rest() {
		System.out.println("��Ϣһ��");
	}
	
}
class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("ѧϰ��");
	}
	
	public Student(String name,int height,String major) {
		this.name=name;
		this.height=height;
		this.major=major;
	}
	public Student() {
		
	}
}