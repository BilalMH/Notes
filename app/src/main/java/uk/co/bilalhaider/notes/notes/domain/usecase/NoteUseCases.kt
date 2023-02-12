package uk.co.bilalhaider.notes.notes.domain.usecase

data class NoteUseCases(
    val addNote: AddNoteUseCase,
    val deleteNote: DeleteNoteUseCase,
    val getNote: GetNoteUseCase,
    val getNotes: GetNotesUseCase
)
