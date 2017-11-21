package com.example.auser.mybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by auser on 2017/11/21.
 * 自定接收器在mainactivity裏註冊
 */

public class BroadcastReceiver2  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //當有其它app安裝,或移除到手機時,會發出系統廣播
        String event =intent.getAction();
        //BroadcastReceiver1e沒有繼承activity的類型,所以Toast裏第一個參數不能填this,會有問題
        Toast.makeText(context,"自定2: "+event,Toast.LENGTH_SHORT).show();

    }
}
