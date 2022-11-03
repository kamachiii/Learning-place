from cProfile import label
from email.policy import strict
import string
from tkinter import *
from tkinter.ttk import *
from time import strftime
root = Tk()
root.title('Clock')

def time():
    string = strftime('%H:%M:%S %p')
    lbl.config(text = string)
    lbl.after(1000, time)

lbl = Label(root, font = ('calibri', 40, 'bold'),
            background = 'black',
            foreground = 'purple')

lbl.pack(anchor='center')
time()

mainloop()
