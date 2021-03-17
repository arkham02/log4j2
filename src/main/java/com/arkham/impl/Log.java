package com.arkham.impl;

import com.arkham.App;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    private static Logger getLogger(){
        String className = Thread.currentThread().getStackTrace()[3].getClassName();
        Logger logger = LogManager.getLogger(className);
        return logger;





/*        for(StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            System.out.println(ste);
        }*/

/*
*
* java.lang.Thread.getStackTrace(Thread.java:1559)
com.arkham.impl.Log.getLogger(Log.java:11)
com.arkham.impl.Log.logInfo(Log.java:19)
com.arkham.impl.LogCheck.main(LogCheck.java:6)
* */
    }

    public static void logInfo(String info){
        getLogger().info(info);
    }

    public static void logError(String error){
        getLogger().error(error);
    }
}
