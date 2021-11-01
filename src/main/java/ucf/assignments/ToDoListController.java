/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Vishal Choday
 */
package ucf.assignments;


 import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

    public class ToDoListController {
        @FXML
        private TextField textDisplay;

        @FXML
        public void displayAllItemsButtonClicked(ActionEvent the_action_events) {
            shocaseitemsnow();
        }


        @FXML
        public void displayIncompletionsButtonClicked(ActionEvent the_action_events) {
            showitemsthatarenotcomplete();
        }

        @FXML
        public void displayCompletionsButtonClicked(ActionEvent the_action_events) {
            showitemsthatareready();
        }

        @FXML
        public void saveItemsButtonClicked(ActionEvent the_action_events) {
            savetheseitemsnow();
        }

        @FXML
        public void saveAllItemsButtonClicked(ActionEvent the_action_events) {
            savewhatwechangedintodolistall();
        }


        @FXML
        public void loadSingleToDoListButtonClicked(ActionEvent the_action_events) {
            letsloadonetodolist();
        }

        @FXML
        public void loadMultToDoListButtonClicked(ActionEvent the_action_events) {
            loadmultipletodolistsnow();
        }
        public void addToDoListButtonClicked(ActionEvent the_action_events) {
            letusaddthistodolistnow();
        }

        @FXML
        public void removeToDoListButtonClicked(ActionEvent the_action_events) {
            listremoval();
        }

        @FXML
        public void editToDoListTitleButtonClicked(ActionEvent the_action_events) {
            editingtodolist();
        }

        @FXML
        public void addItemButtonClicked(ActionEvent the_action_events) {
            letsaddanitemnow();
        }

        @FXML
        public void removeItemButtonClicked(ActionEvent the_action_events) {
            letsremoveanitemnow();
        }



        @FXML
        public void editItemDescriptionButtonClicked(ActionEvent the_action_events) {
            //using this to change the name of the item if needed.
        }

        @FXML
        public void editItemDueDateButtonClicked(ActionEvent the_action_events) {
            itemsduedateedit();
        }

        @FXML
        public void markItemCompleteButtonClicked(ActionEvent the_action_events) {
            putitemascomplete();
        }

        public void letusaddthistodolistnow(){
            //add a list of the same string as textDisplay
        }

        public void listremoval(){
            //this is used to delete a list that has a similar string as what is being displayed.
        }

        public void editingtodolist(){
            //WIll take the name of the todolist and ask the user to enter a new name.
            //This will change the name of the string in the list.
        }

        public void letsaddanitemnow(){
            //This will take the name the user wants to change in the display.
            //This asks to enter the item needed and asks for a date.
            //This asks to user for a description and will add items to the list.
        }


            public void editnameoftheitem(){
                //set the item description
                //Asks if you want to edit display and asks what item do they want to be changed.
                //Has you edit the description of the item and will put it as is.

        }

        public void letsremoveanitemnow(){
            //This will asks if the person wants to edit from the display.
            //This will ask what item they want to be deleted.
        }

        public void itemsduedateedit(){
            //asks for the due date of the item and will set the due date that was inputted.
        }
        public void putitemascomplete(){
            //will ask what item they would like to mark and change boolean to true.
        }

        public void shocaseitemsnow(){
            //Used to display a list.  Will use a forloop for this.
        }

        public void showitemsthatarenotcomplete(){
            //let's call the display function to display item.
            //if boolean turns out to be false, we must display the item.
        }

        public void showitemsthatareready(){
            //let's call function to display the item now.
            //if the boolean turns out to be false, we must show item.
        }


            public void savewhatwechangedintodolistall(){
                //save changes in all ToDoLists to json
        }

           public void savetheseitemsnow(){
                //We use this to save all of our changes into a singular list.
        }

        public void letsloadonetodolist(){
            //used to load all of the items into a singular todolist.
        }
        public void loadmultipletodolistsnow()
        {
            //used to load more than one lists.



        }
    }