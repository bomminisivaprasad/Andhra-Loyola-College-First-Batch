package aliet.ece.co.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    EditText editText;
    Myviewmodel myviewmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText=findViewById(R.id.ed1);
        myviewmodel= ViewModelProviders.of(this).get(Myviewmodel.class);
    }

    public void doclick(View view) {

        String s=editText.getText().toString();

        Myentity myentity=new Myentity(s);
        myviewmodel.insert(myentity);
        Toast.makeText(this, "inserted", Toast.LENGTH_SHORT).show();

        finish();

    }
}
