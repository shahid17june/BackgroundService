package shahid17june.backgroundservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService();

        // click on TextView to Stop service

        findViewById(R.id.stopService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService();
            }
        });
    }

    private void startService(){
        // Construct our Intent specifying the Service
        Intent i = new Intent(this, MyService.class);
        // Start the service
        startService(i);
    }

    public void stopService(){
        Intent myService = new Intent(MainActivity.this, MyService.class);
        // stop service
        stopService(myService);

    }
}
