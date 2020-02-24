package aliet.ece.co.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class Myadapter extends RecyclerView.Adapter<Myadapter.Myviewholder> {

    MainActivity ct;
    String names[];
    int images[];

    public Myadapter(MainActivity mainActivity, String[] names, int[] images) {

   this.ct=mainActivity;
   this.names=names;
   this.images=images;

    }

    @NonNull
    @Override
    public Myadapter.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(ct).inflate(R.layout.design,parent,false);
        return new Myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.Myviewholder holder, int position) {

        holder.img.setImageResource(images[position]);
        holder.tv.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class Myviewholder extends RecyclerView.ViewHolder {

       ImageView img;
       TextView tv;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.myimg);
            tv=itemView.findViewById(R.id.mytxt);
        }
    }
}
