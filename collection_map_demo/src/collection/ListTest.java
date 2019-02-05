package collection;

import java.util.ArrayList;
import java.util.List;
/**
 * 备选课程类
 * @author Administrator
 *
 */
public class ListTest {
	//用于存放备选课程的List
	public List coursesToSelect;
	public ListTest(){
		this.coursesToSelect=new ArrayList();
	}
	//用于往courseToSelect中添加备选课程
	public void testAdd(){
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1=new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course temp=(Course) coursesToSelect.get(0);
		System.out.println("添加了课程:"+temp.getId()+":"+temp.getName());
		
		Course cr2=new Course("2","C语言");
		coursesToSelect.add(0, cr2);
		Course temp2=(Course) coursesToSelect.get(0);
		System.out.println("添加了课程:"+temp2.getId()+":"+temp2.getName());
	}
	
	public static void main(String[] args){
		ListTest lt=new ListTest();
		lt.testAdd();
	}
}
