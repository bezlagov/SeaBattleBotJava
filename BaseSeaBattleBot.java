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

    protected boolean Check—ell(int y, int x) 
    {
            return true;
	// Todo logic of check cell
    }

    
    public void UpdateBattlefieldData(int y, int x, int result)
    {
        _enenyBattlefield[y][x] = result;
        lastShotStatus = result;
    }
}
