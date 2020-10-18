package kr.pe.junho85.demo.service;

public interface PaymentRegistry {
    PaymentService getServiceBean(String serviceName);
}
