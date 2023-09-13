import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame {
    private Label nameLabel;
    private TextField nameTextField;
    private Label emailLabel;
    private TextField emailTextField;
    private Label mobileLabel;
    private TextField mobileTextField;
    private Label addressLabel;
    private TextArea addressTextArea;
    private Button submitButton;

    public RegistrationForm() {
        // set the layout for the frame
        setLayout(new GridLayout(5, 2));

        // initialize the controls
        nameLabel = new Label("Name:");
        nameTextField = new TextField();
        emailLabel = new Label("Email:");
        emailTextField = new TextField();
        mobileLabel = new Label("Mobile:");
        mobileTextField = new TextField();
        addressLabel = new Label("Address:");
        addressTextArea = new TextArea();
        submitButton = new Button("Submit");

        // add the controls to the frame
        add(nameLabel);
        add(nameTextField);
        add(emailLabel);
        add(emailTextField);
        add(mobileLabel);
        add(mobileTextField);
        add(addressLabel);
        add(addressTextArea);
        add(submitButton);

        // add an action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // perform validation and submit data to server
                System.out.println("Submitting data...");
            }
        });

        // set the properties for the frame
        setTitle("Registration Form");
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        // create a new instance of the registration form
        new RegistrationForm();
    }
}
