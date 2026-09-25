package com.piseth.mediatorpattern.mediator;

import com.piseth.mediatorpattern.dto.CheckoutRequest;
import com.piseth.mediatorpattern.dto.CheckoutResponse;

public interface CheckoutMediator {
    CheckoutResponse checkout(CheckoutRequest request);
}
