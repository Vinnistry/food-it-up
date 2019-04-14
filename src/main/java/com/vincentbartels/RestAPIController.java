package com.vincentbartels;

import com.vincentbartels.model.Receipt;
import com.vincentbartels.respository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    @Autowired
    ReceiptRepository receiptRepository;

    @GetMapping("/receipts")
    public Iterable<Receipt> AllReceipts() {
        return receiptRepository.findAll();
    }

}
