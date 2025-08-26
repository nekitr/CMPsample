package com.s1mple_dev.cmpsample.sample.data.database.sample

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SampleEntity(
    @PrimaryKey(autoGenerate = false) val id: String,
    val name: String,
    val size: String,
    val type: Int,
    val creationDate: String,
    val isFavourite: Boolean,
    val isRecent: Boolean,
)
