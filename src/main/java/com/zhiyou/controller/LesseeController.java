package com.zhiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.dao.LesseeDao;
import com.zhiyou.domain.Contract;
import com.zhiyou.domain.House;
import com.zhiyou.domain.Lessee;
import com.zhiyou.service.LesseeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Classname LesseeController
 * @Date 2021/11/27 21:22
 */
@Controller
@RequestMapping("/lessee")
public class LesseeController {
    @Autowired
    private LesseeService lesseeService;

    //展现全部+ 分页 + 模糊查询
    @RequestMapping("/list.do")
    public String findAllLessee(@RequestParam(value = "pageNum", defaultValue = "1", required = false) String pageNum,
                                    String field,
                                    String keyWord,
                                    Model model) {
        PageHelper.startPage(Integer.parseInt(pageNum), 4);
        List<Lessee> lesseeList = lesseeService.lesseeList(field, keyWord);
        PageInfo<Lessee> pageInfo = new PageInfo<>(lesseeList);

        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("field", field);
        model.addAttribute("keyWord", keyWord);

        return "forward:/view/lessee/list.jsp";
    }
}
