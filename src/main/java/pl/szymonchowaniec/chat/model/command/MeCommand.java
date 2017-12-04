package pl.szymonchowaniec.chat.model.command;

import pl.szymonchowaniec.chat.model.UserModel;

import java.util.List;

public class MeCommand implements Command {
    @Override
    public void parseCommand(UserModel model, List<UserModel> userList, String... args) {
        model.sendDialogPacket("~ Liczba prywatnych wiadomości: " + model.getSentPrivate());
        model.sendDialogPacket("~ Liczba globalnych wiadomości: " + model.getSentGlobal());
    }

    @Override
    public int argsCount() {
        return 0;
    }

    @Override
    public String error() {
        return "/me ";
    }
}
