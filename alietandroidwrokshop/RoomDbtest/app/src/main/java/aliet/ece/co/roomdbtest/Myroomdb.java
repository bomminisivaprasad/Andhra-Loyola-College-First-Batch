package aliet.ece.co.roomdbtest;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Myentity.class},version = 1,exportSchema = false)
public abstract class Myroomdb extends RoomDatabase {

public abstract Mydao dao();
    private static Myroomdb INSTANCE;

    static Myroomdb getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (Myroomdb.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            Myroomdb.class, "word_database")
                            // Wipes and rebuilds instead of migrating
                            // if no Migration object.
                            // Migration is not part of this practical.
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}