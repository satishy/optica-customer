package com.camellia.csl.atos.customer.service;

import com.camellia.csl.atos.customer.domain.Customer;
import com.camellia.csl.atos.customer.domain.OpticaParent;
import com.camellia.csl.atos.customer.exceptions.CustomerException;

import java.util.List;

public interface CustomerService {

    OpticaParent getCustomers() throws CustomerException;

    OpticaParent removeCustomer(String id) throws CustomerException;

    OpticaParent addCustomer(Customer customer) throws CustomerException;

}
