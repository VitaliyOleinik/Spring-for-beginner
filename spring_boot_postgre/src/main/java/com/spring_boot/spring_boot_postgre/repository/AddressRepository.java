package com.spring_boot.spring_boot_postgre.repository;

import com.spring_boot.spring_boot_postgre.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
