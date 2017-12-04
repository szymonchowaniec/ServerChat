package pl.szymonchowaniec.chat.model.command;

import pl.szymonchowaniec.chat.model.UserModel;

import java.util.List;
import java.util.Map;

public class HelpCommand implements Command{
    @Override
    public void parseCommand(UserModel model, List<UserModel> userList, String... args) {
        model.sendMessagePacket("Lista komend: ");
        for (Map.Entry<String, Command> stringCommandEntry : CommandFactory.getCommandMap().entrySet()) {
            model.sendMessagePacket("~ " + stringCommandEntry.getKey() + " - " + stringCommandEntry.getValue().error());
        }
    }

    @Override
    public int argsCount() {
        return 0;
    }

    @Override
    public String error() {
        return "/help";
    }
}
