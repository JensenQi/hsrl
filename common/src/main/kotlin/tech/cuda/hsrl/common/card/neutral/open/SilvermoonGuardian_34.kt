package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilvermoonGuardian_34 : Card() {
    override val id = 34
    override val name = "银月城卫兵"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "当他们首次试图在天灾军团的围攻下守住银月城时，事情进行得并不顺利..."
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d4c7c99ae290bd3b745b455350964fdffae71a11fc41f1b81755c92f5197c2bf.png"
}
