package com.eumji.zblog.vo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * Created by eumji on 17-5-30.
 */
@Alias("task")
public class TaskInfo implements Serializable {
    private String projectName; //项目名
    private String taskName; //任务名
    private long  stamp; //时间戳
    public long getStamp() {
        return stamp;
    }
    public void setStamp(long stamp) {
        this.stamp = stamp;
    }

    private int taskId; //任务名
    public String getProjectName() {
        return projectName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setProjectName(String projectName) {

        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "TaskInfo{" +
                "projectName='" + projectName + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskId='" + taskId + '\'' +
                '}';
    }
}
