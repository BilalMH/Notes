package uk.co.bilalhaider.notes.notes.domain.usecase

import uk.co.bilalhaider.notes.notes.domain.model.InvalidNoteException
import uk.co.bilalhaider.notes.notes.domain.model.Note
import uk.co.bilalhaider.notes.notes.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}