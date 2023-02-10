package uk.co.bilalhaider.notes.notes.domain.usecase

import uk.co.bilalhaider.notes.notes.domain.model.InvalidNoteException
import uk.co.bilalhaider.notes.notes.domain.model.Note
import uk.co.bilalhaider.notes.notes.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend fun invoke(note: Note) {
        if (note.title.isBlank()) throw InvalidNoteException("The title of the note is empty")

        repository.insertNote(note)
    }

}
