#include "widget.h"
#include "ui_widget.h"
#include "signal.h"

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
//    btn1 = new QPushButton(this);
//    btn1->setText("button");
    //创建一个横向的layout
    layout1 = new QHBoxLayout;
    layout2 = new QHBoxLayout;
   // layout3 = new QVBoxLayout(this);
    layout4 = new QGridLayout(this);

    //创建一个button添加到layout1
    btn1 = new QPushButton;
    //layout1->addWidget(btn1);
    btn1->setText("OK");

    edit1 = new QLineEdit;
    //layout1->addWidget(edit1);
    edit2 = new QLineEdit;
    //layout1->addWidget(edit2);
    edit3 = new QLineEdit;
    //layout1->addWidget(edit3);

   label1 = new QLabel;
////    layout1->addWidget(label1);
//    layout2->addWidget(label1);

//    layout3->addLayout(layout1);
//    layout3->addLayout(layout2);
    connect(btn1, SIGNAL(clicked()), this, SLOT(on_clicked()));

    layout4->addWidget(btn1, 0, 0);
    layout4->addWidget(edit1, 0, 1);
    layout4->addWidget(edit2, 1, 0);
    layout4->addWidget(edit3, 1, 1);
    layout4->addWidget(label1, 2, 1);

    ui->setupUi(this);
}

Widget::~Widget()
{
    delete ui;
    //只要控件有父类；在QT内部不需要单独delete
    //QT的窗口在退出的时候，会自动删除窗口所有的子控件
}

void Widget::on_clicked()
{

    int a = edit1->text().toInt();
    int b = edit3->text().toInt();

    if(edit2->text() == "+")
        label1->setText(QString::number(a+b));
    if(edit2->text() == "-")
        label1->setText(QString::number(a-b));
    if(edit2->text() == "*")
        label1->setText(QString::number(a*b));
    if(edit2->text() == "/")
        if(b!=0)
            label1->setText(QString::number(a/b));
}

