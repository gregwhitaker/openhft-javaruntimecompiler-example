# openhft-javaruntimecompiler-example
[![Build Status](https://travis-ci.org/gregwhitaker/openhft-javaruntimecompiler-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/openhft-javaruntimecompiler-example)

An example of using [OpenHFT Java-Runtime-Compiler](https://github.com/OpenHFT/Java-Runtime-Compiler) to compile java classes at runtime and execute them.

## Running the Example
1. Run the application, compile `Example1.java`, and execute the newly compiled class using the following command:

        $ ./gradlew -Parg1=Example1 run
    
    You should see the following:
    
        > Task :run
        SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
        SLF4J: Defaulting to no-operation (NOP) logger implementation
        SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
        This is Example1!

2. Run the application again, but this time use `Example2`:

        $ ./gradlew -Parg1=Example2 run
        
    You should see the following:
    
        > Task :run
        SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
        SLF4J: Defaulting to no-operation (NOP) logger implementation
        SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
        This is Example2! 

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/openhft-javaruntimecompiler-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
