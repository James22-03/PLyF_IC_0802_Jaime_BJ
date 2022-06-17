%Transiciones(A,E,B) -> Para pasar del estado A al estado B se requiere de una entrada E.
transicion(gonorte,t00,gonorte).
transicion(gonorte,t01,waitnorte).
transicion(gonorte,t10,gonorte).
transicion(gonorte,t11,waitnorte).

transicion(waitnorte,t00,goeste).
transicion(waitnorte,t01,goeste).
transicion(waitnorte,t10,goeste).
transicion(waitnorte,t11,goeste).

transicion(goeste,t00,goeste).
transicion(goeste,t01,goeste).
transicion(goeste,t10,waiteste).
transicion(goeste,t11,waiteste).

transicion(waiteste,t00,gonorte).
transicion(waiteste,t01,gonorte).
transicion(waiteste,t10,gonorte).
transicion(waiteste,t11,gonorte).

%Estado inicial
inicio(gonorte).

%Estado final
final(gonorte).

%Regla para cambiar de estado
trans(X,[A|B]) :- %Recibe como argumento un conjunto de entradas
      transicion(X,A,Y), %Estado X ---Entrada A---> Estado Y
      write(X), %Escribe el estado
      write('  '), %Escribe un espacio
      write([A|B]), %Escribe las entradas restantes
      nl, %Escribe un salto de linea
      trans(Y,B). %Llama a otra función para determinar el fin de la FSM.

trans(X,[]) :- %Mostrará el estado final de la maquina
      final(X), % Se define un estado final
      write(X), %Escribe un estado X
      write('  '), %Escribe un espacio
      write([]), %Escribe las entradas del estado
      nl. %Salto de linea

% Regla que muestra los estados y transiciones de un conjuntos de
% entradas.
entradas(E) :- inicio(S), %La regla se cumple si hay un estado de inicio y
            trans(S,E). %Hay un conjunto de entradas.



























