package xnmll.cn.questionnaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<CheckBox> checkBoxList=new ArrayList<CheckBox>();//CheckBox集合
    private List<RadioButton> radioButtonList=new ArrayList<RadioButton>();//RadioiButton集合
    private List<String> strings=new ArrayList<String>();//内容
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxList.add((CheckBox)findViewById(R.id.checkBox));
        checkBoxList.add((CheckBox) findViewById(R.id.checkBox2));
        checkBoxList.add((CheckBox) findViewById(R.id.checkBox3));
        checkBoxList.add((CheckBox) findViewById(R.id.checkBox4));

        radioButtonList.add((RadioButton) findViewById(R.id.radioButton));
        radioButtonList.add((RadioButton) findViewById(R.id.radioButton2));
        radioButtonList.add((RadioButton) findViewById(R.id.radioButton3));

        textView= (TextView) findViewById(R.id.textView2);

        //CheckBox的监听事件
        for (final CheckBox checkBox:checkBoxList){
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        strings.add(checkBox.getText().toString());
                        setTextViewText();
                    }else{
                        strings.remove(checkBox.getText().toString());
                        setTextViewText();
                    }
                }
            });
        }
        //RadioButton的监听事件
        for (final RadioButton radioButton:radioButtonList){
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        strings.add(radioButton.getText().toString());
                        setTextViewText();
                    }else{
                        strings.remove(radioButton.getText().toString());
                        setTextViewText();
                    }
                }
            });
        }


    }
    /*
    绑定数据方法，你每次Checkchanged后调用更新
     */
    private void setTextViewText(){
        textView.setText(strings.toString());

    }
}
