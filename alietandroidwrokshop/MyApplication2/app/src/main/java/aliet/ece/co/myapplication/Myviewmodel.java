package aliet.ece.co.myapplication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class Myviewmodel extends AndroidViewModel {

    public MyRepository repository;
    public LiveData<List<Myentity>> list;


    public Myviewmodel(@NonNull Application application) {
        super(application);
        repository=new MyRepository(application);
        list=repository.getGetList();
    }

    public LiveData<List<Myentity>> getList() {
        return list;
    }

    public void insert(Myentity myentity){
        repository.insert(myentity);
    }
}
