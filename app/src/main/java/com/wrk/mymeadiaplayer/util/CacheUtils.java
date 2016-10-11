package com.wrk.mymeadiaplayer.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.wrk.mymeadiaplayer.service.MusicPlayerService;


/**
 * Created by MrbigW on 2016/10/9.
 * weChat:1024057635
 * Github:MrbigW
 * Usage: 缓存工具类--共享偏好
 * -------------------=.=------------------------
 */

public class CacheUtils {


    /**
     * 缓存数据
     *
     * @param context
     * @param key
     * @param value
     */
    public static void putString(Context context, String key, String value) {

        SharedPreferences sp = context.getSharedPreferences("atsgg", Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();

    }

    /**
     * 得到缓存文本信息
     *
     * @param context
     * @param key
     * @return
     */
    public static String getString(Context context, String key) {

        SharedPreferences sp = context.getSharedPreferences("atsgg", Context.MODE_PRIVATE);
        return sp.getString(key, "");
    }

    /**
     * 保存播放模式
     *
     * @param musicPlayerService
     * @param key
     * @param value
     */
    public static void savePlayMode(MusicPlayerService musicPlayerService, String key, int value) {
        SharedPreferences sp = musicPlayerService.getSharedPreferences("atsgg", Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();
    }

    /**
     * 得到播放模式
     * @param musicPlayerService
     * @param key
     * @return
     */
    public static int getPlayMode(MusicPlayerService musicPlayerService, String key) {
        SharedPreferences sp = musicPlayerService.getSharedPreferences("atsgg", Context.MODE_PRIVATE);
        return sp.getInt(key, MusicPlayerService.REPEAT_NOMAL);
    }
}
