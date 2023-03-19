package dress_library.console_ui;

import dress_library.Dress;
import dress_library.core.requests.AddDressRequest;
import dress_library.core.responses.AddDressResponse;
import dress_library.core.services.AddDressService;

import java.util.Scanner;

public class AddDressUIAction implements UIAction {
    private AddDressService addDressService;

    public AddDressUIAction(AddDressService addDressService) {
        this.addDressService = addDressService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dress color: ");
        String dressColor = scanner.nextLine();
        System.out.println("Enter dress designer: ");
        String dressDesigner = scanner.nextLine();
        AddDressRequest request = new AddDressRequest(dressColor, dressDesigner);
        AddDressResponse response = addDressService.execute(request);
        System.out.println("New dress id was: " + response.getNewDress().getId());
        System.out.println("Your dress was added to list.");
    }
}
