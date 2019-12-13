import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class EmployeeTest {
    public static void main(String[] args) {
        try{

            Resource resource =  new FileSystemResource(".\\src\\main\\java\\config\\beans.xml");
            BeanFactory beanFactory = new XmlBeanFactory(resource);


            ApplicationContext applicationContext = new FileSystemXmlApplicationContext(".\\src\\main\\java\\config\\beans.xml");

            Employee emp = (Employee) applicationContext.getBean("abc");
            System.out.println("The name of created employee is " + emp.toString());


//            Employee abc = (Employee) beanFactory.getBean("abc");
//            System.out.println("The name of created employee is " + abc.getFirstName());

//            emp = null;


            ConfigurableApplicationContext cac = (ConfigurableApplicationContext) applicationContext;
            cac.close();

//            abc = null;

//            if(emp.hashCode() == abc.hashCode()){
//                System.out.println("Objects are same");
//            }
//            else{
//                System.out.println("Object are different");
//            }

//            beanFactory.getBeanProvider()

//            emp = null;
//            abc = null;

            System.gc();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Exception Occured");
        }

        System.out.println("It ended");
    }
}
