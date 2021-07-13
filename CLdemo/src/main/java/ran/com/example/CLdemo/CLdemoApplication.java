package ran.com.example.CLdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@SpringBootApplication
public class CLdemoApplication implements CommandLineRunner {
	
	@Autowired
	@Qualifier(value="visu")
	private employee E;
	
	@Autowired
	private employee E1;
	
	@Value("${companyName}")
	private String cn;

	public static void main(String[] args) {
	//	SpringApplication.run(CLdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("testing my First app");
		System.out.println("Employee Details are "+ E.firstname+" "+E.lastname);
		System.out.println("Employee1 Details are "+ E1.firstname+" "+E1.lastname);
		System.out.println("CompanyName "+ cn);
		
	}
	
	@Bean(value= {"visu"})
	employee getEmployee(){
		employee e=new employee();
		e.firstname ="vishu";
		e.lastname="Bali";
		return e;
		
	}
	
	@Bean
	@Primary
	employee getEmployee1(){
		employee e=new employee();
		e.firstname ="Ranjitha";
		e.lastname="Namburi";
		return e;
		
	}

}


class employee{
	String firstname = "Ranjitha";
	String lastname;
}
