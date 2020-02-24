package aliet.ece.co.sharedpreferencetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {


    EditText e1,e2;

    SharedPreferences sp;
    SharedPreferences.Editor ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=findViewById(R.id.red1);
        e2=findViewById(R.id.red2);

        sp=getSharedPreferences("file",MODE_PRIVATE);
    }

    public void dodoregisteroooo(View view) {


        String s1=e1.getText().toString();
        String s2=e2.getText().toString();

        ed=sp.edit();
        ed.putString("u1",s1);
        ed.putString("p1",s2);
        ed.commit();

        Toast.makeText(this, "register success", Toast.LENGTH_SHORT).show();
        finish();

    }
}
