package dress_library.console_ui;

import dress_library.core.requests.GetAllDressesRequest;
import dress_library.core.responses.GetAllDressesResponse;
import dress_library.core.services.GetAllDressesService;

public class GetAllDressesUIAction implements UIAction {
    private GetAllDressesService getAllDressesService;

    public GetAllDressesUIAction(GetAllDressesService getAllDressesService) {
        this.getAllDressesService = getAllDressesService;
    }

    @Override
    public void execute() {
        System.out.println("Dress list: ");
        GetAllDressesRequest request = new GetAllDressesRequest();
        GetAllDressesResponse response = getAllDressesService.execute(request);
        response.getDresses().forEach(System.out::println);
        System.out.println("Dress list end.");
    }
}


