package aliet.ece.co.roomdbtest;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student")
public class Myentity {

    @PrimaryKey
    int sno;

    @NonNull
    String sname;

    public Myentity(int sno, @NonNull String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @NonNull
    public String getSname() {
        return sname;
    }

    public void setSname(@NonNull String sname) {
        this.sname = sname;
    }
}
