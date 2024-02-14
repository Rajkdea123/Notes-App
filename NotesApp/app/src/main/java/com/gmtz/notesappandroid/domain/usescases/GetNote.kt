package com.gmtz.notesappandroid.domain.usescases

import com.gmtz.notesappandroid.data.Note
import com.gmtz.notesappandroid.data.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}