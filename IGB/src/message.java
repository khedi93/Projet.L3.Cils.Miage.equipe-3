public class Fenetre extends JFrame{
      static JLabel label;
       
                public Fenetre(){
                 
                     
               this.setTitle("Jeu dont vous êtes le héro");
               this.setSize(690, 690);
               this.setLocationRelativeTo(null); //Au centre
               this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Se ferme
                     
                     
                Dimension dimension =new Dimension();
                dimension.height=200;
                dimension.width=200;
                Panneau pan = new Panneau();
                pan.setSize(690,690);
                JButton bouton = new JButton("Mon bouton");
                label = new JLabel();
                label.setSize(200,150);
                label.setMaximumSize(dimension);
                label.setMinimumSize(dimension);
                label.setOpaque(true);
                label.setBackground(Color.red);  
                     
               pan.add(label);     
               this.setContentPane(pan);
 
               this.setVisible(true);
               this.setResizable(false); // Empecher le redimensionnement de la fenêtre.
        }
                 
             
                 
                static Race race;
                public static void main(String[] args)
                {
                    // TODO Auto-generated method stub
                     
                    Fenetre fenetre = new Fenetre(); // On créer une fenetre
                     
                    int infoRace=1;
                    while (infoRace != 0)
                    {
                        /*label.setText("===   Information sur les races   === \n" +
                                //"Pour des informations sur l'Humain tapez 1"+
                                "Pour des informations sur l'Orc tapez 2"+
                                "Pour des informations sur l'Elfe tapez 3"+
                                "Pour passer au choix de votre race, tapez 0");*/