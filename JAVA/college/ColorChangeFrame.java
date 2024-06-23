import java.awt.*;
import java.awt.event.*; 
public class ColorChangeFrame extends Frame implements ItemListener { 
CheckboxGroup colorGroup; 
public ColorChangeFrame() { 
setLayout(new FlowLayout()); 
colorGroup = new CheckboxGroup(); 
Checkbox red = new Checkbox("Red", colorGroup, false); 
Checkbox green = new Checkbox("Green", colorGroup, false); 
Checkbox blue = new Checkbox("Blue", colorGroup, false); 
red.addItemListener(this); 
green.addItemListener(this); 
blue.addItemListener(this); 
add(red); 
add(green); 
add(blue); 
setSize(300, 200); 
setVisible(true); } 
public void itemStateChanged(ItemEvent e) { 
Color color = null; 
if (e.getSource() instanceof Checkbox) { 
Checkbox selected = (Checkbox) e.getSource(); 
switch (selected.getLabel()) { 
case "Red": 
color = Color.RED; 
break; 
case "Green": 
color = Color.GREEN; 
break; 
case "Blue": 
color = Color.BLUE;
break; 
}
if (color != null) { 
setBackground(color); 
} } } 
public static void main(String[] args) { 
new ColorChangeFrame(); } } 