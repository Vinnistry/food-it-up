package com.vincentbartels.respository;

import com.vincentbartels.model.Receipt;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReceiptRepository extends CrudRepository<Receipt, Long> {
    List<Receipt> findByName(String name);
}
