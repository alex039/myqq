package com.alex.hutang.myqq.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class GetMsgService extends Service {
    public GetMsgService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
