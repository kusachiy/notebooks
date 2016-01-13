package commands;

import controllers.ApplicationContext;
import services.StorageService;

/**
 * Created by Хомяк on 13.01.2016.
 */
public class CommandUpdate extends AbstractCommand {

    public static final String NAME = "update";

    public CommandUpdate(String ID,String person,String phone, String address,  StorageService storage)
    {
        super(storage);
        this.ID = ID;
        this.person = person;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public void execute(ApplicationContext ap) {
        getStorage().update(this.ID,this.person,this.phone,this.address);
    }

    @Override
    public String getName() {
        return NAME;
    }

    private  String ID;
    private  String person;
    private  String phone;
    private  String address;
}
