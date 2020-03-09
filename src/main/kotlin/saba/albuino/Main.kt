package saba.albuino

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import saba.albuino.listener.AlbuinoParserListenerImpl
import saba.albuino.syntax.AlbuinoLexer
import saba.albuino.syntax.AlbuinoParser

fun main() {
    val input = readLine()
    val lexer = AlbuinoLexer(CharStreams.fromString(input))
    val tokens = CommonTokenStream(lexer)
    val parser = AlbuinoParser(tokens)
    val programContext = parser.program()
    val walker = ParseTreeWalker()
    val listener = AlbuinoParserListenerImpl()
    walker.walk(listener, programContext)
}

