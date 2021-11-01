/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Vishal Choday
 */
package ucf.assignments;

import org.testng.annotations.Test;
class ToDoListControllerTest

{

    @Test
    void letusaddthistodolistnow()
    {
        //make a new to do list controller
        //initialize addToDoListButtonClicked to some non-blank value
        //call the addToDoList function
        //get the value resultDisplay
        //assert that the new ToDoList was added to the list of ToDoList
    }

    @Test
    void listremoval()
    {
        //make a new to do list controller
        //initialize removeToDoListButtonClicked to some non-blank value
        //call the removeToDoList function
        //get the value resultDisplay
        //assert that the new ToDoList was removed to the list of ToDoList
    }

    @Test
    void editingtodolist()
    {
        //using this to create new todolist, get the result of the display and
        //make sure our new todolist that we created is the display result.
    }

    @Test
    void letsaddanitemnow()

    {
        //makes sure that the todolist has the same item as the item in the display.
    }

    @Test
    void letsremoveanitemnow()
    {
        //uses the function that deletes the item and makes sure that the todolist is blank when this
        //is done.
    }

    @Test
    void editnameoftheitem()
    {
        //assert that the item description is equal to textDisplay
        //used to enter a new description of the item and makes sure that the description fits whats in the display.
    }

    @Test
    void itemsduedateedit()
    {
        //makes sure that the due date of our item is whats in the display.
    }

    @Test
    void putitemascomplete(){
        //Makes sure that the value thats boolen is true.
    }

    @Test
    void shocaseitemsnow(){
        //makes sure that our output is similar to the string.
    }

    @Test
    void showitemsthatarenotcomplete()
    {
        //makes sure that what is outputted is the tasks that arent complete yet.
    }

    @Test
    void showitemsthatareready(){
        //This makes sure that the output only shows tasks that are finished.
    }

    @Test
    void savewhatwechangedintodolistall(){
        //used to save what was edited in our program.
    }

    @Test
    void savetheseitemsnow()
    {
        //used to save the items created.
    }

    @Test
    void letsloadonetodolist()
    {
        //this is used to load a singular todolist and output it.
    }

    @Test
    void loadmultipletodolistsnow(){
        //used to be able to load more than one todolist and show it.
    }

}