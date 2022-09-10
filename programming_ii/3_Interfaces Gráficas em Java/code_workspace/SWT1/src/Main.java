import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dsilva
 */
public class Main {
    public static void main(String[] args) {
	Display display = new Display();
	Shell shell = new Shell(display);
	shell.setText("Alo mundo");
	shell.open();
	while(!shell.isDisposed())
		if(!display.readAndDispatch())
		display.sleep();
	display.dispose();
	}
}
