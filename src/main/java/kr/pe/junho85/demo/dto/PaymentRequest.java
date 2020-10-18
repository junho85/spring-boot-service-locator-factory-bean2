package kr.pe.junho85.demo.dto;

import lombok.Data;

@Data
public class PaymentRequest {
    private long amount;
    private String paymentMethod;
}
