package com.example.shuyingwang.shuyingsappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void popMessage(View view){
        CharSequence text;
        switch (view.getId()){
            case R.id.button_0:
                text = getResources().getText(R.string.toast_text0);
                break;
            case R.id.button_1:
                text = getResources().getText(R.string.toast_text1);
                break;
            case R.id.button_2:
                text = getResources().getText(R.string.toast_text2);
                break;
            case R.id.button_3:
                text = getResources().getText(R.string.toast_text3);
                break;
            case R.id.button_4:
                text = getResources().getText(R.string.toast_text4);
                break;
            case R.id.button_5:
                text = getResources().getText(R.string.toast_text5);
                break;
            default:
                text = " ";
        }
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }



}
