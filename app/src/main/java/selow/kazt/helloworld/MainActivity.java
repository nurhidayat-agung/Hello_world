package selow.kazt.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    TextView tvClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = (Button) findViewById(R.id.btn_click);
        tvClick = (TextView) findViewById(R.id.tv_click);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvClick.setText("hello world");
                Intent pindah = new Intent(MainActivity.this,Lanjut.class);
                startActivity(pindah);
            }
        });

    }

}
