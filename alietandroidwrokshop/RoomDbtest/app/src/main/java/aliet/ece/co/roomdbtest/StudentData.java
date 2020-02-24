package aliet.ece.co.roomdbtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StudentData extends AppCompatActivity {

    EditText e1,e2;

    Myviewmodel obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_data);
        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        obj= ViewModelProviders.of(this).get(Myviewmodel.class);



    }

    public void dosubmitooo(View view) {

        int sno=Integer.parseInt(e1.getText().toString());
        String sname=e2.getText().toString();

        Myentity eno=new Myentity(sno,sname);
        obj.insert(eno);
        Toast.makeText(this, "insereted successfully", Toast.LENGTH_SHORT).show();

        finish();

    }
}
