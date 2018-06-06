package mhvalente.com.listview;

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

        Button btLvComum = findViewById(R.id.btLvNormal);
        Button btLvPerso = findViewById(R.id.btLvPersonalizada);

        btLvComum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ListViewComum.class);
                startActivity(it);
            }
        });
    }
}
