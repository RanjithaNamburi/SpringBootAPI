/**
 * 
 */
package ran.com.example.CLdemoController;

import javax.activation.CommandObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import ran.com.example.CLdemo.CLdemoApplication;
import ran.com.example.CLdemoDAO.CLdemoDAO;
import ran.com.example.CLdemoServices.CLdemoServices;

/**
 * @author NamburiR
 *
 */
@SpringBootApplication(scanBasePackages={"ran.com.example"})
public class CLDemoController implements CommandLineRunner{
	
	@Autowired
	private CLdemoServices cld;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CLDemoController.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("testing my Second app");
		
		
		System.out.println("get Org Id: "+ cld.getDetails().getOrg_id());
		System.out.println("get Org Name: "+ cld.getDetails().getName());
		
	}
	
	 

}
