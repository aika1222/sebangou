import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.HashMap;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package setterandgetter;

/**
 *
 * @author devit
 */
public class Setterandgetter extends JFrame implements ActionListener{
    JLabel label;
    JTextField text1;
    HashMap<String,Integer> map;
    public Setterandgetter(){
    Container ctnFoundation=getContentPane();
    JButton btn1=new JButton("push");
    text1=new JTextField("moji",10);
    JPanel p1=new JPanel();
    p1.setBackground(Color.ORANGE);
    p1.add(text1);
    p1.add(btn1);
    label=new JLabel();
    
    JPanel p2=new JPanel();
    p2.setLayout(new FlowLayout(FlowLayout.CENTER));
    p2.add(label);
    map = new HashMap<>();
    map.put("森川",61 );
    map.put("小林",41);
    map.put("福岡", 71);
    map.put("島崎", 86);
    map.put("小笠原", 4);
    map.put("加藤", 7);

   
   
    
    //        btn1=new JButton("1");
    //        btn2=new JButton("2");
    //        btn3=new JButton("3");
            //ctnFoundation.add(btn1,FlowLayout.LEFT);
btn1.addActionListener(this);
//label=new JLabel();
//ctnFoundation.add(p, FlowLayout.LEFT);
//ctnFoundation.add(btn2,FlowLayout.CENTER);
//text1 = new JTextField("moji", 10);

//ctnFoundation.add(btn3,FlowLayout.RIGHT);
getContentPane().add(p1,BorderLayout.PAGE_START);
getContentPane().add(p2,BorderLayout.PAGE_END);
                   
     // System.out.println(map.get("坂口渚沙"));
     //label.setText("get"); 
    
    }
    public void actionPerformed(ActionEvent e){
   
  String str=text1.getText();
//label.setText("get");   
//System.out.println("get");
   // if(map.containsKey("str")){
      //System.out.println("str");
      Integer i=map.get(str);
     //System.out.println(i);
label.setText(String.valueOf(i));
    //}
    }
    
public static void main(String[] args){
Setterandgetter button=new Setterandgetter();


button.setSize(300,200);
button.setTitle("Setterandgetter");
button.setVisible(true);
button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }

    /**
     * @param args the command line arguments
     */

    
}

