#!/usr/bin/env python3

from tkinter import *

# 在GUI中，每个Button，Label，输入框等，都是一个Widget,Frame是可以容纳其它widget的widget
class Application(Frame):
	def __init__(self, master=None):
		Frame.__init__(self, master)
		self.pack()
		self.createWidgets()

	def createWidgets(self):
		self.helloLabel = Label(self, text='Hello, world!')
		# pack() 把widget加入到父容器中，并实现布局pack()是简单布局，
		# grid() 可以实现更复杂的布局
		self.helloLabel.pack()
		self.quitButton = Button(self, text='Quit', command=self.quit)
		self.quitButton.pack()

app = Application()

app.master.title('Hello World')

app.mainloop()