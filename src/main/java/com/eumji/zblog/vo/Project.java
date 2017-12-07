package com.eumji.zblog.vo;

import org.apache.ibatis.type.Alias;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * 用户信息实体
 * FILE: com.eumji.zblog.vo.PhotoResult.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/4/21
 * TIME: 22:20
 */
@Alias("project")
public class Project implements Serializable {
   private String projectName;
   private long id;
//   List<TaskInfo> tasks;

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", id=" + id +
//                ", tasks=" + tasks +
                '}';
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public long getProjectId() {
        return id;
    }

    public void setProjectId(int projectId) {
        this.id = projectId;
    }

//    public List<TaskInfo> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<TaskInfo> tasks) {
//        this.tasks = tasks;
//    }
}