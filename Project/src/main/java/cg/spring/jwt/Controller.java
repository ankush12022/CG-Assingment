package cg.spring.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Service service;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody Customer customer) {
        return ResponseEntity.ok(service.signup(customer));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Customer customer) {
        return ResponseEntity.ok(service.login(customer));
    }

    @GetMapping("/backend")
    public ResponseEntity<String> backend() {
        return ResponseEntity.ok(service.backend());
    }

    @GetMapping("/client")
    public ResponseEntity<String> client() {
        return ResponseEntity.ok(service.client());
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok(service.welcome());
    }

    @GetMapping("/check")
    public ResponseEntity<String> check() {
        return ResponseEntity.ok(service.check());
    }
}
