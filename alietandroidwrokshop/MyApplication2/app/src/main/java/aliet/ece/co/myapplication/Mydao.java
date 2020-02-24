package aliet.ece.co.myapplication;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Mydao {

    @Insert
    void insert(Myentity entity);

    @Query("select * from student")
    LiveData<List<Myentity>> read();
}
