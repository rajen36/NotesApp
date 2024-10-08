package com.example.roomdatabase.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert


@Dao
interface NoteDao {

    @Upsert
    suspend fun upsertNote(note: Note) {
    }

    @Delete
    suspend fun deleteNote(note: Note) {
    }

    @Query("SELECT * FROM note ORDER BY dateAdded")
    fun getsNotesOrderByDateAdded() : kotlinx.coroutines.flow.Flow<List<Note>>


    @Query("SELECT * FROM note ORDER BY title ASC")
    fun getsNotesOrderByTitle() : kotlinx.coroutines.flow.Flow<List<Note>>


}