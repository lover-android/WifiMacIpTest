package com.example.administrator.wifimaciptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.getMacAddress);
        tv2 = (TextView) findViewById(R.id.getIpAddress);
        tv3 = (TextView) findViewById(R.id.getWifiInfo);
        tv4 = (TextView) findViewById(R.id.ipAddressToint);
        tv5 = (TextView) findViewById(R.id.intToIpAddress);
        tv6 = (TextView) findViewById(R.id.getAvailableNetworks);
        tv7 = (TextView) findViewById(R.id.getConnectedWifiMacAddress);

        tv1.setText(MacAddressUtils.getMacAddress(getApplicationContext()));
        tv2.setText(MacAddressUtils.getIpAddress(getApplicationContext()));
        tv3.setText(MacAddressUtils.getWifiInfo(getApplicationContext()).toString());
        tv6.setText(MacAddressUtils.getAvailableNetworks(getApplicationContext()).toString());
        tv7.setText(MacAddressUtils.getConnectedWifiMacAddress(getApplicationContext()));

    }
}
