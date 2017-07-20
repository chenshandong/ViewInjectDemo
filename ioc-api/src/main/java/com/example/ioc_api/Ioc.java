package com.example.ioc_api;

import android.app.Activity;

/**
 * Created by sean on 2017/7/19.
 */

public class Ioc {
    public static void inject(Activity activity){
        inject(activity, activity);
    }

    private static void inject(Object host, Object root) {
        Class<?> clazz = host.getClass();
        String proxyClassFullName = clazz.getName() + "$$ViewInject";
        try {
            Class<?> proxyClazz = clazz.forName(proxyClassFullName);
            ViewInject viewInject = (ViewInject) proxyClazz.newInstance();
            viewInject.inject(host, root);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
