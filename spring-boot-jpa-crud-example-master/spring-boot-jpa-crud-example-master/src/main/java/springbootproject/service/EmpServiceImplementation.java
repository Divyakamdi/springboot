package springbootproject.service;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import springbootproject.model.Employee;
import springbootproject.repository.EmployeeRepository;
@Service
public class EmpServiceImplementation implements UserDetailsService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {



	       return employeeRepository.findAll();
	    }
	
	


@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
	   return new User("admin", "password", new ArrayList<>());
}

}
