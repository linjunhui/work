#ifndef WIDGET_H
#define WIDGET_H

#include <QWidget>
#include <QPushButton>
#include <QHBoxLayout>
#include <QLineEdit>
#include <QLabel>
#include <QVBoxLayout>
#include <QGridLayout>

namespace Ui {
class Widget;
}

class Widget : public QWidget
{
    //QT定义的宏，主要用于槽关联
    Q_OBJECT

public:
    explicit Widget(QWidget *parent = 0);
    ~Widget();

private:
    Ui::Widget *ui;
    QPushButton *btn1;
    QHBoxLayout *layout1, *layout2;
    QVBoxLayout *layout3;
    QLineEdit *edit1;
    QLineEdit *edit2;
    QLineEdit *edit3;
    QLabel *label1;

    QGridLayout *layout4;

private slots:
    void on_clicked(void);
};

#endif // WIDGET_H
