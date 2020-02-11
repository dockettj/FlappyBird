package com.company;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;

public class Bird {

    public int x;
    public int y;
    public int width;
    public int height;

    public boolean dead;

    public double yvel;
    public double gravity;

    private int jumpDelay;
    private double rotation;

    private Image image;
    private Keyboard keyboard;

    public Bird() {
        x = 100;
        y = 150;
        yvel = 0;
        width = 35;
        height = 25;
        // 2-1 Change gravity between 0 and 1. (Default: 0.5)
        gravity = 0.5;
        jumpDelay = 0;
        rotation = 0.0;
        dead = false;

        keyboard = Keyboard.getInstance();
    }

    public void update() {
        yvel += gravity;

        if (jumpDelay > 0)
            jumpDelay--;
        // 2-2:     Add the next line between "))" to allow for players to jump using space.
        //           || keyboard.isDown(KeyEvent.VK_SPACE)
        if (!dead && (keyboard.isDown(KeyEvent.VK_UP)) && jumpDelay <= 0) {
            yvel = -10;
            jumpDelay = 10;
        }

        y += (int)yvel;
    }

    public Render getRender() {
        Render r = new Render();
        r.x = x;
        r.y = y;

        if (image == null) {
            // 5-1:     Change "lib/background.png" to change the background image.
            //          Options: "lib/bird.png"
            //                   "lib/brown-bird.png"
            //                   "lib/dragon.png"
            image = Util.loadImage("lib/bird.png");
        }
        r.image = image;

        rotation = (90 * (yvel + 20) / 20) - 90;
        rotation = rotation * Math.PI / 180;

        if (rotation > Math.PI / 2)
            rotation = Math.PI / 2;

        r.transform = new AffineTransform();
        r.transform.translate(x + width / 2, y + height / 2);
        r.transform.rotate(rotation);
        r.transform.translate(-width / 2, -height / 2);

        return r;
    }
}
