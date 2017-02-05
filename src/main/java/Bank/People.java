package Bank;

/**
 * Created by Temir on 05.02.2017.
 */
public abstract class People {
    private int sin;
    private byte age;
    private String sex;
    protected enum FamilyStatus{SINGLE, MARRIED, DIVORCED};   //Может вдиять на Solvency;
    protected FamilyStatus value;
}
