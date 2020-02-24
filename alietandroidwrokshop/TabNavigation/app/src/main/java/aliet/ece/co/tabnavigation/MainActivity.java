package aliet.ece.co.tabnavigation;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tab;
ViewPager view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=findViewById(R.id.tab_layout);
        view=findViewById(R.id.view_page);
        MyAdapter myAdapter=new
                MyAdapter(getSupportFragmentManager());
        view.setAdapter(myAdapter);
        tab.setupWithViewPager(view);
    }

    private class MyAdapter extends FragmentStatePagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Android();
                case 1:
                    return new Java();
                case 2:
                    return new Python();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "Android";
                case 1:
                    return "Java";
                case 2:
                    return "Python";
            }
            return super.getPageTitle(position);
        }
    }
}
