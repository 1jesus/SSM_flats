package com.zhiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.annotation.MyLog;
import com.zhiyou.domain.House;
import com.zhiyou.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @Classname HouseController
 * @Date 2021/11/27 14:54
 */
@Controller
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService houseService;

    /**
     * 展现全部+ 分页 + 模糊查询
     */
    @MyLog("查询全部房屋")
    @RequestMapping("/list.do")
    public String getAllByField(@RequestParam(value = "pageNum", defaultValue = "1", required = false) String pageNum,
                                String field,
                                String keyWord,
                                Model model) {
        PageHelper.startPage(Integer.parseInt(pageNum), 4);
        List<House> houseList = houseService.houseList(field, keyWord);
        PageInfo<House> pageInfo = new PageInfo<>(houseList);
        
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("field", field);
        model.addAttribute("keyWord", keyWord);

        return "forward:/view/flats/list.jsp";
    }

//        PageHelper.startPage(pageNumber, 4);
//        List<House> houseList = houseService.houseList(pageNumber);
//        PageInfo<House> page = new PageInfo<>(houseList);

//        System.out.println("总行数 = "+page);
//        System.out.println("当前页 = "+page.getPageNum());
//        System.out.println("每页几条数据 = "+page.getPageSize());
//        System.out.println("总页数 = "+page.getPages());
//        System.out.println("起始行数 = "+page.getStartRow());
//        System.out.println("总记录数 = "+page.getTotal());
//
//        System.out.println("第一页 = "+page.isIsFirstPage());
//        System.out.println("最后一页 = "+page.isIsLastPage());
//
//        System.out.println("还有下一页 = "+page.isHasNextPage());
//        System.out.println("还有上一页 = "+page.isHasPreviousPage());
//        System.out.println("页码列表 = "+ Arrays.toString(page.getNavigatepageNums()));

    /**
     * 添加
     */
    @RequestMapping("/add.do")
    public ModelAndView addOneHouse(House house, HttpServletRequest request) {
        //========================================= 文件的上传 =========================================
        // 从请求中获得文件对象
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

        // 获得具体的文件,参数名一定与前端name属性一致
        MultipartFile file = req.getFile("himagefile");

        // 确定服务器位置
        ServletContext servletContext = request.getServletContext();
        // 获得服务器/images文件路径,将来图片就存储在服务器的/images
        String realPath = servletContext.getRealPath("/images");
        File parent = new File(realPath);
        if (!parent.exists()) {
            parent.mkdir();
        }
        System.out.println("服务器路径: parent = " + parent);

        // 获得文件名
        String originalFilename = file.getOriginalFilename();
        System.out.println("原始文件名: originalFilename = " + originalFilename);
        // 获得文件名后缀
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        System.out.println("截取的文件后缀 suffix = " + suffix);
        long millis = System.currentTimeMillis();

        // 组装文件名
        String fileName = millis + suffix;
        System.out.println("最终的文件名: fileName = " + fileName);
        File targetFile = new File(parent, fileName);

        // 执行上传
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            System.out.println(">>>>>上传文件失败<<<<<");
            e.printStackTrace();
        }
        System.out.println("上传成功!!!");

        ModelAndView mv = new ModelAndView();
        house.setHimage("images/" + fileName);
        Boolean isOK = houseService.addHouse(house);
        if (isOK) {
            mv.setViewName("/house/list.do");
        } else {
            mv.setViewName("/view/flats/add.jsp");
        }
        return mv;

        //========================================= 文件的上传 =========================================
    }

    /**
     * 详情
     */
    @RequestMapping(value = "/detail.do")
    public ModelAndView detailHouse(Integer hid) {
//        System.out.println("接收到的参数 = "+hid);

        ModelAndView mv = new ModelAndView();

        House detailHouse = houseService.detailHouse(hid);
//        System.out.println("查询出来的数据detailHouse = "+detailHouse);

        mv.addObject("detailHouse", detailHouse);
        mv.setViewName("/view/flats/detail.jsp");

        return mv;
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete.do", method = RequestMethod.GET)
    public ModelAndView deleteHouse(Integer hid) {
//        System.out.println("前 接收到的参数hid = "+ hid);
        ModelAndView mv = new ModelAndView();

        houseService.deleteHouse(hid);
        mv.setViewName("/house/list.do");

        return mv;
    }

    /**
     * 更新前(展现数据)
     */
    @RequestMapping(value = "/update.do")
    public ModelAndView beforeUpdateHouse(Integer hid) {
//        System.out.println("后 接收到的参数hid = "+ hid);

        ModelAndView mv = new ModelAndView();
        House houseById = houseService.findHouseById(hid);

        mv.addObject("houseById", houseById);
        mv.setViewName("/view/flats/edit.jsp");

        return mv;
    }

    /**
     * 更新后(更新数据)
     */
    @RequestMapping(value = "/update2.do")
    public ModelAndView updateHouse(House house,HttpServletRequest request) {

        // 从请求中获得文件对象
        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

        // 获得具体的文件,参数名一定与前端name属性一致
        MultipartFile file = req.getFile("himagefile2");

        // 确定服务器位置
        ServletContext servletContext = request.getServletContext();
        // 获得服务器/images文件路径,将来图片就存储在服务器的/images
        String realPath = servletContext.getRealPath("/images");
        File parent = new File(realPath);
        if (!parent.exists()) {
            parent.mkdir();
        }
        System.out.println("服务器路径: parent = " + parent);

        // 获得文件名
        String originalFilename = file.getOriginalFilename();
        System.out.println("原始文件名: originalFilename = " + originalFilename);
        // 获得文件名后缀
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        System.out.println("截取的文件后缀 suffix = " + suffix);
        long millis = System.currentTimeMillis();

        // 组装文件名
        String fileName = millis + suffix;
        System.out.println("最终的文件名: fileName = " + fileName);
        File targetFile = new File(parent, fileName);

        // 执行上传
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            System.out.println(">>>>>上传文件失败<<<<<");
            e.printStackTrace();
        }
        System.out.println("上传成功!!!");


        ModelAndView mv = new ModelAndView();
        house.setHimage("images/" + fileName);
        houseService.updateHouse(house);

        mv.setViewName("/house/list.do");
        return mv;
    }


}
