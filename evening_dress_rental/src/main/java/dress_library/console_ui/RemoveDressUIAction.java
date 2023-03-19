package dress_library.console_ui;


import dress_library.core.requests.RemoveDressRequest;
import dress_library.core.responses.RemoveDressResponse;
import dress_library.core.services.RemoveDressService;

import java.util.Scanner;

public class RemoveDressUIAction implements UIAction {
    private RemoveDressService removeDressService;

    public RemoveDressUIAction(RemoveDressService removeDressService) {
        this.removeDressService = removeDressService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dress id to remove: ");
        Long dressId = Long.parseLong(scanner.nextLine());
        RemoveDressRequest request = new RemoveDressRequest(dressId);
        RemoveDressResponse response = removeDressService.execute(request);
        if( response.isDressRemoved()){
            System.out.println("Your dress was removed from the list.");
        } else{
            System.out.println("Your dress was not removed from the list.");
        }
    }
}
