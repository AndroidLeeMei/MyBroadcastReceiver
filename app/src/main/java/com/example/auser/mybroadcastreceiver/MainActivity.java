package com.example.auser.mybroadcastreceiver;
/*
    廣的發送者跟接收者不一定是要用同一個app
    可應用在電池電量是否偏低或充足飽滿,需用實機去測試較方便,用模擬器需要設定它參數
    廣播方式1.系統上廣播2.自定廣播
    以都有兩種實作方式1.(靜態)用manifest註冊2.(靜態)用程式去註冊,app只要有安裝過即可偵測,app要在開啟狀態才能偵測

    //傳送者不需要做註冊動件

 */
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        registerReceiver();
    }
    //方法二,由程式註冊BroadcastReceiver2

//        仿照以下設定…

    //                    <action android:name="android.intent.action.PACKAGE_ADDED"/>
//            <!--app安裝完成時的偵測-->
//            <action android:name="android.intent.action.PACKAGE_REMOVED"/>
//                <!--設定資料類型為package…一定是小寫的-->
//                <data android:scheme="package"></data>
    void registerReceiver(){
        BroadcastReceiver2 br2=new BroadcastReceiver2();
        IntentFilter filter=new IntentFilter();
        filter.addAction(Intent.ACTION_PACKAGE_ADDED);
        filter.addAction(Intent.ACTION_PACKAGE_REMOVED);
        filter.addDataScheme("package");//一定是有"package"
        super.registerReceiver(br2,filter);


    }
}
