package com.iurmfy.woodfish;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WoodListener implements MouseListener
{
    @Override
    public void mouseClicked(MouseEvent e)
    {
        UserData.gongde++;
        MainFrame.setLabelText("功德:" + UserData.gongde);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
