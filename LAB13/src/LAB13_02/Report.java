package LAB13_02;

import java.util.*;
import java.io.*;

public class Report {
	public static void report(Writer out, List<Machine> machines, Robot robot) throws IOException {
		reportHead(out);
		reportMachine(out, machines);
		reportRobot(out, robot);
		reportTail(out);
	}

	private static void reportHead(Writer out) throws IOException {
		out.write("FACTORY REPORT\n");
	}

	private static void reportMachine(Writer out, List<Machine> machines) throws IOException {
		Iterator<Machine> line = machines.iterator();
		while (line.hasNext()) {
			Machine machine = (Machine) line.next();
			out.write("Machine " + machine.name());

			if (machine.bin() != null)
				out.write(" bin=" + machine.bin());

			out.write("\n");
		}
		out.write("\n");
	}

	private static void reportRobot(Writer out, Robot robot) throws IOException {
		out.write("Robot");
		if (robot.location() != null)
			out.write(" location=" + robot.location().name());

		if (robot.bin() != null)
			out.write(" bin=" + robot.bin());

		out.write("\n");
	}

	private static void reportTail(Writer out) throws IOException {
		out.write("========\n");
	}

}