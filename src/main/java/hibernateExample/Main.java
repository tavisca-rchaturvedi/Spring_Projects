package hibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PurchaseOrder purchaseOrder = new PurchaseOrder("Rishabh",
                "20/10/2019",
                new ArrayList<Item>(){{
                    add(new Item(1, "Laptop", "ABCD", 200000));
                    add(new Item(2, "Phone", "hsdkfj", 20000));
                }}
        );


        try{
            File resource = new File("C:\\Users\\rchaturvedi\\Desktop\\GithubRepositories\\SpringCoreExample\\src\\main\\resources\\hibernate.cfg.xml");
            System.out.println(resource.getAbsoluteFile());
            SessionFactory sessionFactory = new Configuration().configure(resource).buildSessionFactory();
            Session currentSession = sessionFactory.openSession();
            Transaction tx = currentSession.beginTransaction();
            currentSession.save(purchaseOrder);

            tx.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
