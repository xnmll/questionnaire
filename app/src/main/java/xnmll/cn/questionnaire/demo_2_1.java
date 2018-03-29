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

/*
真TMD卡！！！！！！！！！
 */
public class demo_2_1 extends AppCompatActivity {
    final int RESULT_CODE=101;
    final int REQUEST_CODE=1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_2_1);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(demo_2_1.this,demo_2_2.class);
                intent.putExtra("message","message");
                startActivityForResult(intent,REQUEST_CODE);
            }
        });

    }
    protected void onActivityResult(int req,int res,Intent da){
        if (req==REQUEST_CODE&&res==RESULT_CODE){
            String result=da.getStringExtra("result");
            Toast.makeText(demo_2_1.this,result,Toast.LENGTH_LONG).show();

        }
    }
}
