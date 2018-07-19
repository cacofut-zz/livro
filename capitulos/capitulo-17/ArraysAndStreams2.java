import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2{


	public static void main( String[] args ){
		
		String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
		System.out.printf( "Original strings: %s\n", Arrays.asList(strings));		

		System.out.printf( "Strings in uppercase: %s\n", 
		Arrays.stream(strings)
			.map(String::toUpperCase)
			.collect( Collectors.toList()));
	
		System.out.printf( "String menores que 'n' ascendentes %s\n", 
		Arrays.stream( strings )
			.filter( s -> s.compareToIgnoreCase("n") < 0 )
			.sorted( String.CASE_INSENSITIVE_ORDER )
			.collect(Collectors.toList()));

		System.out.printf( "strings menores que 'n' descendentes %s\n", 
		Arrays.stream(strings)
			.filter( s -> s.compareToIgnoreCase("n") < 0 )
			.sorted( String.CASE_INSENSITIVE_ORDER.reversed())

			.collect(Collectors.toList()));

	}
}
