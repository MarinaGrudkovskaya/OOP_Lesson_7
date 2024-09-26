package OOP.Lessen7;

import java.time.LocalDateTime;
import java.util.List;

public interface NotebookView {
    void showNotes(List<Note> notes);
    void showMessage(String massage);
    LocalDateTime getDateTimeInput();
    String getDescriptionInput();
    String getFileNameInput();
}
