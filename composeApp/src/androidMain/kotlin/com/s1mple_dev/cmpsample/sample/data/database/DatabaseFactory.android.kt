package com.s1mple_dev.cmpsample.sample.data.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

actual class DatabaseFactory(
    private val context: Context
) {
    actual fun create(): RoomDatabase.Builder<SampleDatabase> {
        val appContext = context.applicationContext
        val dbFile = appContext.getDatabasePath(SampleDatabase.DB_NAME)

        return Room.databaseBuilder(
            context = appContext,
            name = dbFile.absolutePath
        )
    }
}