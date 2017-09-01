package com.xiaochao.lcrapiddevelop.MVP.Model;

import android.util.Log;

import com.xiaochao.lcrapiddevelop.Data.HttpData.HttpData;
import com.xiaochao.lcrapiddevelop.MVP.Listener.OnLoadDataListListener;

import rx.Observer;

/**
 * Created by kxf on 2017/9/1.
 */
public class LoginModel {
    public void loginHF(String name, String pwd, String cid, String maccode, final OnLoadDataListListener listener) {
        HttpData.getInstance().HttpDataLogin(name, pwd, cid, maccode, new Observer<String>() {
            @Override
            public void onCompleted() {
                Log.e("kxflog", "onCompleted---->");

            }

            @Override
            public void onError(Throwable e) {
                Log.e("kxflog", "Throwable---->" + e.getMessage());
                listener.onFailure(e);
            }

            @Override
            public void onNext(String data) {
                Log.e("kxflog", "LoginModel---->" + data);
                listener.onSuccess(data);
            }
        });
    }
}
