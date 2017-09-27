package hagahelia.fi.Student.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import hagahelia.fi.Student.List.List;

@Controller
public class HelloStudent {
@RequestMapping(value="/hello",method=RequestMethod.GET)
public String getStudent(Model model){
	
	ArrayList<List> list=new ArrayList<List>();
	
	List student1=new List("John","lenon","damn@asd.com");
	List student2=new List("Lenard","ha","daman@asd.com");
	list.add(student1);
	list.add(student2);
	model.addAttribute("students",list);
	
	return "hello";
	
}

}