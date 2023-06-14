
package com.example.demo002.Controller;

import com.example.demo002.entity.Queren;
import com.example.demo002.service.QuerenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/xingui")
public class QuerenController {

    private   QuerenService querenService;

    @Autowired
    public QuerenController(QuerenService querenService) {
        this.querenService = querenService;
    }

    @PostMapping("/queren")
    public void saveQueren(@RequestBody Queren queren) {
        querenService.saveQueren(queren);
    }
}
