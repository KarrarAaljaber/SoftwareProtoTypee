import KontoInformasjon.Konto;
import Repo.JSONRepo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class Username {
    Konto user = new Konto();
    ArrayList<Konto> KontoList = new ArrayList<>();
    JSONRepo konto = new JSONRepo();





    @ParameterizedTest
    @ValueSource(strings = {"Yaqub","bag","Test","Gay","SSs"})
    public void testUsername(String input) {
        KontoList = konto.LoadFile2("Konto.json");
        boolean t;
        for (Konto value : KontoList) {
            user.setNavn(input);
            t = value.getNavn().equals(input);
            //System.out.println(value.getNavn() + " and " + input + " is " + t);
            if(t){

                Assert.assertEquals(value.getNavn(), user.getNavn());
                System.out.println("Username " + user.getNavn() + " exists");
                break;
            }
            else{
                Assert.assertFalse(false);
                //System.out.println("Username " + user.getNavn() + " does not exist");
                }
            }
        //System.out.println(input);

        }



        //System.out.println(input);

}

