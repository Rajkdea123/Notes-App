package com.gmtz.notesappandroid.presentation

import com.gmtz.notesappandroid.domain.NoteOrder
import com.gmtz.notesappandroid.domain.OrderType
import com.gmtz.notesappandroid.data.Note

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
