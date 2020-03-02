# PhoneNumbers

# Project Summary
This program takes a name input from the user, compares it to a list of names and correlating phone numbers from two arrays. If the name already exists, the program will display the associated phone number. If not, the program will allow the user to input a phone number for the new name. For instance, if I need to know the phone number of Marcia, a name hard-coded into the program, I will enter her name and be given her stored phone number. Otherwise, I will be allowed to enter the phone number of the person I've named.

# Running the Program
The program will need a compiler compliance level of Java 1.7 to run.

Execute the program by downloading the repository, compiling the code, and running it.

# Class Documentation
This program is relatively streamlined, using imported packages from 'JOptionPane' from the 'swing' function to generate most of it's GUI. As such, the only class in this  program is "PhoneNumbers", which contains both of the arrays, all of the calculations, and all of the GUI we will encounter while using the program.

# Step-By-Step
The program starts by initializing two arrays, String[]names and String numbers[] which serve as our 'phonebook'. After that, the program initializes variables, String entryName and entryPhone, int x, boolean isFound, and int highest.

entryName is the name the program accepts from the user.
entryPhone is the phone number the program asks from the user if they enter an unregistered name.
x is a variable that helps us set the maximum number of registrations to 30. (See below)
isFound is a variable representing the function for determining if we have the name the user has entered in the phonebook already. If it becomes true, we do have the name registered and the phone number will be displayed. Otherwise, the user is prompted for entryPhone.
highest is our final variable, incremented by variable x to a cap of 30 people, at which point no more registrations can be added.

Next, the program displays a Dialog window asking the user to enter a name to look up or register, with the added option of typing 'quit' to stop the program. (Note: This is the only condition in which the run will be considered a 'success'. If you exit any other way, the build will report as a failure even if closed intentionally.)

Once the program accepts entryName, the string is compared to every other string in the 'names[]' array. If there is a match found, isFound will be set to 'true', and a dialog box will appear displaying the phone number associated with the name.

If no match is found, however, a new dialog box appears asking the user to input the phone number of the person whose name they have entered (entryPhone). After this step, the new name and new phone number will appear in future searches, associated solely with one another.
