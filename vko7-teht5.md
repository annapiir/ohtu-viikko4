## [Ohjelmistoarkkitehtuurin sisällyttäminen ketteriin ohjelmistotuotantomenetelmiin](https://www.cs.helsinki.fi/u/mluukkai/ohtu/huomo-kandi.pdf)

Ketterät ohjelmistokehitysmenetelmät ja vahva arkkitehtuurisuunnittelu nähdään usein keskenään ristiriitaisina. Ketterät menetelmät luottavat siihen, että sopiva arkkitehtuuri kyllä rakentuu prosessin yhteydessä. Kritiikkiä on kuitenkin annettu tätä näkemystä kohtaan. Ketterät menetelmät nojaavat paljon refaktorointiin ja koko järjestelmän refaktorointi ei ole resurssikäytön kannalta mielekäs toimi. Toisaalta ei-toiminnalliset vaatimukset ohjaavat monesti arkkitethuurisuunnittelua, ja ketterissä menetelmissä nämä jäävät yleensä varjoon asiakkaalle lisäarvoa tuottavien toimien jyrätessä yli.

Kandintyössä käydään läpi vaihtoehtoja arkkitehtuurisuunnittelun huomioimiseksi ketterässä kehityksessä. Nollasprintissä varataan kehitysprojektin ensimmäinen sprintti ympäristön pysyttämiselle, suunnittelulle ja muille valmisteleville töille. Tämä on suosittu tapa, mutta ketteryyden perusajatuksen vastainen. 

Ohjelmistoarkkitehtuuri voidaan myös suunnitella omassa prosessissaan arkkitehtiryhmän työnä etupainotteisesti varsinaiseen kehitystyöhön nähden mutta kuitenkin sen kanssa rinnakkain. Arkkitehtuurivalinnat todennetaan oikeiksi prototyypein ja koodiesimerkein. 

Suunnittelupiikit ovat ketterän kehityksen aikana suoritettavia työjaksoja, joiden aikana ratkotaan järjestelmän rakenteeseen ja sen muutokseen liittyviä ongelmia.

Arkkitehtuurijaksot ovat iteraatioita, joiden aikana kehitystiimi toteuttaa arkkitehtuuriin liittyviä tehtäviä. Sitä voi ajatella laajennettuna suunnittelupiikkinä. Ongelmana on vähäinen asiakkaalle tuotettu arvo, samoin kuin nollasprintissä.

Arkkitehtuuritarinat ovat käyttäjätarinan tyyppisiä, mutta liittyvät arkkitehtuuriin. Ne pisteytetään ja priorisoidaan muiden käyttäjätarinoiden tyyliin. Kehitysprojektissa voidaan esimerkiksi sopia, että tietty määrä iteraation työajasta käytetään arkkitehtuuritarinoihin.
