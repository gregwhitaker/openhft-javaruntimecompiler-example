package com.github.gregwhitaker.openhft.example;

import net.openhft.compiler.CompilerUtils;
import org.apache.commons.io.IOUtils;

/**
 *
 */
public class Main {

    public static void main(String... args) throws Exception {
        if (args.length <= 0) {
            throw new IllegalArgumentException("Missing argument: Please specify which class to run (Example1, Example2).");
        }

        String className =null;
        String javaCode = null;

        // Loading the text of the class to a string
        if (args[0].equalsIgnoreCase("Example1")) {
            className = "openhft.example.Example1";
            javaCode = IOUtils.toString(Main.class.getClassLoader().getResourceAsStream("Example1.java"));
        } else if (args[0].equalsIgnoreCase("Example2")) {
            className = "openhft.example.Example2";
            javaCode = IOUtils.toString(Main.class.getClassLoader().getResourceAsStream("Example2.java"));
        } else {

            throw new IllegalArgumentException("Invalid argument: Please specify which class to run (Example1, Example2).");
        }

        Class aClass = CompilerUtils.CACHED_COMPILER.loadFromJava(className, javaCode);
        Runnable runner = (Runnable) aClass.newInstance();
        runner.run();
    }
}
