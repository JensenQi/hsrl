package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SunstruckHenchman_54154 : Card() {
    override val id = 54154
    override val name = "中暑的匪徒"
    override val description = "在你的回合开始时，该随从有50%的几率陷入沉睡。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "就说不要白天出来做坏事嘛……"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4380129adb6d6d859c8cd73eb20dabde411a5549c390c3e5509caee5207eb39f.png"
}
