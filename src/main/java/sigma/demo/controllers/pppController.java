package sigma.demo.controllers;
import org.springframework.web.bind.annotation.*;

import sigma.demo.entity.ppp;
import sigma.demo.repository.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class pppController {
    private final pppRepository pppRepository;
    
    public pppController(pppRepository pppRepository) {
        this.pppRepository = pppRepository;
    }
    
    @GetMapping
    public List<ppp> getAllppps() {
        return pppRepository.findAll(); 
    }
}
