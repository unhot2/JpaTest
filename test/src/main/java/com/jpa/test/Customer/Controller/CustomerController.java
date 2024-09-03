package com.jpa.test.Customer.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.Customer.Entity.Customer;
import com.jpa.test.Customer.Respository.CustomerRepository;

@RestController
public class CustomerController {
    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    // 정보 입력
    @PutMapping("/customer")
    public Customer putCustomer(Customer customer) {
        repository.save(customer);
        return customer;
    }

    // 정보수정
    @PostMapping("/customer")
    public Customer postCustomer(Customer customer) {
        repository.save(customer);
        return customer;
    }

    // 정보삭제
    @DeleteMapping("/customer")
    public void deleteCustomer(int id) {
        repository.deleteById(id);
    }

    // ID 조회
    @GetMapping("/customer")
    public Customer getCustomer(int id) {
        return repository.findById(id).orElse(null);
    }

    // LIST 조회
    @GetMapping("/customer/list")
    public List<Customer> getCustomerList() {
        return (List<Customer>) repository.findAll();
    }

    // NAME 조회
    @GetMapping("/customer/name")
    public List<Customer> getCustomer(String name) {
        return repository.findByName(name); // Respository에 함수를 추가로 생성
    }

    // NAME LIKE 조회
    @GetMapping("/customer/search")
    public List<Customer> searchCustomer(String name) {
        return repository.findByNameLike("%" + name + "%"); // Respository에 함수를 추가로 생성
    }

    // VIP 조회
    @GetMapping("/customer/vip")
    public List<Customer> vipCustomer(String name, String address) {
        return repository.findVipList(name,"%"+address+"%"); // Respository에 함수를 추가로 생성
    }

}
