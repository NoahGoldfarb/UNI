Axiom 4 (Vereinignungsaxiom:)
Zu jeder Menge M von Mengen existeirt eine Menge, die aus denjenigen Elementen besteht, die in mindesetens einer der Mengen in M enthalten sind:

$\cup_{N\in M} := \{a|\text{ es existiert ein N} \in \text{M mit a} \in N\}$
$\cup_{N\in M}$ ist die "Vereinigung von N über alle $N\in M$"

Anschauliches Beispiel: für $M = \{\{1, 2, 3\}, \{5, 7, 8\}, \{10\}\}$ $\cup_{N\in M} = \{1, 2, 3, 5, 7, 8, 10\}$
Lemma 5: Zu jeder Menge M von engen existiert iene Menge, die aus den Elementen besteht, die in jeder der Mengen in M enthalten sind. $\cap _ {N \in M} N = \{a \in \cup _{N \in M} | \text{ für alle } N \in M \text{ ist } a \in M\}$ den Durchschnitt. 

Beweis: Nach dem Vereinigungsaxiom (axiom 4) ist $\cup _{N\in M }$ eine Menge, und nach dem Aussanderungsaxiom (Axiom 2)  ist $\cap _ {N \in M} N = \{a \in \cup _{N \in M} | \text{ für alle } N \in M \text{ ist } a \in M\}$  wieder eine Menge $\square$ 

Anschauliches Beispiel zu Durchschnitt: Für $M = \{\{1, 2, 3\}, \{1, 5, 3\}, \{1, 9\}\}$ ist $\cap_{N \in M} = {1}$.

Axiom 5: Paarmengen Axiom: Zu zwei Mengen M und N ist auch $\{M, N\}$ eine Menge hierbei ist $\{M, N\}$ Eine Menge mit 2 Elementen 

Beispiel: (Erstes Echtes Beispiel) Axiom 5:
Mit dem 5. Axiom können wir zum ersten mal andere Mengen als die leere menge Konstruieren: $\{\emptyset, \emptyset\} = \{\emptyset\}$, $\{\emptyset, \{\emptyset \}\}, \{\{\emptyset \}, \{\emptyset, \{\emptyset \}\}\}$

Allerdings sind alle so konstruierten Mengen Endlich.Mit dem Vereinigungsaxiom folgt aus dem Paarmengenaxiom, dass zu Elementen $a_1, ..., a_n \in M$ eine endliche Menge $\{a_1, ..., a_n\}$ existiert.

$\cup_{N\in \{\{a_1, a_1\}, {a_2, a_3}\}} = {a_1, a_2, a_3}$ Wobei $\{a_1, a_1\}$ und $\{a_2, a_3\}$ wieder durch Paarung entstehen 

Mit dem Paarmengenaxiom existiert auch die Vereinigung $A \cup B$ zweier Mengen
A, B def. als $A \cup B = \{a | a\in A \lor a\in B\} = \cup_{N\in A, B} N$ wobei $\{A, B\}$ durch das Paarungsaxiom entsteht. und der Durchschnitt $A \cap B = \{a| a\in A \land a \in B\}$ die sprechweise hierfür ist jeweils A vereinigt B und A geschnitten B Anschauliches Beispiel: $\{1, 5\} \cup \{1, 2, 3\} = \{1, 2, 3, 5\}$ $\{1, 5\}\cap \{1, 2, 3\} = \{1\}$

Venn Diagramme:
In einem Venn Diagram werden n Mengen durch n berandende Kurven Dargestellt. In dem Diagramm muss jede der möglichkeiten für Enthalten sein / nicht enthalten sein von Elementen dieser n mengen vorkommen für 2 mengen muss es so regionen in Venn diagram für $2^2$ möglichkeiten des enthalten/nicht enthaltensein in jeder Menge vorkommen für jedes N gibt es ein solches Venn Diagramm 

***Venn Diagram für n = 2 und n = 3***

Lemma 6:(einige Eigenschaften von $\cup$ und $\cap $) für Mengen A, B , C
1.: $A \cup  A = A, A\cap A = A$ Idempotenz,
2.: $A \cup B = B\cup A$, $A \cap B = B\cap A$ Kommutativgesetz























































