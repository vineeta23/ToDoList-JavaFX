package Vineeta.todolist;
import Vineeta.todolist.datamodel.TodoData;
import Vineeta.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;


public class DialogController {
    @FXML
    public DialogPane dialogPane;
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults() {
        String shortDescription = shortDescriptionField.getText();
        String details = detailsArea.getText();
        LocalDate deadlineValue = deadlinePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription,details,deadlineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
