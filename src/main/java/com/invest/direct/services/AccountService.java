package com.invest.direct.services;

import com.invest.direct.dao.AccountDao;
import com.invest.direct.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll () {
        return accountDao.findAll();
    }
}
