package com.eumji.zblog.service;


import com.eumji.zblog.vo.Project;
import com.eumji.zblog.vo.TaskInfo;
import com.eumji.zblog.vo.User;
import com.eumji.zblog.vo.UserInfo;

import java.util.List;

/**
* Created by GeneratorFx on 2017-04-11.
*/
public interface ProjectService {
    Project getProjectByName(String projectName);
    void updateProject(Project project);
    List<Project> getAllProjects();
}
