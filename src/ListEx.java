import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListEx {
public static void main(String[] args) {
	

	
	Student s1=new Student(1,"ramesh");
	Student s2=new Student(6,"ram");
	Student s3=new Student(9,"om");
	Student s4=new Student(8,"piyush");
	Student s5=new Student(5,"kiran");
	List <Student> l=new ArrayList<Student>();
	
	l.add(s1);
	l.add(s2);
	l.add(s3);
	l.add(s4);
	l.add(s5);
	
	List<Student> l1=l.stream().sorted((a1,a2) -> (int)(a2.getId()-a1.getId())).collect(Collectors.toList());
	System.out.println(l1);
	
	List evenList=l.stream().filter(stu->stu.getId()%2==0).collect(Collectors.toList());
	System.out.println(evenList);
	
	List mapList=l.stream().map(stu->stu.getName()+"Mahalle").collect(Collectors.toList());
	System.out.println(mapList);
	
	Map<Object, Long> i=l.stream().collect(Collectors.groupingBy(stu->stu.getName().contains("om"),Collectors.counting()));
	System.out.println(i);
}
}
