# Projects with UI output
If you have code that would expect to write to a local graphics card and screen then you need to take a few steps to make this work in Codio.

[Click here](https://codio.com/docs/ide/boxes/installsw/gui/) for general documentation on managing this.

### Run some applications
This project has a few applications to illustrate full UI output support.

1. In the menu bar, select one of the following demo GUI driven applications

- **Run Python (tkinter)** - shows a simple interactive graph, source is `demo.py` in the `tkinterpy` folder
- **Run Java (Lunar Phases)** - a java swing application source is in the `swing` folder
- **SQLite** - a full database browser for a sqlite database; try opening `workspace/sqlite/chinook.db`
- **StarUML** - a UML diagram editor try opening `workspace/staruml/model.mdj`

You can run more than one if you like.

### Run the X Server viewer
Also in the menu bar, to the right of the previous item, select 'Viewer. Assuming that a program is running, it will show the X Server desktop. Any UI generating applications will now render their output in the X Server desktop.

