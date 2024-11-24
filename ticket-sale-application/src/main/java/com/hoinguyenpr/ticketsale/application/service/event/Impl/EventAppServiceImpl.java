package com.hoinguyenpr.ticketsale.application.service.event.Impl;

import com.hoinguyenpr.ticketsale.application.service.event.EventAppService;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {
    @Override
    public String sayHi(String eventName) {
        return "Hello event: " + eventName;
    }
}
