package aliet.ece.co.roomdbtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class Myadapter extends RecyclerView.Adapter<Myadapter.Myviewholder> {
    MainActivity ct;
    List<Myentity> list;

    public Myadapter(MainActivity mainActivity, List<Myentity> myentities) {

   this.ct=mainActivity;
   this.list=myentities;

    }

    @NonNull
    @Override
    public Myadapter.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(ct).inflate(R.layout.design,parent,false);
        return new Myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.Myviewholder holder, int position) {

        holder.t1.setText(""+list.get(position).sno);
        holder.t2.setText(list.get(position).sname);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder {

      TextView t1,t2;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.tv1);
            t2=itemView.findViewById(R.id.tv2);
        }
    }
}
