package aliet.ece.co.myapplication;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Myentity.class},version = 1,exportSchema = false)
public abstract class Mydatabase extends RoomDatabase {

    public abstract Mydao mydao();
    private static Mydatabase INSTANCE;

    static Mydatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (Mydatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            Mydatabase.class, "word_database")
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
