package com.lxl.plugins.jobmanager.db;

import com.lxl.plugins.jobmanager.plugin.JobManager;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-04-09 16:39
 **/
public class MongoDBJobManager extends JobManager {

    @Override
    public void prepare() {
        System.out.println("连接MongoDB数据库");
    }

    @Override
    public void check() {
        System.out.println("检查MongoDB数据库表、字段，没有则创建");
    }

    @Override
    public void transformRule() {
        System.out.println("将清洗条件转换为MongoDB");
    }
}
