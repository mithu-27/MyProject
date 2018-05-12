package DTproject.ShoppingCartBackEnd;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("DTproject");
		context.refresh();
		context.getBean("Product");
System.out.println("the bean is created successfully");
	}

}
