package pl.szymonchowaniec.chat.model.command;

import pl.szymonchowaniec.chat.model.UserModel;

import java.util.List;
import java.util.Optional;

public class KickCommand implements Command {
    @Override
    public void parseCommand(UserModel sender, List<UserModel> userModelList, String... args) {
        String nickToKick = args[0];
        Optional<UserModel> userModel = userModelList.stream()
                .filter(s -> s.getNickname().equals(nickToKick))
                .findAny();

        if(userModel.isPresent()){
            userModel.get().sendCloseWindowPacket();
        }else{
            sender.sendMessagePacket("Taki user nie istnieje");
        }
    }

    @Override
    public int argsCount() {
        return 1;
    }

    @Override
    public String error() {
        return "Użycie komendy to: /kick tutaj_nick";
    }

}
