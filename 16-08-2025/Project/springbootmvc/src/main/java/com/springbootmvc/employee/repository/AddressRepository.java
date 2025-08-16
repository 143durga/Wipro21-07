package com.springbootmvc.employee.repository;

import com.springbootmvc.employee.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
