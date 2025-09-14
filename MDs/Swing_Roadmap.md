# Roadmap um Swing zu lernen!
### Grundlagen - das Fundament
```` 
- JFrame & JDialog – Hauptfenster, Dialogfenster  
- ContentPane & RootPane – wo deine Komponenten landen  
- pack() – optimale Größe automatisch anpassen  
- setSize() – Fenstergröße manuell setzen  
- setVisible() – Fenster sichtbar machen  
- setDefaultCloseOperation() – Verhalten beim Schließen  
````
### Layout Manager
````
- FlowLayout, BorderLayout, GridLayout  
- BoxLayout, GridBagLayout (fortgeschritten)  
- Null Layout (selten, aber manchmal nötig)
````
### Swing Komponenten
````
- Grundkomponenten: JLabel, JButton, JTextField, JTextArea  
- Container: JPanel, JScrollPane, JSplitPane, JTabbedPane  
- Listen & Tabellen: JList, JTable, JTree  
- Menüs & Toolbars: JMenuBar, JMenu, JToolBar  
- Sonstiges: JSlider, JSpinner, JCheckBox, JRadioButton  
````
### Event Handling
````
- ActionListener, MouseListener, KeyListener  
- WindowListener, FocusListener  
- Weitere: ItemListener, ChangeListener, ActionEvent  
- Anonyme Klassen, Lambda-Ausdrücke (Java 8+)  
- MVC-Ansatz für komplexere GUIs  

````
### Fortgeschrittene Swing-Themen
````
- Look and Feel (System, Nimbus, FlatLaf etc.)  
- Icons, Bilder, Fonts laden  
- Drag & Drop, Clipboard  
- Custom Painting mit `paintComponent(Graphics g)`  
- Threads im GUI (SwingWorker) – wichtig für Performance  
- Internationalisierung (i18n)  
````
### Architektur & Best Practices
````
- Trennung von Logik und UI (MVC für Swing)  
- Sauberes Ressourcenmanagement (`dispose()`, Memory-Leaks vermeiden)  
- Unit Tests für UI-nahe Logik  
- Wiederverwendbare Komponenten schreiben  
```` 