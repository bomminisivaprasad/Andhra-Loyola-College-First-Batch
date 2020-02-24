package aliet.ece.co.broadcastrceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;

class MyReceiver extends BroadcastReceiver {
    ImageView image;
    public MyReceiver(ImageView imageView) {
        image=imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                image.setImageResource(R.drawable.img2);
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                image.setImageResource(R.drawable.img1);
                Toast.makeText(context, "HAI", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
