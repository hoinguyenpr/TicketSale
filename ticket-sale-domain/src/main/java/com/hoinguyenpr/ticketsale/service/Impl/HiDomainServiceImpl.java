package com.hoinguyenpr.ticketsale.service.Impl;

import com.hoinguyenpr.ticketsale.repository.HiDomainRepository;
import com.hoinguyenpr.ticketsale.service.HiDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiDomainServiceImpl implements HiDomainService {

    @Autowired
    HiDomainRepository hiDomainRepository;

    @Override
    public String sayHi(String who) {
        return hiDomainRepository.sayHi(who);
    }
}
