package aliet.ece.co.implicittest;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.ed1);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void doclickoooo(View view) {

        String s = et.getText().toString();
        Uri u = Uri.parse("tel:" + s);
        Intent i = new Intent(Intent.ACTION_CALL, u);
        if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    Activity#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for Activity#requestPermissions for more details.
            return;
        }
        startActivity(i);

    }

    public void doopenweboooo(View view) {

        String s=et.getText().toString();
        Uri u=Uri.parse("http://"+s);
        Intent i=new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
}
