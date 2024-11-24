package com.hoinguyenpr.ticketsale.controller.resource;

import com.hoinguyenpr.ticketsale.application.service.event.EventAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HiController {

    @Autowired
    EventAppService eventAppService;

    @GetMapping("/hello")
    public String hello(@RequestParam("eventName") String eventName) {
        return eventAppService.sayHi(eventName);
    }
}
