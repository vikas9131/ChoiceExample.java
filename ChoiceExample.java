import java.awt.event.*;
class ChoiceExample
{
ChoiceExample()
{
Frame f=new Frame();
final Label l=new Label();
l.setAlignment(Label.CENTER);
l.setSize(400,100);
Button b=new Button("show");
b.setBounds(200,100,75,75);
Choice c=new Choice();
c.setBounds(100,100,75,75);
c.add("java");
c.add("c++");
c.add("c");
c.add("phython");
c.add("Android");
f.add(c);
f.add(l);
f.add(b);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String data="Programming Language Selected :"+c.getItem(c.getSelectedIndex());
l.setText(data);
}
}
);
f.setSize(600,600);
f.setVisible(true);
f.setLayout(null);

}
public static void main(String []args)
{
ChoiceExample c1=new ChoiceExample();
}
}
