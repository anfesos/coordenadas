package org.example.coordenadas;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VentanaPrincipal extends Frame {

    private Label lPosicionX;
    private Label lPosicionY;
    private TextField tPosicionX;
    private TextField tPosicionY;
    private Button bIniciar;

    public VentanaPrincipal() {
        super("Obtener coordenadas");

        setLayout(new FlowLayout());

        lPosicionX = new Label("X: ");
        lPosicionY = new Label("Y: ");
        tPosicionX = new TextField(3);
        tPosicionY = new TextField(3);
        bIniciar = new Button("Iniciar");

        add(lPosicionX);
        add(tPosicionX);
        add(lPosicionY);
        add(tPosicionY);
        add(bIniciar);

        addWindowListener(new EscucharVentana());

        bIniciar.addKeyListener(new EscucharTecla());

        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
    }

    private class EscucharVentana implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
            System.exit(0);
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
    }

    private class EscucharTecla implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

            if(e.getKeyCode() == 0x11 ){
                PointerInfo puntero = MouseInfo.getPointerInfo();
                Point punto = puntero.getLocation();

                tPosicionX.setText(Integer.toString(punto.x));
                tPosicionY.setText(Integer.toString(punto.y));
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
