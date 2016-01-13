package commands.builders;

import com.google.inject.Inject;
import commands.Command;
import commands.CommandAdd;
import commands.CommandRemove;
import commands.factories.ConsoleCommandsFactory;
import model.Params;
import org.apache.commons.lang3.StringUtils;
import services.StorageService;

/**
 * Created by Хомяк on 12.01.2016.
 */
public class CommandRemoveBuilder extends AbstractCommandBuilder {

    @Inject
    public CommandRemoveBuilder(StorageService storageService)
    {
        super(storageService);
    }


    @Override
    public Command createCommand(Params params)
    {
        String[] args = null;

        if (StringUtils.isNotEmpty(params.getCommandArgs()))
            args = StringUtils.split(params.getCommandArgs());

        if (args == null || args.length != 1)
            return ConsoleCommandsFactory.getInstance().createUnknownCommand(params);

        Command remove = new CommandRemove(args[0],getStorage());

        return remove;
    }
}
