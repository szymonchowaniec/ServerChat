package pl.szymonchowaniec.chat.model.command;

import pl.szymonchowaniec.chat.model.UserModel;

import java.util.List;

public interface Command {
    void parseCommand(UserModel model, List<UserModel> userList, String ... args);
    int argsCount();
    String error();
}
