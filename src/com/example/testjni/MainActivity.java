package com.example.testjni;

import android.view.View;
import android.widget.Button;
import com.JNI.jni_key.KeyUtil;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
public class MainActivity extends Activity implements View.OnClickListener{

    TextView textView;
    Button button;
    int current_index=0;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        findAllView();
	}

    private void  findAllView()
    {
        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button:
            {
                textView.setText(""+KeyUtil.getArrIndex(current_index)+"::"+current_index++);
            }
            break;
        }
    }
}
