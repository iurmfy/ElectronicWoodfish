package com.iurmfy.woodfish;

import javax.swing.*;
import java.awt.*;

// 主要界面
public class MainPanel extends JPanel
{
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        // 绘制
        setBackground(Color.BLACK);
        Image image = new ImageIcon("src/assets/woodfish.png").getImage();

        g2.drawImage(image,
                -10 , 100,
                image.getWidth(this), image.getHeight(this),
                this);
    }
}
