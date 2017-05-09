import java.awt.*;
import javax.swing.*;

public class Demineur extends JFrame {
	private Plateau plateau;

	Demineur() {
		super();
	}

	public void init() {
		Container cp = getContentPane();
		plateau = new Plateau();
		cp.add(p);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Démineur");
		pack();
		setResizable(false); // Empêche le redimensionnement, puisque le jeu est déformé et dénaturé si on redimensionne
		setVisible(true);
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				Demineur p = new Demineur();
				p.init();
			}
		});
	}
}