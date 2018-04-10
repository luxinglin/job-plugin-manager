package com.lxl.plugins.jobmanager.server;

import com.lxl.plugins.jobmanager.plugin.JobManager;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-04-10 13:32
 **/
public class VCenterJobManager extends JobManager {
    @Override
    public void prepare() {
        System.out.println("连接VCenter");
    }

    @Override
    public void check() {
        System.out.println("检查VCenter状态");
    }

    @Override
    public void transformRule() {
        System.out.println("将清洗条件转换为VCenter");
    }
}
