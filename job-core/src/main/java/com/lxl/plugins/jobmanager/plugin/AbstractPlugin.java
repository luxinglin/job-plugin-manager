package com.lxl.plugins.jobmanager.plugin;

/**
 * Created by lyc on 2017/9/30.
 */
public abstract class AbstractPlugin implements Pluginable {

    private String pluginName;

    @Override
    public String getPluginName() {
        return pluginName;
    }

    @Override
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }
}
