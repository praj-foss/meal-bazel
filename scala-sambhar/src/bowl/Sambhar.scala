package bowl

import plate.utils.Spoon
import plate.Pulao
import org.apache.commons.lang3.StringUtils.repeat

object Sambhar {
    def main(args: Array[String]) = {
        val sp = new Spoon()
        val pul = new Pulao()

        println(">>> " + sp.scoop(pul))
        println(">>> add " + repeat("very ", 3) + "spicy sambhar")
        println(">>> done")
    }
}
