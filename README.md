# Projects with UI output
If you have code that would expect to write to a local graphics card and screen then you need to take a few steps to make this work in Codio.

Click [here]() for general documentation on managing this.

## This demo
This project has a simple demo to illustrate some code that outputs to a UI.

1. In the menu bar, select 'Start demo.py' from the menu with the rocket icon next to it. This will run `demo.py`. 
1. Also in the menu bar, to the right of the previous item, select 'Viewer. Assuming that a program is running, it will show the output.


### Limitations
This approach is very easy to set up and works for most applications. However, because it is transferring the screen frame bugger using the VNC protocol, it is not going to work quickly enough for motion graphics.


## Installing your own projects

### Installing X Server
Because Codio servers are cloud based, there is no local graphics card and screen to write to.

Codio manages this by writing all graphical output to a screen buffer. This is handled by X Server. To install it, go to Tools->Install Software.

You then press the install button in the X Server row. The installation may take some time.

### Running your code
Before you can view any output, your program needs to run, so you should first start your code. When you start the viewer (see below), the UI output will be shown automatically.

You also can start the viewer first but it will be empty until a program runs, whereupon it will refresh.

### The viewer
The viewer is a special window that appears either inside Codio or in a separate browser tab. To open it, you should add `"Viewer": "https://{{domain3000}}/"` to the .codio file. 

```
{
// Configure your Run and Preview buttons here.

// Run button configuration
  "commands": {
        "Start demo.py": "python3 demo.py"
  },

// Preview button configuration
  "preview": {
        "Viewer": "https://{{domain3000}}/"
  }
}
```

You can also access the from any browser using `https://pagoda-cigar-3000.codio.io/` where you replace `pagoda-cigar` with your boxes domain name, which you can find in the menu at 'Project->Box Info' (Web: Static content).

