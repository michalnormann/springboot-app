package pl.normann.springbootapp;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloAppGui extends VerticalLayout {

    public HelloAppGui() {
        TextField textField = new TextField("Podaj imie:");
        Button buttonHello = new Button("Przywitaj", new Icon(VaadinIcon.HANDSHAKE));
        Label label = new Label();

        buttonHello.addClickListener(clickEvent -> {
                label.setText("Hello " + textField.getValue());
                Image image = new Image("https://media.tenor.com/images/1170597818a37a7c6e3e1d4baeb6e2eb/tenor.gif", "hello");
                add(image);
            });

        add(textField,buttonHello,label);

    }
}
