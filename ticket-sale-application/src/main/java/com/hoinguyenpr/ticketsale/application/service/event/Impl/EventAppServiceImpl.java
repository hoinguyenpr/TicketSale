package com.hoinguyenpr.ticketsale.application.service.event.Impl;

import com.hoinguyenpr.ticketsale.application.service.event.EventAppService;
import com.hoinguyenpr.ticketsale.service.HiDomainService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {
    //Call Domain
    @Resource
    HiDomainService hiDomainService;

    @Override
    public String sayHi(String eventName) {
        return hiDomainService.sayHi(eventName);
    }
}
