package com.s1mple_dev.cmpsample.sample.data.database

import androidx.room.RoomDatabase

expect class DatabaseFactory {
    fun create(): RoomDatabase.Builder<SampleDatabase>
}