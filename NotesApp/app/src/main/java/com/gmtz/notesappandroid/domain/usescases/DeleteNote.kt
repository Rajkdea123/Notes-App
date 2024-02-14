package com.gmtz.notesappandroid.domain.usescases


import com.gmtz.notesappandroid.data.Note
import com.gmtz.notesappandroid.data.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}