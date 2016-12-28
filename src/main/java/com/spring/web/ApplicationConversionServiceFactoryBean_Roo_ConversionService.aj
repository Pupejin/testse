// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.spring.web;

import com.spring.domain.Customer;
import com.spring.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<Customer, String> ApplicationConversionServiceFactoryBean.getCustomerToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.spring.domain.Customer, java.lang.String>() {
            public String convert(Customer customer) {
                return new StringBuilder().append(customer.getName()).toString();
            }
        };
    }
    
    public Converter<Long, Customer> ApplicationConversionServiceFactoryBean.getIdToCustomerConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.spring.domain.Customer>() {
            public com.spring.domain.Customer convert(java.lang.Long id) {
                return Customer.findCustomer(id);
            }
        };
    }
    
    public Converter<String, Customer> ApplicationConversionServiceFactoryBean.getStringToCustomerConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.spring.domain.Customer>() {
            public com.spring.domain.Customer convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Customer.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getCustomerToStringConverter());
        registry.addConverter(getIdToCustomerConverter());
        registry.addConverter(getStringToCustomerConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
