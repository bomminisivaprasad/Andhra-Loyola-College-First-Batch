package aliet.ece.co.myapplication;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class MyRepository {

    public Mydao dao;
    public LiveData<List<Myentity>> getList;

    public MyRepository(Application application){

        Mydatabase mydatabase=Mydatabase.getDatabase(application);
        dao=mydatabase.mydao();
        getList=dao.read();
    }


    public LiveData<List<Myentity>> getGetList() {
        return getList;
    }


    public void insert(Myentity myentity){
        new Myasc(dao).execute(myentity);
    }

    private class Myasc extends AsyncTask<Myentity,Void,Void> {

        Mydao dao;
        public Myasc(Mydao dao) {
            this.dao=dao;
        }

        @Override
        protected Void doInBackground(Myentity... myentities) {
            dao.insert(myentities[0]);

            return null;
        }
    }
}
