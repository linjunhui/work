#ifndef PERSON_H
#define PERSON_H


class Person
{
public:
    int age;
    static int count;

public:
    Person();
    explicit Person(int age);
    Person(const Person &it);
    Person(const char *s, int i = 0);

    void set_age(int age);
    void set_count(int i);
};

#endif // PERSON_H
