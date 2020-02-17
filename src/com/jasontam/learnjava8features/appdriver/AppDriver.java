package com.jasontam.learnjava8features.appdriver;

import com.jasontam.learngradlejavaproject.applogging.AppLogger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class AppDriver {

    public static void main(String[] args) {

        Logger log=AppLogger.setLogger(AppDriver.class.getName());

        //add a Console Handler so we can see the log as we run it
        log.addHandler(new ConsoleHandler());

        log.warning("STARTING");

        String thisMethodName = new Object() {}.getClass().getEnclosingMethod().getName();

        log.entering(AppDriver.class.getName(), thisMethodName);
        log.exiting(AppDriver.class.getName(), thisMethodName);

    }
}
