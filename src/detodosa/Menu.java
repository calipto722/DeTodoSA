/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detodosa;

import java.util.TreeSet;

/**
 *8
 * @author Pirrupi
 */
public class Menu extends javax.swing.JFrame {
 public static TreeSet<Producto> listaproductos= new TreeSet<>();

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        cargarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAdmin = new javax.swing.JMenu();
        jmaProducto = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        jmcRubro = new javax.swing.JMenuItem();
        jmcNombre = new javax.swing.JMenuItem();
        jmcPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 972, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jmAdmin.setText("Administracion");

        jmaProducto.setText("Productos");
        jmAdmin.add(jmaProducto);

        jMenuBar1.add(jmAdmin);

        jmConsulta.setText("Consultas");

        jmcRubro.setText("Por Rubro");
        jmConsulta.add(jmcRubro);

        jmcNombre.setText("Por Nombre");
        jmConsulta.add(jmcNombre);

        jmcPrecio.setText("Por Precio");
        jmConsulta.add(jmcPrecio);

        jMenuBar1.add(jmConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAdmin;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenuItem jmaProducto;
    private javax.swing.JMenuItem jmcNombre;
    private javax.swing.JMenuItem jmcPrecio;
    private javax.swing.JMenuItem jmcRubro;
    // End of variables declaration//GEN-END:variables
 private void cargarProductos(){
listaproductos.add(new Producto(10,"Azucar x kg",180.76,5,Categoria.COMESTIBLE));
listaproductos.add(new Producto(18,"Lavandina x lt",264.35,12,Categoria.LIMPIEZA));
listaproductos.add(new Producto(28,"Boss x 75ml", 4300, 4, Categoria.PERFUMERIA));

 }}
