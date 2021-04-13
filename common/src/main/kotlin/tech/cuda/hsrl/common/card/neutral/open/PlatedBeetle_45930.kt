package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlatedBeetle_45930 : Card() {
    override val id = 45930
    override val name = "硬壳甲虫"
    override val description = "<b>亡语：</b> 获得3点护甲值。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“好了，你的队伍打败了那只甲虫。”“我要把它放在头上。”“什么？”“我要把它戴在头上，像帽子一样。”"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/91eeab1db59b879568b0a7bf2e692dc33663c135d8d5bb66fee6641b462fc9e9.png"
}
