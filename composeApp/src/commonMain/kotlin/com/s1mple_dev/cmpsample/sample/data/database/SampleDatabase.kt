package com.s1mple_dev.cmpsample.sample.data.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import com.s1mple_dev.cmpsample.sample.data.database.sample.SampleDao
import com.s1mple_dev.cmpsample.sample.data.database.sample.SampleEntity

@Database(
    entities = [SampleEntity::class],
    version = 1
)

@ConstructedBy(SampleDatabaseConstructor::class)
abstract class SampleDatabase: RoomDatabase() {
    abstract val sampleDao: SampleDao

    companion object Companion {
        const val DB_NAME = "sample.db"
    }
}