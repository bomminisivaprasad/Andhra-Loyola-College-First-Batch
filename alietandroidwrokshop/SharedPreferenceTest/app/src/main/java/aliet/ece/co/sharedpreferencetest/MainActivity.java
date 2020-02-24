package aliet.ece.co.sharedpreferencetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText et1,et2;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.ed1);
        et2=findViewById(R.id.ed2);
        sp=getSharedPreferences("file",MODE_PRIVATE);



    }

    public void dologinoooo(View view) {

        String nikenduku=et1.getText().toString();
        String nenuchepanu=et2.getText().toString();

        String regusr=sp.getString("u1","radhu");
        String regp=sp.getString("p1","default");

        if(nikenduku.equalsIgnoreCase(regusr)&&nenuchepanu.equalsIgnoreCase(regp)){

            Toast.makeText(this, "login sucess", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "login faild", Toast.LENGTH_SHORT).show();
        }


    }

    public void doregisteroooo(View view) {

        Intent i=new Intent(this,Register.class);
        startActivity(i);
    }
}
