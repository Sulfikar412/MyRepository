from tkinter import*
win=Tk();
def click():
    print("Welcome to Python")
button=Button(win,text="Welcome",width=11,height=2,background="black",fg="white",command=click)
button.pack()
win.mainloop()