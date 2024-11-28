package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    	JPanel nombreP = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	JLabel nombre = new JLabel("Nombre: ");
    	txtNombre = new JTextField(20);
    	//txtNombre.setPreferredSize(new Dimension(100, 20));
    	nombreP.add(nombre);
    	nombreP.add(txtNombre);
    	// Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
    	JLabel clasificacion = new JLabel("Clasificación: ");
    	cbbCalificacion = new JComboBox<String>();
    	for(int i =0; i<=5; i++) {
    		cbbCalificacion.addItem(String.valueOf(i));
    	}
    	JPanel clasP = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	clasP.add(clasificacion);
    	clasP.add(cbbCalificacion);
        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
    	JLabel visitado = new JLabel("Visitado: ");
    	cbbVisitado = new JComboBox<>(new String[] {"Sí", "No"});
    	cbbVisitado.setPreferredSize(new Dimension(40, 20));
    	JPanel visP = new JPanel( new FlowLayout(FlowLayout.LEFT));
    	visP.add(visitado);
    	visP.add(cbbVisitado);
    	add(nombreP);
    	add(clasP);
    	add(visP);
        // Agregar todos los elementos al panel
        // TODO completar

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
    	String visitado = (String) cbbVisitado.getSelectedItem();
        return visitado.equals("Sí");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
        return txtNombre.getText();
    }
}
