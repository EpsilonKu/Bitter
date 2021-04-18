package kz.VastPink.Bitter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping (name = "/")
    public ResponseEntity checkStatus(){
        try {
            return ResponseEntity.ok("Server is fine");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

}
