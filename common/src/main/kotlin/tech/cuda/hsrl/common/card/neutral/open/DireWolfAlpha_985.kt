package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DireWolfAlpha_985 : Card() {
    override val id = 985
    override val name = "恐狼前锋"
    override val description = "相邻的随从获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "这支球队没有后卫。"
    override val artist = "John Dickenson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e52d2f8122f7c3ce28771a1bd4e4a49739b42b2c2b07f774e75dfdb00e5d59d4.png"
}
