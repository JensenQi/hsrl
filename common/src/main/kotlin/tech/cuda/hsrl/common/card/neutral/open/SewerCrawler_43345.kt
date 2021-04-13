package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SewerCrawler_43345 : Card() {
    override val id = 43345
    override val name = "下水道爬行者"
    override val description = "<b>战吼：</b>召唤一个2/3的巨鼠。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他长的像老鼠，穿的像老鼠，走路也像老鼠。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5328d79f97d14457a0d3cc480494509c4807ea328c8cc37b3c8ff6bd2f7a40b5.png"
}
