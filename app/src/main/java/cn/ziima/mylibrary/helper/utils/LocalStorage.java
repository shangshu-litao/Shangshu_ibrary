package cn.ziima.mylibrary.helper.utils;

import android.content.Context;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import cn.ziima.mylibrary.App;


/**
 * Created by Auser on 2017/1/11.
 */
public class LocalStorage {
    private static FileOutputStream outputStream;
    private static FileInputStream inputStream;
    private static final String TOKEN = "token.txt";
    private static String token = null;

    /**
     * 在根目录下创建文件
     */
    public static void creatFile() {
        File file = new File(App.getcontext().getFilesDir(), TOKEN);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 写入token
     *
     * @param s token 内容
     */
    public static void writeToken(String s) {
        try {
            outputStream = App.getcontext().openFileOutput(TOKEN, Context.MODE_PRIVATE);
            outputStream.write(s.getBytes("UTF-8"));
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除token
     */
    public static void deleteToken() {
        File file = new File(App.getcontext().getFilesDir(), TOKEN);
        if (file.exists()) {
            file.delete();
        }
    }

    /**
     * 读取token
     *
     * @return
     */
    public static String readToken() {
        creatFile();
        token = null;
        try {
            inputStream = App.getcontext().openFileInput(TOKEN);
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();

            int len = 0;
            byte[] buffer = new byte[1024];
            while ((len = inputStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, len);
            }
            byte[] content_byte = outStream.toByteArray();
            token = new String(content_byte);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (token == null) {
            token = "";
        }
        return token;
    }
}








