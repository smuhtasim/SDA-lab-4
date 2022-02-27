package controller;

import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer newCustomer){
        return customerService.saveCustomer(newCustomer);
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable("id") String id){
        return customerService.findCustomerById(id);
    }
}
