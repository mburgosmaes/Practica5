package com.example.practica5;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class notificacion extends AppCompatActivity {

    EditText txtTitulo, txtTexto, txtSeg;
    Button btnEnviar;
    AppCompatActivity notificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacion);

        notificacion = this;
        txtTitulo = findViewById(R.id.txtTitulo);
        txtTexto = findViewById(R.id.txtTexto);
        txtSeg = findViewById(R.id.txtSeg);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtTitulo.getText().toString().isEmpty() && !txtTexto.getText().toString().isEmpty() && !txtSeg.getText().toString().isEmpty())
                {
                    PendingIntent i = PendingIntent.getActivity(notificacion, 0, getIntent(), 0);
                    final NotificationCompat.Builder mensaje = new NotificationCompat.Builder(notificacion, "idNotif");
                    mensaje.setAutoCancel(true)
                            .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_background))
                            .setSmallIcon(R.drawable.ic_launcher_background)
                            .setDefaults(Notification.DEFAULT_ALL)
                            .setPriority(Notification.PRIORITY_MAX)
                            .setContentTitle(txtTitulo.getText())
                            .setContentText(txtTexto.getText())
                            .setContentIntent(i);
                    NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                    notif.notify(1, mensaje.build());
                }
            }
        });
    }
}

