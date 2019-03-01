package com.fxb.patterns.command;

import com.fxb.patterns.command.example.Command;
import com.fxb.patterns.command.example.DrawCanvas;
import com.fxb.patterns.command.example.DrawCommand;
import com.fxb.patterns.command.example.MacroCommand;

import javax.swing.*;
import java.awt.event.*;

public class TestCommand extends JFrame implements ActionListener,MouseMotionListener,WindowListener {

    private MacroCommand history = new MacroCommand() ;

    private JButton btnClear = new JButton("清除");
    private JButton btnRePaint = new JButton("重现");

    private DrawCanvas canvas = new DrawCanvas(400,400,history);

    public TestCommand(String title){
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        btnClear.addActionListener(this);
        btnRePaint.addActionListener(this);

        Box btnBox=new Box(BoxLayout.X_AXIS);
        btnBox.add(btnClear);
        btnBox.add(btnRePaint);

        Box mainBox=new Box(BoxLayout.Y_AXIS);
        mainBox.add(btnBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        show();
    }

    public static void main(String[] args) {

        new TestCommand("命令模式");

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnClear){
            history.clear();
            canvas.repaint();
        }else if(e.getSource()==btnRePaint){
            canvas.repaint();
        }
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas,e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }




    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
