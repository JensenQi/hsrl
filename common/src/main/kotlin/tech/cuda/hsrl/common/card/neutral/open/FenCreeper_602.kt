package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FenCreeper_602 : Card() {
    override val id = 602
    override val name = "沼泽爬行者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "它以前被称作沼泽兽，但这个名字会让人迷惑，因为它根本不是野兽。"
    override val artist = "Monica Langlois"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c15d7865aedce0d0e3a86130db1a2ec7e073a324454be25b0e0a09ba1f504d25.png"
}
