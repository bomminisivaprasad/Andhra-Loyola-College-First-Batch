package aliet.ece.co.roomdbtest;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class Myrepository {

    public Mydao dao;
    public LiveData<List<Myentity>> list;

    public Myrepository(Application application)
    {
        Myroomdb db=Myroomdb.getDatabase(application);
        dao=db.dao();
        list=dao.getlist();
    }

    public LiveData<List<Myentity>> getList() {
        return list;
    }

    public void insert(Myentity entity){

        new Myasc(dao).execute(entity);
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
