package com.zxu.notetaking.service.impl;

import com.zxu.notetaking.dao.AccountBookMapper;
import com.zxu.notetaking.entity.AccountBook;
import com.zxu.notetaking.service.IAccountBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountBookServiceImpl extends BaseService<AccountBook> implements IAccountBookService {
    @Autowired
    private AccountBookMapper accountBookMapper;
}
