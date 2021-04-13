package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SunwellInitiate_62706 : Card() {
    override val id = 62706
    override val name = "太阳之井新兵"
    override val description = "<b>暴怒：</b>获得<b>圣盾</b>。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "我怒了！我破防了！"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/12437a3a337ed6c7f5d2684f49cf6643707e06e6e46b5bcd88d0c71744e1add4.png"
}
