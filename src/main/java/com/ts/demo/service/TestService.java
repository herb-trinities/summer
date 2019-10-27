package com.ts.demo.service;

import com.ts.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    @Autowired
    DemoDao demoDao;

    public String t() {
        return demoDao.test();
    }
}
