import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Snowman extends JFrame {
    public Snowman() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        GUIsnowman app = new GUIsnowman();
        app.setVisible(true);
    }
    public static void main(String arg[]) {
        new Snowman();
    }
}

class GUIsnowman extends JFrame {
    public GUIsnowman() {
        super("Snowman");
        this.setBounds(30, 30, 600, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        Body figure1 = new Body();
        BodyCentre figure2 = new BodyCentre();
        Circles figure3 = new Circles();
        LeftHand figure4 = new LeftHand();
        RightHand figure5 = new RightHand();
        BodyHead figure6 = new BodyHead();
        Nose figure7 = new Nose();
        figure1.setBounds(30, 30, 600, 700);
        figure2.setBounds(30, 30, 600, 700);
        figure3.setBounds(30, 30, 600, 700);
        figure4.setBounds(30, 30, 600, 700);
        figure5.setBounds(30, 30, 600, 700);
        figure6.setBounds(30, 30, 600, 700);
        figure7.setBounds(30, 30, 600, 700);
        lp.add(figure1, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure2, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure3, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure4, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure5, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure6, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure7, JLayeredPane.DEFAULT_LAYER);
        setVisible(true);
    }
}
class Body extends JComponent {
    private Color color;
    private int x;
    private int y;
    Body() {
        this.color = Color.black;
        this.x = 230;
        this.y = 100;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawArc(x-30, y+65, 150, 30, 125, 290);
        g2d.drawRoundRect(x,y,90,70,15,15);
        g2d.drawArc(x-85, y+280, 260, 230, 125, 290);
        g2d.drawLine(x+1,y+45,x+89,y+45);
    }
}
class BodyHead extends JComponent {
    private Color color;
    private int x;
    private int y;
    BodyHead() {
        this.color = Color.black;
        this.x = 230;
        this.y = 100;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BufferedImage bi = new BufferedImage(getSize().width, getSize().height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D big = bi.createGraphics();
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.DST_OUT, 1.0f);
        big.setColor(color);
        big.setStroke(new BasicStroke(4f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        big.drawArc(x-20, y+77, 130, 110, 134, 272);
        big.setColor(color);
        big.setStroke(new BasicStroke(4f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        big.setComposite(ac);
        big.fillPolygon(new int[]{285+10, 285+80, 285+13},
                new int[]{225+10, 225+10, 225+25},
                3);
        g2d.drawImage(bi, null, 0, 0);
    }
}
class BodyCentre extends JComponent {
    private Color color;
    private int x;
    private int y;
    BodyCentre() {
        this.color = Color.black;
        this.x = 230;
        this.y = 100;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BufferedImage bi = new BufferedImage(getSize().width, getSize().height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D big = bi.createGraphics();
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.DST_OUT, 1.0f);
        big.setColor(color);
        big.setStroke(new BasicStroke(4f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        big.drawArc(x-55, y+158, 200, 170, 119, 302);
        big.setColor(color);
        big.setStroke(new BasicStroke(4f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        big.setComposite(ac);
        big.fillPolygon(new int[]{x-33, x-149, x-167, x-174, x-160, x-195, x-197, x-162, x-181, x-175, x-150, x-36},
                new int[]{y+220, y+188, y+160, y+165, y+188, y+184, y+194, y+199, y+217, y+223, y+202, y+232},
                12);
        g2d.drawImage(bi, null, 0, 0);
    }
}
class Circles extends JComponent {
    private Color color;
    private int x;
    private int y;
    Circles() {
        this.color = Color.black;
        this.x = 230;
        this.y = 100;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawOval(x+40,y+115,13,13);
        g2d.drawOval(x+75,y+115,13,13);
        g2d.drawOval(x+35,y+155,10,10);
        g2d.drawOval(x+50,y+160,10,10);
        g2d.drawOval(x+65,y+160,10,10);
        g2d.drawOval(x+80,y+155,10,10);
        g2d.drawOval(x+58,y+220,10,10);
        g2d.drawOval(x+58,y+245,10,10);
        g2d.drawOval(x+58,y+270,10,10);
    }
}
class LeftHand extends JComponent {
    private Color color;
    private int x;
    private int y;
    LeftHand() {
        this.color = Color.black;
        this.x = 230;
        this.y = 100;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(4f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawPolygon(new int[]{x-33, x-149, x-167, x-174, x-160, x-195, x-197, x-162, x-181, x-175, x-150, x-36},
                        new int[]{y+220, y+188, y+160, y+165, y+188, y+184, y+194, y+199, y+217, y+223, y+202, y+232},
                    12);
    }
}
class RightHand extends JComponent {
    private Color color;
    private int x;
    private int y;
    RightHand() {
        this.color = Color.black;
        this.x = 335;
        this.y = 100;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BufferedImage bi = new BufferedImage(getSize().width, getSize().height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D big = bi.createGraphics();
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.DST_OUT, 1.0f);
        big.setColor(color);
        big.setStroke(new BasicStroke(4f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        big.drawPolygon(new int[]{x+33, x+149, x+167, x+174, x+160, x+195, x+197, x+162, x+181, x+175, x+150, x+36},
                new int[]{y+220, y+188, y+160, y+165, y+188, y+184, y+194, y+199, y+217, y+223, y+202, y+232},
                12);
        big.setColor(color);
        big.setStroke(new BasicStroke(4f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        big.setComposite(ac);
        big.fillOval(230-55, 100+158, 200, 170);
        g2d.drawImage(bi, null, 0, 0);
    }
}
class Nose extends JComponent {
    private Color color;
    private int x;
    private int y;
    Nose() {
        this.color = Color.black;
        this.x = 285;
        this.y = 225;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawPolygon(new int[]{x+10, x+80, x+13},
                        new int[]{y+10, y+10, y+25},
                    3);
    }
}