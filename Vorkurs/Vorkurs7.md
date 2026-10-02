Wir haben $\mathbb{N}_0$ so konstruiert, dass Folgendes gilt: 
lemma 11 (Vollständige Induktion, 1654 Blaise Pascal):
Wenn für eine Teilmenge $m \in \mathbb{N}_0$ gilt
1.$0\in M$ (Induktionsanfang)
2.Falls $n\in \mathbb{N}_0$ element von M ist, (Induktionsannahme), dann ist auch der Nachfolger (n+1) $\in M$ (Induktionsschritt), 
so folgt $M = \mathbb{N}_0$

Bew: Mit diesen beiden Eigenschaften ist M eine induktive Menge. Da $\mathbb{N}_0$ Teilmenge jeder induktiven Menge ist, gilt $\mathbb{N}_0 \subseteq  M$ mit $M \subseteq \mathbb{N}_0$ folgt $M = \mathbb{N}_0$

Beisp: für Induktionsbeweise: Wir zeigen 0+1+2+...+n = $\frac{n(n+1)}{2}$
Sei M die Menge derjenigen Natührlichen Zahlen für die diese Formel gilt. 
Induktionsanfang: für n = 0 besagt die formel $0 = \frac{0(0+1)}{2}$
Induktionsschritt Sei $n \in M$, dann gilt für n+1 $0+1+ ... +n+ (n+1) = \frac{n(n+1)}{2} + n + 1$ (Induktionsannahme) = $\frac{(n+2)(n+1)}{2}$ also ist $n+1  \in M$ nach Induktion (Blaise Pascal 1654) ist also $M = \mathbb{N}_0$ also stimmt die Behauptung für alle Natührlichen Zahlen. $\square$

Beispiel 2 für Induktion (Türme von Hanoi) Man hat 3 Bauplätze. Auf einem steht ein Turm, der auf einen Bauplatz verlegt werden soll Dabei kann immer ein Stockwerk bewegt werden. und es darf nicht auf ein kleineres Stockwerk gestellt werden. 

***Illustration zu türme von Hanoi*** 
Anzahl Stockwerke, Schritte
1, 1
2, 2 
3, 7
4, 15

Beh: Lösen des Puzzles mit n Stockwerken benötigt $2^n-1$ Schritte 
Bew:
Induktionsanfang: Für einen Turm mit 0 Stockwerken benötien wir 0 schritte, $0 =2^0 -1$ $\checkmark$ 
Angenommen, die Behauptung stimmt für n Stockwerke für eine Feste Natürhliche zahl n.

Für (n+1) Stockwerke müssen zunächst die obersten n stockwerke auf einen anderen Platz verlegt werden.  Das kostet $2^{n-1}$ Schritte Dann Dann kann das Erdgeschoss verlegt werden. Danach werden die obersten stockwerke auf das ergeschoss verlegt. ($2^{n-1}$) Also kostete der Bau ($2^{n-1}+1+2^{n-1} = 2^{n+1}-1$) schritte.

Also stimmt die Beh. für jedes $n \in \mathbb{N}_0$