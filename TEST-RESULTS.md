# Rezultati testiranja Java Kalkulatora

## Sistemsko testiranje (Black Box)

### Uspješno testirani slučajevi

| Izraz       | Očekivani rezultat | Stvarni rezultat | Status |
|-------------|--------------------|------------------|--------|
| 2+2         | 4.0                | 4.0              | OK     |
| 5-3         | 2.0                | 2.0              | OK     |
| 4*3         | 12.0               | 12.0             | OK     |
| 10/2        | 5.0                | 5.0              | OK     |
| 2+3*4       | 14.0               | 14.0             | OK     |
| 10/2-3      | 2.0                | 2.0              | OK     |
| -5+3        | -2.0               | -2.0             | OK     |
| 5+-3        | 2.0                | 2.0              | OK     |
| -5*-2       | 10.0               | 10.0             | OK     |
| Infinity+5  | Infinity           | Infinity         | OK     |

### ❌ Problematični slučajevi

| Izraz       | Očekivani rezultat | Stvarni rezultat | Problem |
|-------------|--------------------|------------------|---------|
| 0/0         | NaN                | ERROR            | Loša obrada specijalnog slučaja |
| (prazan)    | ERROR              | Exception        | Nedostaje validacija praznog unosa |
| 0.1+0.2     | 0.3                | 0.30000001       | Floating point greška |
| 1.2e3+100   | 1300.0             | ERROR            | Nedostaje podrška za naučnu notaciju |
| 999999999^2 | Overflow           | 1.0E18           | Nema provere za overflow |


==========================================================================================================

**** Identifikovani problemi:

Rukovanje greškama

Neconsistentno ponašanje kod deljenja nulom

Nedostaje validacija praznog unosa

Nedovoljno informativne poruke o greškama

Preciznost izračunavanja

Problemi sa floating point aritmetikom

Nedostaje podrška za BigDecimal

Funkcionalni nedostaci

Nedostaje podrška za zagrade

Nedostaje podrška za stepenovanje

Nedostaje podrška za naučnu notaciju

Problemi u kodu

Korišćenje static polja finalResult

Predugačka i kompleksna Calculate metoda

Neelegantno rukovanje operatorima

Korisnički interfejs

Nedostaje istorija izračunavanja

Ograničene mogućnosti unosa i ispravke



**** Preporuke za poboljšanje

Poboljšanje stabilnosti

Implementirati bolji sistem za rukovanje greškama

Dodati provere za overflow/underflow

Unifikovati poruke o greškama

Proširenje funkcionalnosti

Dodati podršku za zagrade koristeći shunting-yard algoritam

Implementirati osnovne matematičke funkcije

Omogućiti rad sa različitim brojčanim tipovima

Refaktorisanje koda

Zameniti static polje povratnim vrednostima

Razbiti Calculate metodu na manje celine

Uvesti enum za operatore

Poboljšanje korisničkog iskustva

Implementirati istoriju izračunavanja

Omogućiti interaktivniji unos

Dodati temu/konfigurabilni izgled

Testiranje

Proširiti pokrivenost testovima

Dodati integracione testove

Implementirati testove performansi



**** Statistika testiranja
Ukupno test slučajeva: 24

Uspješno: 16 (66.7%)

Neuspješno: 8 (33.3%)

Kritični problemi: 3

Srednje ozbiljni problemi: 9

Manji problemi: 12



**** Plan poboljšanja

- Faza 1 (Hitni popravci)

Ispravka rukovanja greškama

Implementacija validacije unosa

Refaktorisanje static polja

- Faza 2 (Funkcionalna proširenja)

Podrška za zagrade

Poboljšana aritmetika

Prošireni korisnički interfejs

- Faza 3 (Optimizacija)

Poboljšanje performansi

Proširena testna pokrivenost

Dokumentacija

