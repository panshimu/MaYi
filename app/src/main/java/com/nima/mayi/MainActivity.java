package com.nima.mayi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;

public class MainActivity extends AppCompatActivity {

    private RequestParams mParams = new RequestParams();
    private AsyncHttpClient mAsyncHttpClient = new AsyncHttpClient();
    private final String URL = "http://www.mayi.com/api/v4/validCity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
    }

    private void loadData() {
        mParams.put("clientInfo","{\"model\":\"NoxW\"," +
                "\"os\":\"4.4.2\"," +
                "\"screen\":\"720*1242\",\"" +
                "uniqId\":\"2ea7fb9c-68e0-3a44-b8e5-e4a02ed75592\"," +
                "\"version\":\"4.7.3\",\"from\":\"yingyongbao\"," +
                "\"appIdentifier\":\"com.mayi.android.shortrent\"," +
                "\"appId\":\"7040\"}");
        mParams.put("sign","1cfef7efa4816de209f390712702b416");
        mParams.put("timeStamp","1448673091");
    }
}
