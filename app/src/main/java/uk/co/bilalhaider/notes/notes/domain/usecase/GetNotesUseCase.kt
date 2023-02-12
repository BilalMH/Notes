package uk.co.bilalhaider.notes.notes.domain.usecase

import uk.co.bilalhaider.notes.notes.domain.repository.NoteRepository

class GetNotesUseCase(
    private val repository: NoteRepository
) {

    operator fun invoke() = repository.getNotes()

}