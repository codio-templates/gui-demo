----

`JavaFX` is another popular GUI library for Java. Just keep in mind that it is no longer included in their `SDK`, so you will need to add it to your project separately. 

`JavaFX` offer a more consisting experience across different Operative Systems.

For this application, take a look at the file tree on the left. You will find the folder with `JavaFX`'s SDK and the file `UserInputApplication.java` which is the application we will compile and run. 

As we are using additional libraries, Java needs to know where those libraries are, so we will use additional flags in the compile and run commands. You can try it with this button:

{Run JavaFX | terminal}(cd /home/codio/workspace/JavaFX && javac --module-path $PATH_TO_FX --add-modules javafx.controls UserInputApplication.java && java --module-path $PATH_TO_FX --add-modules javafx.controls UserInputApplication)


|||warning
Please notice that this is a simple application. If you try to input a number in the age field, you will get an error print in the terminal.
|||