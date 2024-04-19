package br.com.teste.eicon.repository;

import br.com.teste.eicon.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByControlNumber(Integer controlNumber);
    List<Order> findByRegistrationDate(String registrationDate);
}