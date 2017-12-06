package com.eumji.zblog.mapper;

import com.eumji.zblog.vo.Project;
import com.eumji.zblog.vo.TaskInfo;
import com.eumji.zblog.vo.User;
import com.eumji.zblog.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * FILE: com.eumji.zblog.mapper.UserMapper.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/4/9
 * TIME: 10:20
 */
@Mapper
public interface ProjectMapper {
    /**
     * 获取项目信息
     * @param projectName 项目名
     * @return
     */
    Project getProject(@Param("projectName") String projectName);
    /**
     * 获取所有的项目
     * @return
     */
    List<Project> getAllProjects();
    void updateProject(Project userInfo);
}
