/*
 * SPDX-FileCopyrightText: © 2022, Eui-seong <tlsdmltjd52@gmail.com>
 * SPDX-License-Identifier: BSD-2-Clause
 * Original Code
 * https://github.com/janbodnar/Java-Pacman-Game
 * modified by : Eui-seong, LeeJaeO, Woo-Su-Han
 */

import java.awt.*;
import javax.swing.*;

public class Pacman extends JFrame {

    private String color;
    public Pacman(String c) {
        color = c;
        initUI(color);

    }

    private void initUI(String c) {
        add(new Board(c,this));
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
    }

    public void Start() {
        EventQueue.invokeLater(() -> {
            var ex = new Pacman(color);
            ex.setVisible(true);
        });
    }
}