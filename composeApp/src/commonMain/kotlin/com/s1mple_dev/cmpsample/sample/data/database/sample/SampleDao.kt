package com.s1mple_dev.cmpsample.sample.data.database.sample

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface SampleDao {

    @Upsert
    suspend fun upsert(book: SampleEntity)

    @Query("SELECT * FROM SampleEntity")
    fun getFavoriteBooks(): Flow<List<SampleEntity>>

    @Query("SELECT * FROM SampleEntity WHERE id = :id")
    suspend fun getFavoriteBook(id: String): SampleEntity?

    @Query("DELETE FROM SampleEntity WHERE id = :id")
    suspend fun deleteFavoriteBook(id: String)
}