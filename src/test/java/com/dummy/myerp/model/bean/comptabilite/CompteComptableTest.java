package com.dummy.myerp.model.bean.comptabilite;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CompteComptableTest {

@Test
public void CompteComptable() {
CompteComptable pList;
CompteComptable pList2;
pList = new CompteComptable(1,"test");
pList2 = new CompteComptable(2,"test");
List<CompteComptable> plists = new ArrayList<CompteComptable>();
plists.add(pList);
plists.add(pList2);
Assert.assertEquals(pList.toString(), pList, CompteComptable.getByNumero(plists, 1));
}
}
