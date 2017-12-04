package pl.szymonchowaniec.chat.model.command;

import pl.szymonchowaniec.chat.model.UserModel;

import java.util.List;

public class UserCommand implements  Command {
    @Override
    public void parseCommand(UserModel model, List<UserModel> userList, String... args) {
        userList.forEach(s -> model.sendMessagePacket("~ " + s.getNickname()));
    }

    @Override
    public int argsCount() {
        return 0;
    }

    @Override
    public String error() {
        return "/user";
    }
}
