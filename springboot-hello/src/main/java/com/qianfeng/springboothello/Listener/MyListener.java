package com.qianfeng.springboothello.Listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

@Component
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.err.println("MyListener....destroy");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.err.println("MyListener....init");
    }
}
