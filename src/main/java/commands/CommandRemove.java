package commands;

import controllers.ApplicationContext;
import services.StorageService;

/**
 * Created by Хомяк on 11.01.2016.
 */
public class CommandRemove extends AbstractCommand {

    public static final String NAME = "remove";

    public CommandRemove(String recordNumber, StorageService storage)
    {
        super(storage);
        this.recordNumber = recordNumber;
    }
    @Override
    public void execute(ApplicationContext ap) {
        getStorage().remove(recordNumber);
    }

    @Override
    public String getName() {
        return NAME;
    }

    String recordNumber;
}
