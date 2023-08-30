import tkinter as tk

def say_hello():
    """This function says hello to the user."""
    user_input = entry.get()
    label.config(text="Hello, " + user_input)
    entry.delete(0, 'end')

root = tk.Tk()
root.title("Hello World")
root.geometry("300x200")

question = tk.Label(root, text="What is your name?")
question.pack()

entry = tk.Entry(root)
entry.pack()

button = tk.Button(root, text="Say Hello", command=say_hello)
button.pack()

label = tk.Label(root)
label.pack()

root.mainloop()