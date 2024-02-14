package com.gmtz.notesappandroid.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    @PrimaryKey val id: Int? = null
)

class InvalidNoteException(message: String): Exception(message)
