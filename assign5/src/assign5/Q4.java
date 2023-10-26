package assign5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="C:\\Users\\iot\\Desktop\\assignments\\StudentList.txt";
		try(Stream<String> lines=Files.lines(Path.of(filename)))
		{
			long studentCount=lines
					.map(String::trim)
					.filter(line->!line.isEmpty())
					.peek(System.out::println)
					.count();
			System.out.println("Total number of Students:"+studentCount);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
