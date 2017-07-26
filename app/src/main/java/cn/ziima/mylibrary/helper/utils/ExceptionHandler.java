package cn.ziima.mylibrary.helper.utils;

import android.content.Context;

import static cn.ziima.mylibrary.helper.utils.phoneUtils.toast;


/**
 * Created by litao on 2017/7/17.
 * 单例模式
 * 未捕捉的异常处理类
 */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static ExceptionHandler instance;

    private ExceptionHandler() {
    }


    public synchronized static ExceptionHandler getInstance() {
        if (instance == null) {
            instance = new ExceptionHandler();
        }
        return instance;
    }

    public void initHandler(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(this);

    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        //所有未捕获的异常将会在这里处理
        toast("抱歉，系统出现异常");

    }
}
