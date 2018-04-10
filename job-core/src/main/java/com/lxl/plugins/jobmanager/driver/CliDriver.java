package com.lxl.plugins.jobmanager.driver;

import com.lxl.plugins.jobmanager.core.PluginLoader;
import com.lxl.plugins.jobmanager.plugin.JobManager;
import com.lxl.plugins.jobmanager.util.PluginUtils;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: 程序入口
 * @create 2018-04-09 16:39
 **/
public class CliDriver {
    public static void main(String[] args) throws Exception {

        if (args.length < 1) {
            System.out.println("缺少参数插件名称");
            System.exit(-1);
        }

        String[] pluginNames = args[0].split(",");
        for (String pluginName : pluginNames) {
            System.out.println(String.format("-----------%s plugin excute---------------", pluginName));
            try {
                String pluginClassName = PluginLoader.getPluginClassName(pluginName);
                Class<?> cls = PluginUtils.loadClass(pluginName, pluginClassName);
                JobManager jobManager = (JobManager) cls.newInstance();
                jobManager.prepare();
                jobManager.check();
                jobManager.transformRule();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
