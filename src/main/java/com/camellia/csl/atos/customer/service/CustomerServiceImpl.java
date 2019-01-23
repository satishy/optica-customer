package com.camellia.csl.atos.customer.service;

import com.camellia.csl.atos.customer.domain.Customer;
import com.camellia.csl.atos.customer.domain.OpticaParent;
import com.camellia.csl.atos.customer.exceptions.CustomerException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     * <TODO>Get data from repository</TODO>
     * @return
     * @throws CustomerException
     */
    @Override
    public OpticaParent getCustomers() throws CustomerException {

        return OpticaParent.builder().customers(dummyCustomerList()).build();
    }

    /**
     * <TODO>Get data from repository</TODO>
     * @param id
     * @return
     * @throws CustomerException
     */
    @Override
    public OpticaParent removeCustomer(String id) throws CustomerException {
        List<Customer> list = dummyCustomerList();

        List<Customer> modifiedList = list.stream()
                .filter(c -> !c.getId().equalsIgnoreCase(id))
                .collect(Collectors.toList());

        return OpticaParent.builder().customers(modifiedList).build();
    }

    /**
     * <TODO>Get data from repository</TODO>
     * @param customer
     * @return
     * @throws CustomerException
     */
    @Override
    public OpticaParent addCustomer(Customer customer) throws CustomerException {


        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        customers.addAll(dummyCustomerList());

        return OpticaParent.builder().customers(customers).build();
    }


    /**
     * <TODO>Remove after repository</TODO>
     * @return
     */
    private List<Customer> dummyCustomerList() {

        Customer customer1 = Customer.builder()
                .id("A12345")
                .firstName("Satish")
                .lastName("Yeruva")
                .build();

        Customer customer2 = Customer.builder()
                .id(UUID.randomUUID().toString())
                .firstName("Steve")
                .lastName("Jobs")
                .build();

        Customer customer3 = Customer.builder()
                .id(UUID.randomUUID().toString())
                .firstName("James")
                .lastName("Gosling")
                .build();

        Customer customer4 = Customer.builder()
                .id(UUID.randomUUID().toString())
                .firstName("Martin")
                .lastName("Fowler")
                .build();


        return Arrays.asList(customer1, customer2, customer3, customer4);
    }

}
