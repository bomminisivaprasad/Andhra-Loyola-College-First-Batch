package aliet.ece.co.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
    }

    public void next(View view) {
        Intent i=new Intent
                (MainActivity.this,
                        Main2Activity.class);
        String s=editText.getText().toString();
        i.putExtra("key",s);
        startActivity(i);
    }
}
