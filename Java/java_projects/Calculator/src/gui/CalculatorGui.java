package gui;
import constants.CommonConstants;
import java.awt.Font;
import javax.swing.*;

public class CalculatorGui extends JFrame {
    private final SpringLayout springLayout = new SpringLayout();

  public CalculatorGui() {
        super(CommonConstants.APP_NAME);
        setSize(CommonConstants.APP_SIZE[0], CommonConstants.APP_SIZE[1]);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(springLayout);

        addGuiComponents();
    }

    public void addGuiComponents(){
        // add display componenets
        addDisplayFieldComponenets();

        //add button compoenents
        addButtonComponenets();
    }

    public void addDisplayFieldComponenets(){
        JPanel displayFieldPanel = new JPanel();
        displayField = new JTextField(CommonConstants.TEXTFIELD_LENGTH);
        displayField.setFont(new Font("Dialog", Font.PLAIN, CommonConstants.TEXTFIELD_FONTSIZE));
        displayField.setEditable(false);
        displayField.setText("0");
        displayField.setHorizontalAlignement(SwingConstants.RIGHT);

        displayFieldPanel.add(displayField);

        this.getContentPane().add(displayFieldPanel);
        springLayout.putConstraint(SpringLayout.NORTH, displayFieldPanel, CommonConstants);


    }

    public void addButtonComponenets(){

    }

}
