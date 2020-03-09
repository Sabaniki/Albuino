package saba.albuino.listener
import org.antlr.v4.runtime.ParserRuleContext
import saba.albuino.syntax.AlbuinoParserBaseListener

class AlbuinoParserListenerImpl: AlbuinoParserBaseListener() {
    override fun enterEveryRule(ctx: ParserRuleContext?) {
        println(ctx?.text)
        println()
    }
}