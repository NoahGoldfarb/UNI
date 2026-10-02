# 3 ZFC-Mengenlehre (1930 Zermelo-Fraenkel) 
Ziel: jedes Mathematische Objekt soll als Menge geschrieben werden, Z.B. $N = \{0, 1, 2, 3 ...\} Q = \{0, 1, -1, \frac{1}{2}...\}, \pi, \sin(x)$, Geraden, Kreise, ... 

Def: Menge Georg Cantor (1874) (Naiv)  Eine Menge ist eine Zusammenfassung bestimmter wohlunterschiedener, objekte unserer Anschauung oder unseres Denkens - welche die Elemente der Menge genannt werden-  zu einem Ganzen. $a \in M$ heißt "A ist Element von M", $A \notin M$ ist die Negation davon.  die Schreibweise für eine Menge mit Elementen : $\{2, 3, \text{Katze}, \text{Hund}\}$ Dabei kommt es auf die Reihenfolge und Wiederhohlungen nicht an, da die Elementrelation entscheident ist: $\{1, 1, 2\} = \{2, 1\} = \{1, 2\}$, da dies die Menge M ist, für die $1 \in m \land 2\in m$ viele der Begriffe dieser definition sind nicht definiert
Probleme: Diese Definition ist sehr schwammig. Diese Definition ist in sich wiedersprüchlich

Russelsche Antinomie 1903:
Sei M := $\{N:\text{N Menge} | N\notin N\}$ Menge aller mengen N, die nicht element von sich selbst sind. Dann folgt: aus $M \in M$ dass $M \notin M$ Und aus $M \notin M$ folgt dass $M \in M$ Der Barbier von Sevilla rasiert alle Männer die sich nicht selber rasieren. Rasiert er sich. wenn er sich selber rasiert, gehört er nicht zu den männern die sich nicht selbst rasieren.

Ab dieser Stelle Nimmt der Vorkurs die genauigkeit einer Mathematik vorlesung an. Anstelle von cantors Def verwendet man eine axiomatische Definition. Die Axiome sind dabei als Regeln zu Verstehen, wie Zeichenketten umgevormt werden Dürfen. 
"Mengen" entsprechen Symbolen an bestimmten Stellen in diesen Zeichenketten. 

Axiom1 (Extensionalitätsaxiom): Angenommen M und N sind Mengen. Dann ist $M = N \iff \forall a: a \in M \iff a \in N$ wir kennen an dieser stelle noch keine einzige Menge. aber als anschauliches Beispiel kann man $M = \{1, 1 2\}$ und $N = \{2, 1\}$

Def. 3: Eine Menge N heißt Teilmenge von M, geschrieben $N \subseteq M$ falls $\forall: a: a \in N \implies a \in M$ Im anschaulichen Beispiel vorher ist z.B. $\{1\} \subseteq \{1, 1, 2\} , \text{da} 1 \in \{1, 1, 2\}$ 

Axiom2 (Aussanderungs Axiom): Zu jeder Menge M und jedem Prädikat A(.) gibt es eine Teilmenge $N \subseteq M $ von derjenigen Elemente von M, für die A gilt. Schreibweise: N = $\{x \in M | A(x) \}$

Als anschauliches beispiel ist mit $\{1, 2, 3, 4, 5\}$ etwa $N = \{x \in M | x \text{ ist gerade}\} = \{2, 4\} $
Bsp: $\{a \in M | \text{wahr}\} = M \subseteq M$ 

Def 4 : differenzmenge zwischen 2 Mengen M, N sei $M \setminus N = \{a \in M |a \notin N\}$

Anschauliches Beispiel: $\{1, 2, 3, 4, 5\} \setminus {-1, 0, 1} = \{2, 3, 4, 5\}$ 

Axiom 3: Existens der Leeren Menge: Es gibt eine Menge $\emptyset$ die keine elemente entält d.h. $\forall a: a \notin \emptyset$



























