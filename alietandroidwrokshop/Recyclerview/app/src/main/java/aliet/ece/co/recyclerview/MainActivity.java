package aliet.ece.co.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    RecyclerView re;

    String names[];
    int images[];

    //String a[]={"0mhg","hg",.....};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re = findViewById(R.id.rec);
        names = getResources().getStringArray(R.array.heroname);

        images= new int[]{R.drawable.ic_one,
                R.drawable.ic_two,
                R.drawable.ic_three,
                R.drawable.ic_four,
                R.drawable.ic_five,
                R.drawable.ic_six,
                R.drawable.ic_seven,
                R.drawable.ic_eight,
                R.drawable.ic_nine,
                R.drawable.ic_ten

        };


        Myadapter adapter=new Myadapter(this,names,images);

        re.setAdapter(adapter);
        re.setLayoutManager(new LinearLayoutManager(this));
    }
}
