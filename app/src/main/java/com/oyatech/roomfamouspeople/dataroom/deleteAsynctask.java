package com.oyatech.roomfamouspeople.dataroom;

import android.os.AsyncTask;

public class deleteAsynctask extends AsyncTask<Users, Void, Void> {
    AppDatabase mAppDatabase;
    private UserDao mUserDao;
    public deleteAsynctask(UserDao pDao) {
        this.mUserDao = pDao;
    }

    @Override
    protected Void doInBackground(Users... pUsers) {
        mAppDatabase.mUserDao().deleteFamous(pUsers[0]);
        return null;
    }
}
