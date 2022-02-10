package com.zhiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.domain.Contract;
import com.zhiyou.domain.House;
import com.zhiyou.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Classname ContractController
 * @Date 2021/11/27 20:00
 */
@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private ContractService contractService;

    //展现全部+ 分页 + 模糊查询
    @RequestMapping("/list.do")
    public String selectAllContract(@RequestParam(value = "pageNum", defaultValue = "1", required = false) String pageNum,
                                String field,
                                String keyWord,
                                Model model) {
        PageHelper.startPage(Integer.parseInt(pageNum), 4);
        List<Contract> contractList = contractService.contractList(field, keyWord);
        PageInfo<Contract> pageInfo = new PageInfo<>(contractList);

        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("field", field);
        model.addAttribute("keyWord", keyWord);

        return "forward:/view/contract/list.jsp";
    }
}
