# 1 Aussagenlogik
nur beschreibend, noch nicht wirklich met.
### Def.1 :
Eine Aussage ist eine Zeichenkette, der ein Wahrheitswert (Wahr oder Falsch) zugeordnet werden kann.
BSP: $1+1 = 5$ ist eine Ausssge (f)
$1>x$ ist ohne weitere informationen über x keine aussage.
3 ist teiler von 9 ist eine Aussage (w)
die Aussage "jede gerade zahl die größer als 2 ist, ist summe zweier Primzahlen" ist eine Aussage, aber b wahr oder Falsch ist noch nicht bekannt. (Goldbach vermutung)
## Symbolik für rechnen mit Aussagen:
Für Aussagen A und B sei: $\neg A$ ("Nicht A", "A gilt Nicht") sei genau dann wahr wenn A falsch ist. Beispiel: Mit A = '1+2=5' ist $\neg A = "1+2 \neq 5"$ eine wahre Aussage. $A \wedge B$ ist genau dann wahr wenn A und B wahr sind. 
Bsp: "1+2 = 5" $\wedge$ "3 ist teiler von 9" ist eine falsche aussage, da eine der beiden Aussagen falsch ist. "$A\land B$" stellt die Aussage A oder B dar. A oder B sei genau dann wahr, wenn A oder B oder beide wahr sind. Bsp: A = "$1+2 \neq 5$" B = "3 ist Teiler von 9" $A \land B$ ist hier eine Wahre Aussage Aussagen logik ist von Chirsippos von Soloi (281-208 v. Chr.) 

## Wahrheitstafeln:
A $\neg A$
f   w
w  f

A B | $A \wedge B$ | $A \lor B$|
f  f  | f       |    f
f w | f       |    w
w f | f       |    w
w w | w     |    w

"A $\implies$ B = $A \wedge B \lor B$"  nur Dann falsch wenn A wahr und B falsch

unter allen Bedeutungen, die wenn dann in der Umgangssprache ist die gmeint, die als "Insbesondere wenn A gilt, dann gilt B" geschrieben werden kann gemeint. hier ist 'A $\implies$ B ' genau dann falsch, wenn A wahr und B falsch ist.
Bsp 'Falls Anne jetzt in Aachen ist, dannn besucht sie Bert.' diese Aussage ist nur dann falsch, wenn anne in aachen ist, aber bert nicht besucht. hier ist wichtig anzumerken, dass diese Aussage nicht symmetrisch ist. Ein inhaltlicher bezug muss hier nicht notwendigerweise vorhanden sein. "1+ 1= 3 $\implies$ "Paris liegt in England"" Diese Aussage ist Wahr. "Es Regnet $\implies$ die straße ist nass" 

seien A und B zwei aussagen. 
A B $\neg A$  $\neg B$ $\neg B \implies A$ $\neg A \implies B$ $\land A \lor B$
f f   w  w w w w
f w  w  f f w w
w f  f  w w f f
w w f  f w w w


also ist $\neg B \implies \neg A$ gleichbedeutend zu $A \implies B$ und zu $\neg A \land B$ diese formeln sind nicht äquivalent zu $B \implies A$

$A \iff B$
hat die folgende Wahrheitstabelle
ww w
wf f
fw f
ff w

Beispiel für logische Schlussformen:
$A \lor \neg A$ ist wahr $A \implies A$ sind Wahr
Genau so beweist man mit Wahrheitstafeln: $(a \land (A \implies B)) \implies B$
$\neg B \land (A \implies B) \implies \neg A$ $(A \implies B) \land (B \implies C) \implies ()A \implies C)$ Diese Schlussformen lassen sich mithilfe von Wahrheitstafeln überprüfen 

Beispiel: für einen mathematischen beweis:
Es gibt unendlich viele Primzahlen verwendet wird: $A \implies \neg A \implies \neg A$ Angenommen es gibt nur endlich viele Primzahlen euklid 320 v chr 9. Buch der Elemente Es gibt mindestens eine Primzahl. z.B. 2 Angenommen, es gäbe "nur endlich viele Primzahlen" (A) Dann hat $q = p_1 \cdot p_2 \cdot p_3 \cdot ... \cdot p_n +1$ diese Zahl ist nicht durch irgendeine dieser Primzahlen Teilbar, da dieses Teilen Rest 1 liefert, und 1 keine Primzahl ist. Also hat q keinen kleineren Primteiler, also ist also selber 