package cg.spring.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.security.autoconfigure.SecurityProperties;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.context.SecurityContextRepository;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repo repo;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JWTBuilder jwtBuilder;

    public String signup(Customer customer) {
        if(customer.getEmail().endsWith("@chitkara.edu.in"))
            customer.setRole("ADMIN");
        else
            customer.setRole("CLIENT");
        customer.setPassword(encoder.encode(customer.getPassword()));
        repo.save(customer);

        return "SUCCESSFULLY SIGNUP";
    }

    public String login( Customer customer) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken
                (customer.getUsername(), customer.getPassword());

        Authentication authentication;

        try{
            authentication =  authenticationManager.authenticate(token);
        }
        catch(BadCredentialsException e){
            return "INVALID CREDENTIALS";
        }

        return "YOU JWT TOKEN IS: " + jwtBuilder.generateToken(customer.getUsername());
    }

    public String backend() {
        return "HELLO ADMIN";
    }

    public String client() {
        return "HELLO CLIENT";
    }

    public String welcome() {
        return "HELLO WELCOME";
    }

    public String check() {
        return "AUTHENTICATED";
    }
}
