package uk.co.bilalhaider.notes.notes.domain.usecase

import uk.co.bilalhaider.notes.notes.domain.model.Note
import uk.co.bilalhaider.notes.notes.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? =
        repository.getNote(id)

}