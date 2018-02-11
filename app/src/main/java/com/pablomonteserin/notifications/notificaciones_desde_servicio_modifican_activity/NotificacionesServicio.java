package com.pablomonteserin.notifications.notificaciones_desde_servicio_modifican_activity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.pablomonteserin.ejercicios.R;
import com.pablomonteserin.notifications.notificaciones_desde_servicio_modifican_activity.NotificationUtilsConPendingIntentParaServicio;

/**
 * Created by monty on 4/09/17.
 */

public class NotificacionesServicio extends Service {
    NotificationManager mNotificationManager;
    String CHANNEL_ID = "MY_CHANNEL_ID";

    @Override
    public void onCreate() {
        super.onCreate();
        mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        final Service service = this;

        new CountDownTimer(81000, 3000) {
            private NotificationUtilsConPendingIntentParaServicio mNotificationUtils;

            public void onTick(long millisUntilFinished) {

                if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    // only for Oreo(8) and newer versions
                    mNotificationUtils = new NotificationUtilsConPendingIntentParaServicio(NotificacionesServicio.this, true);
                }
                else{
                    mNotificationUtils = new NotificationUtilsConPendingIntentParaServicio(NotificacionesServicio.this, false);
                }

                Notification.Builder nb = mNotificationUtils.getChannelNotification("Titulo", "Mensaje", R.raw.hakunamatata);
                mNotificationUtils.getManager().notify(101, nb.build());

            }

            @Override
            public void onFinish() {

            }
        }.start();;

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
