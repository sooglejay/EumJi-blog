package com.eumji.zblog.controller.admin;

import com.eumji.zblog.service.ProjectService;
import com.eumji.zblog.util.ResultInfo;
import com.eumji.zblog.util.ResultInfoFactory;
import com.eumji.zblog.vo.Project;
import com.eumji.zblog.vo.TaskInfo;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * FILE: com.eumji.zblog.controller.admin.LoginController.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/4/9
 * TIME: 15:32
 */
@RestController
public class ProjectRestController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/jw", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("oa/index");
        return mv;
    }

    /**
     * 获取用户信息
     *
     * @return
     */
    @RequestMapping(value = "/admin/project/save", method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo saveNewProject(String projectName) {
//        Project p = new Project();
//        p.setProjectName(projectName);
//        projectService.saveProject(p);
        return new ResultInfo("200", "good!");
    }

    @RequestMapping("/admin/project/update")
    @ResponseBody
    public ResultInfo updateProjectInfo(String projectName) {
        Project p = new Project();
        p.setProjectName(projectName);
        projectService.updateProject(p);
        System.out.print(p);
        return ResultInfoFactory.getSuccessResultInfo("更新个人信息成功!!");
    }

}




