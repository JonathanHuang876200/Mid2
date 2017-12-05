package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }











    public void OnClick1(View view) {
        Button b1 = (Button) findViewById(R.id.one);
        Intent intent = new Intent(this, Func1Activity.class);
        startActivityForResult(intent,1);
    }
    public void OnClick2(View view) {
        Button b2 = (Button) findViewById(R.id.two);
        Intent intent = new Intent(this, Func2Activity.class);
        startActivityForResult(intent,2);
    }
    public void OnClick3(View view) {
        Button b3 = (Button) findViewById(R.id.three);
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent,3);
    }
    public void OnClick4(View view) {
        Button b4 = (Button) findViewById(R.id.four);
        Intent intent = new Intent(this, Func4Activity.class);
        startActivityForResult(intent,4);
    }
    public void OnClick5(View view) {
        Button b5 = (Button) findViewById(R.id.five);
        Intent intent = new Intent(this, Func5Activity.class);
        startActivityForResult(intent,5);
    }
    public void OnClick6(View view) {
        Button b6 = (Button) findViewById(R.id.six);
        Intent intent = new Intent(this, Func6Activity.class);
        startActivityForResult(intent,6);
    }
    public void OnClick7(View view) {
        Button b7 = (Button) findViewById(R.id.seven);
        Intent intent = new Intent(this, Func7Activity.class);
        startActivityForResult(intent,7);
    }
    public void OnClick8(View view) {
        Button b8 = (Button) findViewById(R.id.eight);
        Intent intent = new Intent(this, Func8Activity.class);
        startActivityForResult(intent,8);
    }
}