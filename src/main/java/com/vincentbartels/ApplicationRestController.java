package com.vincentbartels;

import com.vincentbartels.model.Receipt;
import com.vincentbartels.model.ReceiptRepository;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class ApplicationRestController {

    private final ReceiptRepository receiptRepository;

    ApplicationRestController(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    @GetMapping("/receipts")
    public Iterable<Receipt> AllReceipts() {
        return receiptRepository.findAll();
    }

}
