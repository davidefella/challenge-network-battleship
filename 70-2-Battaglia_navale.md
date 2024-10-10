Scopo dell'esercizio: Implementare una versione semplificata del gioco da tavolo "Battaglia Navale" utilizzando Java da terminale. Il gioco consisterà in un giocatore contro il computer.

Regole del gioco:

    - Il campo di gioco sarà una griglia quadrata di dimensioni predefinite (ad esempio 5x5).
    - Il giocatore e il computer avranno ciascuno una sola nave di dimensione predefinita (ad esempio lunga 3 celle) da posizionare sulla griglia.
    - Le navi possono essere posizionate orizzontalmente o verticalmente, ma non diagonalmente.
    - I giocatori si alterneranno nel tentativo di colpire la nave avversaria sparando su una cella della griglia.
    - Se un colpo colpisce una nave avversaria, verrà segnalato come "colpito" (ad esempio con il simbolo 'X'), altrimenti verrà segnalato come "mancato" (ad esempio con il simbolo 'O').
    - Il gioco termina quando una delle navi viene completamente colpita.
    - Verrà visualizzato un messaggio finale che indica il vincitore del gioco.


Suggerimenti per l'implementazione:
 - Utilizzare una matrice per rappresentare la griglia di gioco.
 - Nella prima versione, usate posizioni già determinate alla creazione della matrice.
 - Implementare la logica per il turno del giocatore e del computer.
 - Visualizzare la griglia di gioco dopo ogni colpo effettuato.
 - Mantenere un conteggio dei colpi effettuati per ciascun giocatore.
 - Determinare il vincitore in base alla nave avversaria colpita per intero.
