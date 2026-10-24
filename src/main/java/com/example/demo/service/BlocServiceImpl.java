package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlocServiceImpl implements IBlocService {

    @Autowired
    private BlocRepository blocRepository;
}
