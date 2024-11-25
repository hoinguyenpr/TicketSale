package com.hoinguyenpr.ticketsale.infrastructure.persistence.repository;

import com.hoinguyenpr.ticketsale.repository.HiDomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HiInfraRepositoryImpl implements HiDomainRepository {

    @Override
    public String sayHi(String who) {
        return "Hi Infrastructure: " + who;
    }
}
