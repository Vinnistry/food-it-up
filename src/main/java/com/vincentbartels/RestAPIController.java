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


    @GetMapping("/save")
    public String SaveSomeReceipts() {
        receiptRepository.save(new Receipt("lentil soup", "Cook lentils until mushy"));
        receiptRepository.save(new Receipt("curry", "cook a lot of rice with no spices"));
        receiptRepository.save(new Receipt("veggi soup", "prepare veggies with meat"));
        return "Done";

    }


    @GetMapping("/receipts")
    public Iterable<Receipt> AllReceipts() {
        return receiptRepository.findAll();
    }

}
