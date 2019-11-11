/**
 * Brice Pratt & Arturo Lara
 */
package musicBox;

import javax.swing.ImageIcon;

/**
 * Creating an enum that stores each instrument, key, and Icon 
 *
 */

public enum Instruments {
	KICK("Bass Drum", 35, new ImageIcon(Instruments.class.getResource(("resources/kick.png")))),
	HIHAT("Closed Hi-Hat", 42, new ImageIcon(Instruments.class.getResource(("resources/hihat.png")))),
	SNARE("Acoustic Snare", 38, new ImageIcon(Instruments.class.getResource(("resources/snare.png")))),
	CRASH("Crash Cymbal", 49, new ImageIcon(Instruments.class.getResource(("resources/crash.png")))),
	COWBELL("Cow Bell", 56, new ImageIcon(Instruments.class.getResource(("resources/kick.png")))),
	MARACAS("Maracas", 70, new ImageIcon(Instruments.class.getResource(("resources/kick.png")))),
	HANDCLAP("Hand Clap", 39, new ImageIcon(Instruments.class.getResource(("resources/kick.png"))));

	private String name;
	private int key;
	private ImageIcon icon;
	
	private Instruments(String n, int k, ImageIcon i) {
		name = n;
		key = k;
		icon = i;
	}

	public String getName() {
		return name;
	}

	public ImageIcon getIcon() {
		return icon;
	}
	
	public int getKey(){
		return key;
	}
}
