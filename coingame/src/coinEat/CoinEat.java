package coinEat;

import java.awt.*;
import java.awt.event.*;

import java.io.*;

import javax.sound.sampled.*;

import javax.swing.*;

public class CoinEat extends JFrame {
	private Image bufferImage;
	private Graphics screenGraphic;
	

	private Image backgroundImage = new ImageIcon("src/images/back.jpg").getImage();
	private Image player = new ImageIcon("src/images/player.png").getImage();
	private Image coin = new ImageIcon("src/images/coin.png").getImage();

	private Clip clip;
	
	
	private int playerX, playerY;
	private int playerWidth = player.getWidth(null);
	private int playerHeight = player.getHeight(null);

	private int coinX, coinY;
	private int coinWidth = coin.getWidth(null);
	private int coinHeight = coin.getHeight(null);

	private int score;

	private boolean up, down, left, right;

	public CoinEat() {
		setTitle("동전 먹기 게임");
		setVisible(true);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					up = true;
					break;
				case KeyEvent.VK_DOWN:
					down = true;
					break;
				case KeyEvent.VK_LEFT:
					left = true;
					break;
				case KeyEvent.VK_RIGHT:
					right = true;
					break;
				}
			}

			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					up = false;
					break;
				case KeyEvent.VK_DOWN:
					down = false;
					break;
				case KeyEvent.VK_LEFT:
					left = false;
					break;
				case KeyEvent.VK_RIGHT:
					right = false;
					break;
				}
			}
		});

		Init();
		while (true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			keyProcess();
			crashCheck();
		}

	}

	public void Init() {
		score = 0;

		playerX = (500 - playerWidth) / 2;
		playerY = (500 - playerHeight) / 2;

		coinX = (int) (Math.random() * (501 - playerWidth));
		coinY = (int) (Math.random() * (501 - playerHeight - 30)) + 30;
	
		playSound("src/audio/backdog.wav", true);
	
	}

	public void playSound(String pathName, boolean isLoop) {
		try {
			clip = AudioSystem.getClip();
			File audioFile = new File(pathName);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip.open(audioStream);
			clip.start();
			if(isLoop) {
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void keyProcess() {
		if (up && playerY - 5 > 30)
			playerY -= 5;
		if (down && playerY + playerHeight + 5 < 500)
			playerY += 5;
		if (left && playerX - 5 > 0)
			playerX -= 5;
		if (right && playerX + playerWidth + 5 < 500)
			playerX += 5;
	}

	public void crashCheck() {
		if(playerX+playerWidth > coinX && coinX + coinWidth > playerX && playerY + playerHeight > coinY &&coinY + coinHeight>playerY) {
			score+=100;
			playSound("src/audio/DogToy.wav",false);
			coinX = (int) (Math.random() * (501 - playerWidth));
			coinY = (int) (Math.random() * (501 - playerHeight - 30)) + 30;
		}
	}
	
	
	public void paint(Graphics g) {
		bufferImage = createImage(500,500);
		screenGraphic = bufferImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(bufferImage, 0, 0,null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
		g.drawImage(coin, coinX, coinY, null);
		g.drawImage(player, playerX, playerY, null);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString("SCORE : " + score, 40, 80);
		this.repaint();
	}

	public static void main(String[] args) {
		new CoinEat();

	}

}
