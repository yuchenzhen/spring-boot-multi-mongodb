package com.invest.direct.controllers;

import com.invest.direct.services.AccountService;
import com.invest.direct.model.Account;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/account")
    public List<Account> account() {

        return accountService.findAll();
    }
}