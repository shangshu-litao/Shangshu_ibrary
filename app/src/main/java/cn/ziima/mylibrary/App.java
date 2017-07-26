package cn.ziima.mylibrary;

import android.app.Application;
import android.content.Context;

/**
 * Created by litao on 2017/7/26.
 */

public class App extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;

    }


    public static Context getcontext(){
        return context;
    }

}
