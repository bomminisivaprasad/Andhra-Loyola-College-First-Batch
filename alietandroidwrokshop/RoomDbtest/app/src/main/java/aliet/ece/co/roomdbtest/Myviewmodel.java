package aliet.ece.co.roomdbtest;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class Myviewmodel extends AndroidViewModel {



    public Myrepository repo;
    public LiveData<List<Myentity>> list;

    public Myviewmodel(@NonNull Application application) {
        super(application);
        repo=new Myrepository(application);
        list=repo.getList();

    }

    public LiveData<List<Myentity>> getList() {
        return list;
    }

    public void insert(Myentity entity){
        repo.insert(entity);
    }
}
