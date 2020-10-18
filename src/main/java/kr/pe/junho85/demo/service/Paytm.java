package kr.pe.junho85.demo.service;

import kr.pe.junho85.demo.dto.PaymentRequest;
import org.springframework.stereotype.Service;

@Service("Paytm")
public class Paytm implements PaymentService {
    @Override
    public String pay(PaymentRequest request) {
        return request.getAmount() + " paid successfully using " + request.getPaymentMethod();
    }
}
