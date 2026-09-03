package com.appsdeveloperblog.core.dto.events;

import java.util.UUID;

public class PaymentProcessedEvent {
    private UUID orderID;
    private UUID paymentId;

    public PaymentProcessedEvent() {
    }

    public PaymentProcessedEvent(UUID orderID, UUID paymentId) {
        this.orderID = orderID;
        this.paymentId = paymentId;
    }

    public UUID getOrderID() {
        return orderID;
    }

    public void setOrderID(UUID orderID) {
        this.orderID = orderID;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(UUID paymentId) {
        this.paymentId = paymentId;
    }
}
