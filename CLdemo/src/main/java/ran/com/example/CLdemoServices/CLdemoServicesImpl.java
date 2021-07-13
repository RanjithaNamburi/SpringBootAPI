package ran.com.example.CLdemoServices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ran.com.example.CLdemoDAO.CLdemoDAO;


@Service
public class CLdemoServicesImpl implements CLdemoServices{
	
	  
	public CLdemoDAO getDetails(){
		CLdemoDAO d = new CLdemoDAO();
		d.setOrg_id(123);
		d.setName("Visu");
		
		//System.out.println("setting Org Id"+ d.getOrg_id());
		//System.out.println("setting Org Name"+ d.getName());
		
		return d;
	}
}
