package kr.pe.junho85.demo.controller;

import kr.pe.junho85.demo.dto.PaymentRequest;
import kr.pe.junho85.demo.service.AmazonPay;
import kr.pe.junho85.demo.service.Paytm;
import kr.pe.junho85.demo.service.PhonePe;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-service")
@RequiredArgsConstructor
public class PaymentController {
    private final Paytm paytm;

    private final PhonePe phonePe;

    private final AmazonPay ap;

    @PostMapping("/pay")
    public String payNow(@RequestBody PaymentRequest request) {
        String response = "";
        if (request.getPaymentMethod().equals("Paytm")) {
            response = paytm.pay(request);
        }
        if (request.getPaymentMethod().equals("PhonePe")) {
            response = phonePe.pay(request);
        }
        if (request.getPaymentMethod().equals("AmazonPay")) {
            response = ap.pay(request);
        }

        return response;
    }
}
