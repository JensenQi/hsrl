package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Scorch_50122 : Card() {
    override val id = 50122
    override val name = "灼烧"
    override val description = "对一个随从造成 4点伤害。如果你在上个回合使用过元素牌，则法力值消耗变为（1）点。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "你就像那冬天里的一把火。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c369653208ab581aa17a5c2308036f67cb6485ebc95dc124685a140935886851.png"
}
