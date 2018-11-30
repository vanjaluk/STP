package hr.unipu.zadace.zadatak2;

//Potrebno je modelirati klase i sučelja koje se koriste u aplikaciji za prodaju vozila (vehicle).
//        Postoje tri vrste vozila: automobil (car), kamion (truck) i motocikl (motorcycle). Svaka vrsta
//        vozila ima definiran naziv proizvođača (manufacturer), oznaku modela (model), jedinstveni
//        serijski broj šasije (id), snagu (power), broj putnika (numberOfPassangers) i cijenu
//        (regularPrice). Automobili dodatno imaju oznaku posjedovanja klimatizacije (hasAC) i broja
//        vrata (numberOfDoors). Kamioni imaju definiranu nosivost (maxWeight), a motocikli oznaku
//        tipa (type) koja mora biti jedna od sljedećih: chopper, sport, racing i off-road.
//        Za vozila je potrebno napraviti metodu public double getPrice(boolean isVIP) koja
//        za korisnike koji nisu VIP vraća regularnu (tj. definiranu) cijenu vozila, a za VIP korisnike vraća
//        regularnu cijenu umanjenu za određeni postotak ovisno o tipu vozila tako da je popust na
//        motocikle 15%, na automobile 10%, a na kamione 5%. Prilikom rješavanja zadatka po potrebi je
//        moguće dodati nove metode. Pored prodaje, vrste vozila koje se mogu iznajmljivati su automobili
//        i motocikli, a njih je potrebno modelirati sučeljem koje ima dvije metode: public void
//        addRentingPrice(double rentingPrice) i public double
//        getRentingPrice().
//        U glavnom programu je potrebno ispisati ukupnu sumu cijena iznajmljivanja svih koja se mogu
//        iznajmiti, a nalaze se u bazi podataka. Pri tome pretpostavite da postoji metoda
//        loadVehicles()koja učitava sva vozila iz baze podataka (podatke za nekoliko vozila upišite
//        sami tvrdo u kodu) i vraća ih u obliku polja ArrayList<Vehicle>.
//        Postaviti vlastite komentare uz ključne dijelove koda. Prikazati ispis. Nacrtati UML dijagram.

public class Main {
}
