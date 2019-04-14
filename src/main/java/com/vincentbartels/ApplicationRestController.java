package com.vincentbartels;

import com.vincentbartels.model.Receipt;
import com.vincentbartels.services.DatabaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@org.springframework.web.bind.annotation.RestController
public class ApplicationRestController {

    private static final String template = "{id: %s, name: %s}";

    @GetMapping("/yoga")
    String yoga() {
        return "yoga";
    }


    @GetMapping("/receipt")
    public Receipt receipt(@RequestParam(value = "id", defaultValue = "0") int id) {
        //String respondJson = service.getById(uuid);
        //String respondJson = "{\"name\": \"lentil soup\" }";
        String name;
        String instruction;

        if (0 == id) {
            name = "lentil soup";
            instruction = "Cook lentils until mushy";
        } else if (1 == id) {
            name = "curry";
            instruction = "cook a lot of rice with no spices";
        } else {
            name = "veggi";
            instruction = "prepare veggies with meat";
        }

        return new Receipt(id, name, instruction);
    }

    @GetMapping("/ticks")
    ArrayList<String> ticks(DatabaseService databaseService) {
        return databaseService.ticks();
    }


}
