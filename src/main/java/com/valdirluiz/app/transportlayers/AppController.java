package com.valdirluiz.app.transportlayers;

import com.valdirluiz.app.interactors.ServiceOne;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/execute")
public class AppController {

    private final ServiceOne serviceOne;

    public AppController(ServiceOne serviceOne) {
        this.serviceOne = serviceOne;
    }

    @GetMapping
    public ResponseEntity<Void> execute(){
        this.serviceOne.execute();
        return ResponseEntity.status(HttpStatusCode.valueOf(204)).build();
    }
}
