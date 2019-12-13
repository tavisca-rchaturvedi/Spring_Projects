import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String firstName;
    private String lastName;
    private DOJ doj;

    public Employee(DOJ doj) {
        this.doj = doj;
    }

    public DOJ getDoj() {
        return doj;
    }

    public void setDoj(DOJ doj) {
        this.doj = doj;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee() {
        System.out.println("Hello");
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy has been called!");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", doj=" + doj.getDate()
                + "/" + doj.getMonth() + "/" + doj.getYear() +
                '}';
    }

    public void MyDestroy() throws Exception {
        System.out.println("MyDestroy has been called!");
    }
}
