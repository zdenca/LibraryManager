package cz.librarymanager.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class LibraryManager {


    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Library Manager");
//        GridLayout grid= new GridLayout();
//        grid.numColumns = 2;
        shell.setLayout(new FillLayout());

//      create Menu
        Menu menu = new Menu(shell, SWT.BAR);

        MenuItem file = new MenuItem(menu, SWT.CASCADE);
        file.setText("File");

        Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
        file.setMenu(fileMenu);

        MenuItem open = new MenuItem(fileMenu, SWT.PUSH);
        open.setText("Open");

        MenuItem exit = new MenuItem(fileMenu, SWT.PUSH);
        exit.setText("Exit");

//      create SashForm
        SashForm sashForm = new SashForm(shell, SWT.HORIZONTAL);

//      create Table
        Table table = new Table(sashForm, SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION);
        table.setLinesVisible(true);
        table.setHeaderVisible(true);
//        GridData dataTab = new GridData(GridData.FILL_HORIZONTAL);
        GridData data = new GridData(SWT.FILL, SWT.CENTER, true, true);
        table.setLayoutData(data);


        String[] titles = {"Book", "Author", "Status"};
        for (int i = 0; i <titles.length; i++) {
            TableColumn column = new TableColumn(table, SWT.CENTER);
            column.setText(titles[i]);
            table.getColumn(i).pack();
            column.setWidth(100);
        }
        for (int i = 0; i <= 20; i++) {
            TableItem tableItem = new TableItem(table, SWT.NONE);
            tableItem.setText(0, "Book " + i);
            tableItem.setText(1, "Author " + i);
            tableItem.setText(2, String.valueOf(i));
        }
        Button b = new Button(sashForm, SWT.PUSH);
        sashForm.pack();
        shell.setMenuBar(menu);
        shell.pack();
        shell.open();

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
}
