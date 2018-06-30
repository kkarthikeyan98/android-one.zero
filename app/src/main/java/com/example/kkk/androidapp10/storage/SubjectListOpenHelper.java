package com.example.kkk.androidapp10.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class SubjectListOpenHelper extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    private static final String SUBJECT_LIST_TABLE = "subject_entries";
    private static final String DATABASE_NAME = "subjectlist";
    // Column names...
    private static final String KEY_ID = "_id";
    private static final String KEY_SUBJECT = "subject";
    private static final String KEY_LECTURES = "lectures";
    private static final String KEY_SUBDETAIL = "subdetail";

    // ... and a string array of columns.
    private static final String[] COLUMNS = {KEY_ID, KEY_SUBJECT, KEY_LECTURES, KEY_SUBDETAIL};

    private static final String SUBJECT_LIST_TABLE_CREATE =
            "CREATE TABLE " + SUBJECT_LIST_TABLE + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    KEY_SUBJECT + " TEXT, " +
                    KEY_LECTURES + " INTEGER, " +
                    KEY_SUBDETAIL + " TEXT );";



    private SQLiteDatabase mWritableDB;
    private SQLiteDatabase mReadableDB;

    public SubjectListOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        Log.d("DB","Database constructed");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SUBJECT_LIST_TABLE_CREATE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
