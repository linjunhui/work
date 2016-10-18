#ifndef SINGLE_H
#define SINGLE_H


class single
{
private:
    static single *p;
protected:
    single();
public:
    static single *makesingle();
    static void releasesingle();
};

#endif // SINGLE_H
