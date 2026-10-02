Axiom 7 (Potenzmengenaxiom) Zu jeder Menge M existiert die Menge aller Teilmengen von M $\mathcal{P}(N)$ die Potenzmenge 

beispiel: M = $\{0, 1, 2\}$ dann ist $\mathcal{P}(M) = \{\emptyset, \{1\}, \{2\}, \{0, 1\}, \{0,2\}, \{1, 2\}, \{0, 1, 2\}\}$ 

Lemma 12: Für jede endliche Menge mit n elementen hat P(M) $2^n$ viele Elemente
Bew: Mit vollständiger Induktion Induktionsanfang: M = $\emptyset$, dann ist P(M) = $\{\emptyset \}$ ein- elementig induktionsschritt:
Angenommen, die Behauptung stimmt für ein festes gegebenes n. für alle mengen mit n vielen Elementen Sei M = $\{a_1, a_2, ..., a_{n+1}\}$ eine Menge mit (n+1) vielen Elementen.
$\mathcal{P}(M) = \{N \in \mathcal{P}(N)| N \subseteq M | a_{n+1} \in N\} \cup \{N\in \mathcal{P}(N)| N \subseteq M, a_{n+1}\notin M\}$
Diese Mengen sind beide gleich groß und die zweite dieser beiden Mengen ist die $\mathcal{P}(\{a_1, ..., a_n\})$, hat also $2^n$- viele Elemente nach ind. vor Also hat $\mathcal{P}(M)$ $2^n+2^n = 2^{n+1}$-viele Elemente $\square$

Beispiel: Man kann $P(N)$ auf $[0,2] \subseteq \mathbb{R}$ abbilden: 
zu A = $\{n_1, n_2, ...\}\in \mathcal{P}(\mathbb{N}_0)$ sei x=$2^{-n_1}+2^{-n_2}+... \in [0, 2]$ Dies sind die Reellen Zahlen in Binär darstellung. und es ist $1,111...  = 2.$ (bzgl, basis 2) Allerdings kommen ein paar zahlen hier wird die Menge $\mathbb{N}_0$ also auf die zahl 2 abbgebildet.

Es gibt also mindestens so viele Reele Zahlen in $\mathcal{P(N)}$ wie in [0, 2] Über  abbildungen wie $x \to \frac{x-}{x(x(2-x))}$ läßt sich das offene Intervall $(0, 2)$ eins- zu - eins auf ganz $\mathbb{R}$ abbilden.  In diesem Sinne hat [0, 2] also genau so viele Elemente wie $\mathbb{R}$

Lemma 13 (Kuratowski) Das kartesische Produkt zweier Mengen M;N $M \times N := \{(a, b)| a\in M, b\in N\}$

Bew.: Es gilt $a, \{a, b\}\subseteq M \cup N$, also $\{a\}, \{a, b\} \subseteq P(M\cup N)$ und $(a, b) = \{\{a\}, \{a, b\}\} \subseteq \mathcal{P}(M \cup N)$ und somit $(a, b) \in \mathcal{P}(P(M\cup N))$ Nach dem Aussanderungsaxiom ist 
$M \times N = \subseteq \{x \in \mathcal{p}(\mathcal{P}(M\cup N))| \text{es gibt} a\in M, b\in M mit (a, b)=x\}$ eine Menge
Mit vollst. Induktion lassen sich damit auch Produkte $M_1 \times ... \times M_n = ()()()$ von n mengen, deren Elem. geordnete n- Tupel $a_1, ..., a_n$ sind. Analog konstruiert man Vereinigunen $M_1 \cup ... \cup M_n, \text{Durchschnitte} $M_1, \cap ..., \M_n$ usw. 

Axiom8: (Auswahlaxiom) Sei M eine Menge von nicht-leeren Mengen Sodass 
$A\cap  B = \emptyset$ für alle $A, B \in M$ Dann Existiert eine Menge N, so dass $A \cap N$ genau ein element hat. 

