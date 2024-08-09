package record;

public class Exemplo3 {

	public static void main(String[] args) {
		record Tipo<K, V>(K key, V value) {};
		Tipo<Integer, String> tipo = new Tipo<>(1, "John");
		System.out.println(tipo);
		System.out.println(tipo.key());
		System.out.println(tipo.value());
	}
}
