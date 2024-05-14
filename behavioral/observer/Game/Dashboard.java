package behavioral.observer.Game;

public class Dashboard implements PlayerDataListener{
    PlayerData data;

    public Dashboard(PlayerData data)
    {
        this.data = data;
        this.data.addListener(this);
    }
    @Override
    public void listen(PlayerData data) {

    }

}
