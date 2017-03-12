package SeaBattleBot;

import java.util.Random;

public class RandomSeabattleBot  extends BaseSeaBattleBot 
{
    final Random random = new Random();
    
    @Override
    public int[] Shoot() 
    {
        int indexer = 0;
                while(indexer<150)
                {
                    indexer++;
                    int i = random.nextInt(10);
                    int j = random.nextInt(10);

                    if(CheckÑell(j,i))
                    {
                        _lastShot[0]=i;
                        _lastShot[1]=j;
                        return new int[]{j,i};
                    }
                }
        return null;
    }    
}
