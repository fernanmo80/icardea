package tr.com.srdc.icardea.platform.service.user;

import org.springframework.security.userdetails.UserDetails;
import org.springframework.security.userdetails.UserDetailsService;

import tr.com.srdc.icardea.platform.model.Person;


public class PersonUserDetailsService implements UserDetailsService {

	private UserService userService;

    public PersonUserDetailsService(UserService userService) {

        this.userService = userService;

    }

    public UserDetails loadUserByUsername(String userName) {

        Person person = userService.getPersonByUsername(userName);

        String role = userService.getRoleByUsername(userName);

        person.setCustomerAuthority(role);

        return person;         

    }

}
