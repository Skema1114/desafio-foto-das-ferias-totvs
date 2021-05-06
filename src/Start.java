import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> listPhotos = new ArrayList<Integer>();
		Map<Integer, Integer> keyValuePhotosMap = new LinkedHashMap();
		ArrayList<Integer> keyList = new ArrayList<Integer>();
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		ArrayList<Integer> repetitionAmountPhotos = new ArrayList<Integer>();
		ArrayList<Integer> listResultPhotos = new ArrayList<Integer>();
		int numberPhotos = 0;
		int repetitionsAllowed = 0;
		
		/**
		 *	ENTRADA DE DADOS DO TAMANHO DO ARRAY;
		 */
		try {
			System.out.print("Informe a quantidade de fotos tiradas: ");
			numberPhotos = scanner.nextInt();
			
		} catch(InputMismatchException error) {
			System.out.println("Você não informou um número válido");
		}

		System.out.println("");
		
		/**
		 * 	ENTRADA DE DADOS DOS CÓDIGOS DAS FOTOS;
		 */
		for (int i = 0; i < numberPhotos; i++) {
	    	try {
	    		System.out.print("Informe o código da " + (i + 1) + "º foto: ");
	    		listPhotos.add(scanner.nextInt());
	    		
	    	} catch(InputMismatchException error) {
	    		System.out.println("Você não informou um número válido");
	    	}
	    }

		System.out.println("");
		
		/**
		 *	ENTRADA DE DADOS DA QUANTIDADE DE REPETIÇÃO;
		 */
		try {
			System.out.print("Informe o limite de repetições: ");
			repetitionsAllowed = scanner.nextInt();
			
		} catch(InputMismatchException error) {
			System.out.println("Você não informou um número válido");
		}
		
		System.out.println("");
		
		/**
		 * 	SOMA A QUANTIDADE DE REPETIÇÕES DOS CÓDIGOS E ADICIONA ELES COMO VALOR DAS CHAVES (QUE SÃO OS PRÓPRIOS CÓDIGOS);
		 */
		listPhotos.forEach(id -> keyValuePhotosMap.compute(id, (key, value) -> (value == null ? 1 : value + 1)));
	
		/**
		 * 	COM O MAPA, ADICIONA OS VALORES DAS CHAVES E DOS VALORES PARA 2 LISTAS SEPARADAS;
		 */
		keyValuePhotosMap.forEach((key, value) -> keyList.add(key));
		keyValuePhotosMap.forEach((key, value) -> valueList.add(value));
		
		/**
		 * 	ALTERA OS VALORES DAS REPETIÇÕES PARA QUE CASO TENHA ALGUMA REPETIÇÃO ACIMA DA QUANTIDADE PERMITIDA, SEJA ALTERADO 
		 * 		PARA A PRÓPRIA QUANTIDADE PERMITIDA;
		 */
		for (Integer number : valueList) {
			if (number >= repetitionsAllowed) {
				repetitionAmountPhotos.add(repetitionsAllowed);
			} else {
				repetitionAmountPhotos.add(number);
			}
		}
		
		/**
		 * 	REPETE A QUANTIDADE DE VEZES CADA ELEMENTO, ADICIONANDO ENTÃO OS CÓDIGOS DAS FOTOS DENTRO DE UMA NOVA LISTA;
		 */
		for (int i = 0; i < repetitionAmountPhotos.size(); i++) {
			for (int j = 1; j <= repetitionAmountPhotos.get(i); j++) {
				listResultPhotos.add(keyList.get(i));
			}
		}
		
		/**
		 * 	RETORNA A LISTA JÁ ALTERADA, COM AS REPETIÇÕES CORRETAS E MANTENDO A ORDEM DE ENTRADA DOS CÓDIGOS;
		 */
		System.out.println("RETORNO: " + listResultPhotos);

	}
}
