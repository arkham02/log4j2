package com.arkham.impl;

import com.arkham.App;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    private static Logger getLogger(){
        String className = Thread.currentThread().getStackTrace()[1].getClassName();
        Logger logger = LogManager.getLogger(className);
        return logger;
    }

    public static void logInfo(String info){
        getLogger().info(info);
    }

    public static void logError(String error){
        getLogger().error(error);
    }
}
