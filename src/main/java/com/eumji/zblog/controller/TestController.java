package com.eumji.zblog.controller;

import com.eumji.zblog.service.*;
import com.eumji.zblog.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 前台文章处理controller
 * FILE: com.eumji.zblog.controller.ArticleController.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/5/8
 * TIME: 15:15
 */
@Controller
@RequestMapping("/article")
public class TestController {

    /**
     * 测试我的前端
     * @param pager
     * @param model
     * @return
     */
    @RequestMapping("/jw")
    public String jwIndex(Pager<Article> pager, Model model){
        return "oa/index";
    }
}
