package cg.spring.jwt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Customer, Integer> {
    public Customer findByUsername(String username);
}
