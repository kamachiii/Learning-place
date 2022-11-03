#creating turtle
from tkinter import mainloop
import turtle
t = turtle.Turtle()
#background black
turtle.bgcolor("black")
turtle.pensize(2)
turtle.speed(0)

#pengulangan
while(True):
    for i in range(6):
        for colors in ["red", "blue", "magenta", "green", "yellow", "white"]:
            turtle.color(colors)
            turtle.circle(100)
            turtle.left(10)

turtle.hideturtle()
turtle.mainloop()