#!/usr/bin/env python3

class Student(object):
	def __init__(self, name, score):
		self.name = name;
		self.score = score;

	def print_score(self):
		print('%s: %s' % (self.name, self.score))

	def get_grade(self):
		if self.score >= 90:
			return 'A'
		elif self.score >= 60:
			return 'B'
		else:
			return 'C'

lisa = Student("lisa Jons", 87)
lisa.print_score()
lisa.name = 'lisa Papa'
lisa.score = 100
lisa.print_score()

print(lisa.get_grade())