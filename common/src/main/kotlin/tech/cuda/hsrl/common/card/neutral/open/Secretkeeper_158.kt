package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Secretkeeper_158 : Card() {
    override val id = 158
    override val name = "奥秘守护者"
    override val description = "每当有一张<b>奥秘</b>牌被使用时，便获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "她永远也不会告诉你曼科里克的妻子在哪里。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b749d22dfaeee51e3e04fa144e46c1357163fa0fd36dc27b20630dfe32c518c9.png"
}
