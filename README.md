# Calculator Java - Analiza projekta

## Metrike
- **Ukupan LOC (Lines of Code)**: 148 linija
  - Calculator.java: 120 linija
  - Start.java: 21 linija
  - LICENSE.txt: 7 linija

## Detaljna analiza fajlova

### 1. Calculator.java (120 linija)
**Zapažanja:**
- Linije 7-17: `Operations` unutrašnja klasa dobro definiše aritmetičke operacije
- Linije 23-25: Dobra praksa - dodavanje nule za izraze koji počinju sa +/-
- Linije 30-37: Efikasno parsiranje operatora
- Linije 39-53: Dobra obrada specijalnih slučajeva (Infinity) i grešaka
- Linije 55-120: Rekurzivna `Calculate` metoda implementira prioritet operacija (*,/ imaju prednost nad +,-)

**Code Smells:**
1. **Static field mutation** (Linija 5): `finalResult` kao static field može dovesti do problema u višenitnom okruženju
2. **Long Method** (Linije 55-120): `Calculate` metoda je predugačka i složena
3. **String comparisons** (Linije 62,75): Upoređivanje stringova za operacije nije optimalno
4. **Code duplication** (Više puta se ponavlja logika za obradu operacija)

**Preporuke:**
1. Zameniti static field `finalResult` sa povratnim vrednostima iz metoda
2. Refaktorisati `Calculate` metodu u manje metode
3. Koristiti enum umesto stringova za operacije
4. Dodati više komentara za složene logičke delove
5. Implementirati bolju obradu grešaka (posebno za deljenje nulom)

### 2. Start.java (21 linija)
**Zapažanja:**
- Linije 7-19: Jednostavan i funkcionalan korisnički interfejs
- Linija 14: Dobra praksa - zatvaranje Scanner resursa
- Linija 12: Čista komunikacija sa korisnikom

**Code Smells:**
1. **Resource management**: Scanner se kreira u petlji umesto jednom

**Preporuke:**
1. Kreirati Scanner jednom izvan petlje
2. Dodati osnovnu validaciju unosa
3. Omogućiti clear komandu za brisanje ekrana

### 3. LICENSE.txt (7 linija)
- Standardna MIT licenca - sve u redu

## Generalne preporuke za projekat
1. **Testiranje**: Dodati unit testove za sve operacije
2. **Dokumentacija**: Proširiti JavaDoc komentare
3. **Proširenje funkcionalnosti**:
   - Dodati podršku za zagrade
   - Implementirati dodatne matematičke funkcije
4. **Sigurnost**: Dodati proveru za prekoračenje brojčanog opsega
5. **Performanse**: Razmotriti korišćenje `StringBuilder` za manipulacije stringovima

## Kako pokrenuti projekat
```bash
javac Start.java Calculator.java
java Start
