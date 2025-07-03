package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("resources.xml");
//        Creating Beans
        Student student=(Student) context.getBean("st");
        SpringBoot spring= (SpringBoot) context.getBean("sp");
        Teacher t=(Teacher) context.getBean("teacher");
        Staff st=(Staff) context.getBean("staff");
//        Executing the Methods Form the Created methods using beans--------------->
        spring.program();
        student.print();
        t.teacherprint();
        st.Staffprint();
    }
}