package com.lxl.plugins.jobmanager.plugin;

/**
 * Created by lyc on 2017/9/30.
 */
public abstract class JobManager extends AbstractPlugin {

    /**
     *
     */
    public abstract void prepare();

    /**
     *
     */
    public abstract void check();

    /**
     *
     */
    public abstract void transformRule();

}
