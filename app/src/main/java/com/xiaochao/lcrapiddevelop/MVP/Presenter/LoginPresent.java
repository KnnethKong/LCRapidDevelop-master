package com.xiaochao.lcrapiddevelop.MVP.Presenter;

import com.xiaochao.lcrapiddevelop.MVP.Listener.OnLoadDataListListener;
import com.xiaochao.lcrapiddevelop.MVP.View.LoginTokenView;

/**
 * Created by kxf on 2017/9/1.
 */
public class LoginPresent implements OnLoadDataListListener<String> {
    private LoginTokenView loginTokenView;

    @Override
    public void onSuccess(String data) {

    }

    @Override
    public void onFailure(Throwable e) {

    }
}
