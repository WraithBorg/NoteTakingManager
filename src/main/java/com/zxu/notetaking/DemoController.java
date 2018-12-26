package com.zxu.notetaking;

import com.zxu.notetaking.entity.AccountBook;
import com.zxu.notetaking.service.IAccountBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/learn")
public class DemoController {
    @Autowired
    private IAccountBookService accountBookService;

    @RequestMapping("/")
    public ModelAndView index() {

        List<AccountBook> accountBookList = new ArrayList<>();
        accountBookList.add(new AccountBook("id", "name", "imaurl", "userId"));
        accountBookList.add(new AccountBook("id", "name2", "imaurl", "userId"));

        accountBookService.save(new AccountBook("id", "name", "imaurl", "userId"));

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("accountBookList", accountBookList);

        return modelAndView;
    }
}
