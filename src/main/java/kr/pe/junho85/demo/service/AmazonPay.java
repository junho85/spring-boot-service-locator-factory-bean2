package kr.pe.junho85.demo.service;

import kr.pe.junho85.demo.dto.PaymentRequest;
import org.springframework.stereotype.Service;

@Service("AmazonPay")
public class AmazonPay implements PaymentService {
    @Override
    public String pay(PaymentRequest request) {
        return request.getAmount() + " paid successfully using " + request.getPaymentMethod();
    }
}
