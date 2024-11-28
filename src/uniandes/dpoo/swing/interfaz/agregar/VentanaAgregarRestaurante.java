package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;
import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame
{
    /**
     * El panel donde se editan los detalles del restaurante
     */
    private PanelEditarRestaurante panelDetalles;

    /**
     * El panel con los botones para agregar un restaurante o cerrar la ventana
     */
    private PanelBotonesAgregar panelBotones;

    /**
     * El panel para marcar la ubicación del restaurante
     */
    private PanelMapaAgregar panelMapa;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaPrincipal ventanaPrincipal;

    public VentanaAgregarRestaurante( VentanaPrincipal principal )
    {
        this.ventanaPrincipal = principal;
        setLayout( new BorderLayout( ) );

        // Agrega el panel donde va a estar el mapa
        // TODO completar
        panelMapa = new PanelMapaAgregar();
        this.add(panelMapa, BorderLayout.CENTER);
        // Agrega en el sur un panel para los detalles del restaurante y para los botones
        // TODO completar
        JPanel pequenoDos = new JPanel(new BorderLayout());
        this.add(pequenoDos, BorderLayout.SOUTH);
        panelDetalles = new PanelEditarRestaurante();
        pequenoDos.add(panelDetalles, BorderLayout.CENTER);
        panelBotones = new PanelBotonesAgregar(this);
        pequenoDos.add(panelBotones, BorderLayout.SOUTH);
        // Termina de configurar la ventana
        pack( );
        this.setLocationRelativeTo( null );
        this.setSize(400, 600);
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setResizable( false );
    }

    /**
     * Le pide al panelDetalles los datos del nuevo restaurante y se los envía a la ventana principal para que cree el nuevo restaurante, y luego cierra la ventana.
     */
    public void agregarRestaurante( )
    {
        String nombre = panelDetalles.getNombre();
        boolean visitado = panelDetalles.getVisitado();
        int calif = panelDetalles.getCalificacion();
        int[] coord = panelMapa.getCoordenadas();
        Restaurante newRes = new Restaurante(nombre, calif, coord[0], coord[1], visitado);
        ventanaPrincipal.agregarRestaurante(nombre, calif, coord[0], coord[1], visitado);
        return ;
    }

    /**
     * Cierra la ventana sin crear un nuevo restaurante
     */
    public void cerrarVentana( )
    {
        dispose( );
    }

}
