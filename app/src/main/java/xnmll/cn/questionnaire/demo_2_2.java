package xnmll.cn.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class demo_2_2 extends AppCompatActivity {
    final int RESULT_CODE=101;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_2_2);
        Intent gintent=getIntent();
        String message=gintent.getStringExtra("message");
        Toast.makeText(demo_2_2.this,message,Toast.LENGTH_LONG).show();
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("result","来自第二个页面的返回值");
                setResult(RESULT_CODE,intent);
                finish();
            }
        });
    }

}
