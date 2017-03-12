package SeaBattleBot;

public class LinerSeabattleBot extends BaseSeaBattleBot 
{
    @Override
    public int[] Shoot() 
    {
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                if(CheckÑell(j,i))
                {
                    _lastShot[0]=i;
                    _lastShot[1]=j;
                    return new int[]{j,i};
                }
            }
        }
        return null;
    }
}
