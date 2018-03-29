package xnmll.cn.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class demo_3_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week03_2);
        Intent gintent=getIntent();
        String getInformation=gintent.getStringExtra("message");
        Toast.makeText(demo_3_2.this,getInformation,Toast.LENGTH_LONG).show();

    }

}
