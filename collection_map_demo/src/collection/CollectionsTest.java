package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.xml.bind.Unmarshaller.Listener;

public class CollectionsTest {
	public void testSort3(){
		List<Student> studentList=new ArrayList<Student>();
		Random random=new Random();
		studentList.add(new Student(random.nextInt(1000)+"","Mike"));
		studentList.add(new Student(random.nextInt(1000)+"","Angela"));
		studentList.add(new Student(random.nextInt(1000)+"","Lucy"));
		studentList.add(new Student(10000+"","Beyonce"));
		studentList.add(new Student(10000+"","Andy"));
		System.out.println("------------排序前---------");
		for(Student student:studentList){
			System.out.println("学生："+student.id+","+student.name);
		}
		Collections.sort(studentList);
		System.out.println("------------排序后---------");
		for(Student student:studentList){
			System.out.println("学生："+student.id+","+student.name);
		}
		System.out.println("------------按照姓名排序后---------");
		Collections.sort(studentList,new StudentComparator2());
		Collections.sort(studentList,new StudentComparator());
		
		
		for(Student student:studentList){
			System.out.println("学生："+student.id+","+student.name);
		}
	}
	
	public static void main(String[] args){
		CollectionsTest ct=new CollectionsTest();
		ct.testSort3();
	}

}
