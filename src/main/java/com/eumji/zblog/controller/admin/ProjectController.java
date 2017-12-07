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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * 获取用户信息
     * @return
     */
    @RequestMapping("/admin/project/get")
    @ResponseBody
    public ResultInfo getProjectInfo(){

       List<Project>projects = new ArrayList<>();
       for (int i=1;i<=4;i++){
           Project project = new Project();
           String pName = "这是项目-"+i;
           project.setProjectName(pName);
           project.setProjectId(i+1);
           List<TaskInfo>taskInfos=new ArrayList<>();
           for (int t=1;t<(10*Math.random()+3);t++){
               TaskInfo taskInfo= new TaskInfo();
               taskInfo.setTaskName("这是任务-"+t);
               taskInfo.setProjectName(pName);
               taskInfo.setTaskId(t);
               taskInfos.add(taskInfo);
           }
           project.setTasks(taskInfos);
           projects.add(project);
       }
        return new ResultInfo("200","",projects);

    }

    @RequestMapping("/admin/update/project")
    @ResponseBody
    public ResultInfo updateProjectInfo(List<Project> userInfo){
//        projectService.updateProject(userInfo);
        System.out.print(userInfo);
        return ResultInfoFactory.getSuccessResultInfo("更新个人信息成功!!");
    }

}


