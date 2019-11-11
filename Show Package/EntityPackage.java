
public class EntityPackage
{
    Package pack;


    //Database connection and queries
    Package packageDetails(int pID)
    {
        pack.get(pID);
        return pack;
    }

}
