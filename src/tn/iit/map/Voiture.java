package tn.iit.map;

import java.util.Collections;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * 
 * @author mo5
 *
 */
// rouler une voiture

public class Voiture extends Thread {
	private JButton jb;
	private static Vector<Integer> V2 = new Vector<>(), V3 = new Vector<>();

	public Voiture(JButton jb) {
		this.jb = jb;
		V2.add(0);
		V2.add(1);
		V3.add(0);
		V3.add(1);
		V3.add(2);
	}

	public void run() {
		int i = 1;
		while (i != 0) {
			if ((jb.getX() == 0) && (jb.getY() == 0)) {// (0,0)
				avancerY(150);
			}
			if ((jb.getX() == 0) && (jb.getY() == 150)) {// (0,150)
				int k = valAleatoire(V2);
				if (k != 0) {
					avancerY(450);
				} else {
					avancerY(250);
					avancerX(150);
				}
			}
			if ((jb.getX() == 0) && (jb.getY() == 450)) {// (0,450)
				avancerX(150);
			}
			if ((jb.getX() == 150) && (jb.getY() == 450)) {// (150,450)
				int k = valAleatoire(V2);
				if (k != 0) {
					avancerX(450);
				} else {
					avancerX(250);
					reculerY(300);
				}
			}
			if ((jb.getX() == 450) && (jb.getY() == 450)) {// (450,450)
				reculerY(300);
			}
			if ((jb.getX() == 450) && (jb.getY() == 300)) {// (450,300)
				int k = valAleatoire(V2);
				if (k != 0) {
					reculerY(0);
				} else {
					reculerY(200);
					reculerX(300);
				}
			}
			if ((jb.getX() == 450) && (jb.getY() == 0)) {// (450,0)
				reculerX(300);
			}
			if ((jb.getX() == 300) && (jb.getY() == 0)) {// (300,0)
				int k = valAleatoire(V2);
				if (k != 0) {
					reculerX(0);
				} else {
					reculerX(200);
					avancerY(150);
				}
			}
			if ((jb.getX() == 200) && (jb.getY() == 150)) {// (200,150)
				int k = valAleatoire(V3);
				if (k == 0) {
					avancerY(350);
				} else if (k == 1) {
					avancerY(200);
					reculerX(100);
				} else {
					avancerY(250);
					avancerX(350);
				}
			}
			if ((jb.getX() == 300) && (jb.getY() == 200)) {// (300,200)
				int k = valAleatoire(V3);
				if (k == 0) {
					reculerX(112);
				} else if (k == 1) {
					reculerX(250);
					reculerY(105);
				} else {
					reculerX(200);
					avancerY(350);
				}
			}
			if ((jb.getX() == 250) && (jb.getY() == 300)) {// (250,300)
				int k = valAleatoire(V3);
				if (k == 0) {
					reculerY(100);
				} else if (k == 1) {
					reculerY(250);
					avancerX(350);
				} else {
					reculerY(200);
					reculerX(100);
				}
			}
			if ((jb.getX() == 150) && (jb.getY() == 250)) {// (150,250)
				int k = valAleatoire(V3);
				if (k == 0) {
					avancerX(350);
				} else if (k == 1) {
					avancerX(200);
					avancerY(350);
				} else {
					avancerX(250);
					reculerY(100);
				}
			}
			if ((jb.getX() == 250) && (jb.getY() == 100)) {// (250,100)
				int k = valAleatoire(V2);
				if (k == 0) {
					reculerY(50);
					avancerX(400);
					avancerY(150);
				} else {
					reculerY(0);
					reculerX(0);
				}
			}
			if ((jb.getX() == 400) && (jb.getY() == 150)) {// (400,150)
				int k = valAleatoire(V2);
				if (k == 0) {
					avancerY(400);
					reculerX(300);
				} else {
					avancerY(200);
					reculerX(300);
				}
			}
			if ((jb.getX() == 400) && (jb.getY() == 300)) {// (400,300)
				int k = valAleatoire(V2);
				if (k == 0) {
					reculerX(50);
					reculerY(300);
				} else {
					reculerX(250);
					reculerY(300);
				}
			}
			if ((jb.getX() == 50) && (jb.getY() == 300)) {// (50,300)
				int k = valAleatoire(V2);
				if (k == 0) {
					reculerY(250);
					avancerX(150);
				} else {
					reculerY(50);
					avancerX(150);
				}
			}
			if ((jb.getX() == 150) && (jb.getY() == 50)) {// (150,50)
				int k = valAleatoire(V2);
				if (k == 0) {
					avancerX(400);
					avancerY(150);
				} else {
					avancerX(200);
					avancerY(150);
				}
			}
			if ((jb.getX() == 350) && (jb.getY() == 250)) {// (350,250)
				int k = valAleatoire(V2);
				if (k == 0) {
					avancerX(400);
					avancerY(400);
					reculerX(300);
				} else {
					avancerX(450);
					reculerY(0);
					reculerX(300);
				}
			}
			if ((jb.getX() == 300) && (jb.getY() == 400)) {// (300,400)
				int k = valAleatoire(V2);
				if (k == 0) {
					reculerX(50);
					reculerY(300);
				} else {
					reculerX(250);
					reculerY(300);
				}
			}
			if ((jb.getX() == 200) && (jb.getY() == 350)) {// (200,350)
				int k = valAleatoire(V2);
				if (k == 0) {
					avancerY(400);
					reculerX(50);
					reculerY(300);
				} else {
					avancerY(450);
					avancerX(450);
				}
			}
			if ((jb.getX() == 100) && (jb.getY() == 200)) {// (100,200)
				int k = valAleatoire(V2);
				if (k == 0) {
					reculerX(50);
					reculerY(50);
					avancerX(150);
				} else {
					reculerX(0);
					avancerY(450);
				}
			}
		}
	}

	// donner une variable aleatoire
	public Integer valAleatoire(Vector<Integer> V) {
		Collections.shuffle(V);
		return V.get(0);
	}

	// avancer la vehicule suivant l'axe x
	public void avancerX(int j) {
		int i = 0;
		while (jb.getX() < j) {
			try {
				i++;
				jb.setBounds(jb.getX() + i, jb.getY(), jb.getWidth(), jb.getHeight());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		jb.setBounds(j, jb.getY(), jb.getWidth(), jb.getHeight());
	}

	// avancer la vehicule suivant l'axe -x
	public void reculerX(int j) {
		int i = 0;
		while (jb.getX() > j) {
			try {
				i++;
				jb.setBounds(jb.getX() - i, jb.getY(), jb.getWidth(), jb.getHeight());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		jb.setBounds(j, jb.getY(), jb.getWidth(), jb.getHeight());

	}

	// avancer la vehicule suivant l'axe y
	public void avancerY(int j) {
		int i = 0;
		while (jb.getY() < j) {
			try {
				i++;
				jb.setBounds(jb.getX(), jb.getY() + i, jb.getWidth(), jb.getHeight());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		jb.setBounds(jb.getX(), j, jb.getWidth(), jb.getHeight());

	}

	// avancer la vehicule suivant l'axe -y
	public void reculerY(int j) {
		int i = 0;
		while (jb.getY() > j) {
			try {
				i++;
				jb.setBounds(jb.getX(), jb.getY() - i, jb.getWidth(), jb.getHeight());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		jb.setBounds(jb.getX(), j, jb.getWidth(), jb.getHeight());

	}
}
