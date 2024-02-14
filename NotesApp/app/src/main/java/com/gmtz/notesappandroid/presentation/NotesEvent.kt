package com.gmtz.notesappandroid.presentation

import com.gmtz.notesappandroid.domain.NoteOrder
import com.gmtz.notesappandroid.data.Note

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object ToggleOrderSection: NotesEvent()
}