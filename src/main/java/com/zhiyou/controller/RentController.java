package com.zhiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.domain.Lessee;
import com.zhiyou.domain.Rent;
import com.zhiyou.domain.User;
import com.zhiyou.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Classname RentController
 * @Date 2021/11/27 21:32
 */
@Controller
@RequestMapping("/rent")
public class RentController {
    @Autowired
    private RentService rentService;

    //展现全部+ 分页 + 模糊查询
    @RequestMapping("/list.do")
    public String findAllRent(@RequestParam(value = "pageNum", defaultValue = "1", required = false) String pageNum,
                                String field,
                                String keyWord,
                                Model model) {
        PageHelper.startPage(Integer.parseInt(pageNum), 4);
        List<Rent> rentList = rentService.rentList(field, keyWord);
        PageInfo<Rent> pageInfo = new PageInfo<>(rentList);

        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("field", field);
        model.addAttribute("keyWord", keyWord);

        return "forward:/view/rent/list.jsp";
    }
}
