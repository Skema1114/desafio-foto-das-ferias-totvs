Desafio das fotos das férias

Alice e Bob estavam de férias. Ambos tiraram muitas fotos dos lugares em que estiveram e agora querem mostrar a coleção inteira a Charlie. No entanto, Charlie não gosta dessas sessões, já que o tema geralmente se repete. Ele não gosta de ver a torre Eiffel 40 vezes. Ele disse a eles que ele só irá ver a sessão se eles mostrarem o mesmo motivo no máximo N vezes. Felizmente, Alice e Bob são capazes de codificar o tema como um número. Você pode ajudá-los a remover números de tal forma que sua lista contenha cada número apenas até N vezes, sem alterar a ordem?

Tarefa
Dada uma lista lst e um número N, crie uma nova lista que contenha cada número de l no máximo N vezes sem reordenar. Por exemplo, se N = 2, e a entrada é [1,2,3,1,2,1,2,3], você pega [1,2,3,1,2], tira o próximo [1,2 ] uma vez que isso levaria a 1 e 2 a estar no resultado 3 vezes e, em seguida, pegue o 3, o que leva a [1,2,3,1,2,3].

Exemplo
Fotos.exclui(new int[] {20,37,20,21}, 1) - Retorna [20,37,21]
Fotos.exclui(new int[] {1,1,5,5,7,8,8,8,8}, 3) - Retorna [1, 1,5, 5, 7, 8,8, 8]
