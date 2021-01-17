package com.oyatech.roomfamouspeople.dataroom;

import android.os.AsyncTask;

public class deleteAllAsyncTask extends AsyncTask<Void, Void, Void> {
    AppDatabase appDatabase;
    public deleteAllAsyncTask(AppDatabase pAppDatabase) {
        appDatabase = pAppDatabase;
    }

    @Override
    protected Void doInBackground(Void... pVoids) {
        appDatabase.mUserDao().deleteAllUsers();
        return null;
    }
}
