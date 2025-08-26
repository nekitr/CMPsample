package com.s1mple_dev.cmpsample.sample.data.database

import androidx.room.RoomDatabaseConstructor

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object SampleDatabaseConstructor: RoomDatabaseConstructor<SampleDatabase> {
    override fun initialize(): SampleDatabase
}