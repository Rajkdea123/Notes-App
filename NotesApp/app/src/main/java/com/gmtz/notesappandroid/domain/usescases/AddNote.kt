package com.gmtz.notesappandroid.domain.usescases

import com.gmtz.notesappandroid.data.InvalidNoteException
import com.gmtz.notesappandroid.data.Note
import com.gmtz.notesappandroid.data.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}