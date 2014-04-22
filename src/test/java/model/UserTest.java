package model;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class UserTest {
	private static SessionFactory sessionFactory = null;

	@BeforeClass
	public static void Befrore(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		sessionFactory = (SessionFactory) context.getBean("sessionFactory");
	}
	@Test
	public void test1(){
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = new User();
		user.setName("xiaoxiao");
		user.setPassword("dadaf");
		session.save(user);
		transaction.commit();
	}

}
