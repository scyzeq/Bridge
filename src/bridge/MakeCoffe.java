/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author AJuda
 */
public abstract class MakeCoffe {
    protected CoffeInterface conffeIntefrace;
    protected CoffeType coffeType;
    protected String suggar;
    
    public MakeCoffe(CoffeType coffeType, CoffeInterface conffeIntefrace
            , String suggar)
    {
        this.coffeType = coffeType;
        this.conffeIntefrace = conffeIntefrace;
        this.suggar = suggar;
    }

    public void setCoffeType(CoffeType coffeType) {
        this.coffeType = coffeType;
    }

    public void setSuggar(String suggar) {
        this.suggar = suggar;
    }

    public CoffeType getCoffeType() {
        return coffeType;
    }
    
    public String show()
    {
        return coffeType + " " + suggar;
    }
    
    public abstract void make();
}
