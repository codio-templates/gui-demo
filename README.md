# Projects with UI output
If you have code that would expect to write to a local graphics card and screen then you need to take a few steps to make this work in Codio.

[Click here](https://docs.codio.com/develop/develop/ide/boxes/installsw/gui.html) for general documentation on managing this.

### Run some applications
This project has a few applications to illustrate full UI output support.

1. In the menu bar, select one of the following demo GUI driven applications

- **Java Swing** - a simple Java swing application source is in the `Swing` folder
- **JavaFX** - a Java application using the JavaFX library source is in the `JavaFX` folder
- **Python Tkinter** - a Python application using the  tkinter library source is in the `Tkinter` folder

You can run more than one if you like.

### Run the X Server viewer
Also in the menu bar, to the right of the previous item, select `Virtual Desktop`. Assuming that a program is running, it will show the X Server desktop. Any UI generating applications will now render their output in the X Server desktop.

