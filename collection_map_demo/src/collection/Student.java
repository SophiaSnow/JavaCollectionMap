package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 * @author Administrator
 *
 */
public class Student implements Comparable<Student>{
	public String id;
	public String name;
	public Set courses;
	public Student(String id,String name){
		this.id=id;
		this.name=name;
		this.courses=new HashSet();
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}
	
}
