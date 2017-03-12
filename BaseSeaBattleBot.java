package SeaBattleBot;

public class BaseSeaBattleBot implements ISeaBattleBot
{
    protected int[][] _enenyBattlefield;
    protected int[] _lastShot;
    protected int lastShotStatus;
    
    protected BaseSeaBattleBot()
    {
        _enenyBattlefield = new int[10][10];
        _lastShot = new int[2];
    }
    
    @Override
    public int[] Shoot() 
    {
        return null;
    }

    protected boolean CheckSell(int y, int x) 
    {
        if(_enenyBattlefield[x][y]==0)
        {
            return true;
        }
        return false;
    }

    
    public void UpdateBattlefieldData(int y, int x, int result)
    {
        _enenyBattlefield[x][y] = result;
        lastShotStatus = result;
    }
}
