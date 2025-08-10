package com.notificationservice.controller;


import com.notificationservice.dto.NotifyDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {

    @PostMapping("/notify")
    public void notify(@RequestBody NotifyDTO notifyDTO) {
        System.out.println("User " + notifyDTO.getUser().getUsername() + " information is " + notifyDTO.getAction());
    }
}
