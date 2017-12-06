package com.eumji.zblog.service.impl;

import com.eumji.zblog.mapper.ProjectMapper;
import com.eumji.zblog.service.ProjectService;
import com.eumji.zblog.vo.Project;
import com.eumji.zblog.vo.TaskInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GeneratorFx on 2017-04-11.
 */
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public Project getProjectByName(String projectName) {
        return projectMapper.getProject(projectName);
    }

    @Override
    public void updateProject(Project project) {
         projectMapper.updateProject(project);

    }

    @Override
    public List<Project> getAllProjects() {
        return projectMapper.getAllProjects();
    }
}


