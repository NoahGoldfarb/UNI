Zu zwei Elementen a, b $\in M$ ist das ungeordnete Paar {a, b} = {b, a} eine Menge 
Def 7: (1921) Kuratowski Das geordnete Paar von zwei elementen a, b sei (a, b) = $\{\{a\}, \{a, b\}\}$ 

Lemma 8: sei M eine Menge a, b, c, d $\in M$ Dann ist (a, b) $= (c, d) \iff a = c \land b = d$

Für die Ungeordneten Paare stimmt das nicht: $\{1, 2\} = \{2, 1\}$
Bew: "$\Leftarrow$" falls a = c und b = d, so folgt (a, b) = (c, d)
"$\leftarrow $" Durch Fallunterscheidung: sei also {{a}, {a, b}} = {{c},{c, d}}
Das bedeutet ({a} = {c} $\land$ $\{a, b\} = \{c, d\}$) $\lor \{a\} = \{c, d\} \land \{a, b\} = {c}$

1.: Angenommen, die Aussage der ersten Klammer ist wahr dann Dann gilt nach a1: 
$a = c$ Die zweite Gleichung wird also zu {a, b} = {a, d} also $b = d$

2.: Angenommen, die aussage in der 2. Klammer ist wahr. Dann ist a = c = d und a = b = c $\square$

Axiom 6: Unendlichkeitsaxiom: Es gibt eine Unendlich $N_0$ mit $\emptyset$, sodass zu jedem $a \in N_0$ auch für den Nachfolger $a \cup \{a\}$ Eine solche Menge heißt induktiv. 

Def 9: Eine natührliche Zahl sei eine Mengedie in jeder duktiven Menge enthalten ist
Wir schreiben a+1 für den Nachfolger von a $0 = \emptyset $ 1 = 0+1 = $\{\emptyset \}$ 2 = 1+1 = $\{{\emptyset}, \{\emptyset \}\}$ 
$3 = 2+1 = \{{\emptyset}, \{\emptyset \}, \{{\emptyset}, \{\emptyset \}\}\}$
Die Menge $\mathbb{N}_0$ aller natührlichen Zahlen 

Lemma: $\mathbb{N}_0  := \{a| \text{a ist Element jeder induktiven Menge}\}$ ist nicht leer.

Bew: Nach dem Unendlichkeitsaxiom ex.mind. eine Induktive Menge $N_0$ Nach dem Aussanderungsaxiom ist $\mathbb{N}_0$ = $\{a \in N| \text{a ist Element jeder induktiven Menge}\}$ eine Menge. Und in jeder Induktiven Menge ist $\emptyset $ ein Element also ist $\emptyset \in \mathbb{N}_0$ $\square$

