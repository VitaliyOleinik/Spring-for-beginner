package com.spring_boot.spring_boot_postgre.service;

import com.spring_boot.spring_boot_postgre.entity.Address;
import com.spring_boot.spring_boot_postgre.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    public void createAddress(Address address){
        addressRepository.save(address);
    }
}
