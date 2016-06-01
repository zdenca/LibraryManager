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
//       GridLayout grid= new GridLayout();
//       grid.numColumns = 2;
        shell.setLayout(new FillLayout());

//      create Menu
        Menu menu = new Menu(shell, SWT.BAR);

//      create File Menu
        MenuItem file = new MenuItem(menu, SWT.CASCADE);
        file.setText("File");

        Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
        file.setMenu(fileMenu);


        MenuItem newFile = new MenuItem(fileMenu, SWT.PUSH);
        newFile.setText("New");

        MenuItem open = new MenuItem(fileMenu, SWT.PUSH);
        open.setText("Open");

        MenuItem imp = new MenuItem(fileMenu, SWT.PUSH);
        imp.setText("Import data ...");

        MenuItem exit = new MenuItem(fileMenu, SWT.PUSH);
        exit.setText("Exit");

//      create an Edit Menu
        MenuItem edit = new MenuItem(menu, SWT.CASCADE);
        edit.setText("Edit");

        Menu editMenu = new Menu(shell, SWT.DROP_DOWN);
        edit.setMenu(editMenu);

        MenuItem cut = new MenuItem(editMenu, SWT.PUSH);
        cut.setText("Cut");

        MenuItem copy = new MenuItem(editMenu, SWT.PUSH);
        copy.setText("Copy");

        MenuItem paste = new MenuItem(editMenu, SWT.PUSH);
        paste.setText("Paste");

        MenuItem delete = new MenuItem(editMenu, SWT.PUSH);
        delete.setText("Delete");

//      create a Help Menu
        MenuItem help = new MenuItem(menu, SWT.CASCADE);
        help.setText("Help");

        Menu helpMenu = new Menu(shell, SWT.DROP_DOWN);
        help.setMenu(helpMenu);

        MenuItem helpList = new MenuItem(helpMenu, SWT.PUSH);
        helpList.setText("Help list");

//      create a SashForm
        SashForm sashForm = new SashForm(shell, SWT.HORIZONTAL);

//      create a Table
        Table table = new Table(sashForm, SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION);
        table.setLinesVisible(true);
        table.setHeaderVisible(true);
//        GridData dataTab = new GridData(GridData.FILL_HORIZONTAL);
        GridData data = new GridData(SWT.FILL, SWT.CENTER, true, true);
        table.setLayoutData(data);


        String[] titles = {"Book", "Author", "Status"};
        for (int i = 0; i < titles.length; i++) {
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

//       create a Popup Menu
        Menu popupMenu = new Menu(table);
        MenuItem addItem = new MenuItem(popupMenu, SWT.NONE);
        addItem.setText("New");
        MenuItem removeItem = new MenuItem(popupMenu, SWT.NONE);
        removeItem.setText("Remove");
        MenuItem editItem = new MenuItem(popupMenu, SWT.NONE);
        editItem.setText("Edit");
        MenuItem deleteItem = new MenuItem(popupMenu, SWT.NONE);
        deleteItem.setText("Delete");


        table.setMenu(popupMenu);
//      create a Composite
        Composite composite = new Composite(sashForm, SWT.BORDER);
        composite.setLayout(new GridLayout(2, false));

//      create a Label
        Label label1 = new Label(composite, SWT.BORDER | SWT.FILL);
        label1.setText("Name:    ");

        GridData gridData = new GridData(GridData.END, GridData.CENTER, false, false);
        composite.setLayoutData(gridData);

        Text text1 = new Text(composite, SWT.BORDER | SWT.FILL_WINDING);
        text1.setText("Nebojte se nepracovat");

        Label label2 = new Label(composite, SWT.BORDER | SWT.LEFT);
        label2.setText("Author:  ");

        Text text2 = new Text(composite, SWT.BORDER | SWT.FILL);
        text2.setText("Ernie J. Zelinsky");

        Label label3 = new Label(composite, SWT.BORDER | SWT.FILL);
        label3.setText("Status:    ");

        Text text3 = new Text(composite, SWT.BORDER | SWT.FILL);
        text3.setText("Borrowed");



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
