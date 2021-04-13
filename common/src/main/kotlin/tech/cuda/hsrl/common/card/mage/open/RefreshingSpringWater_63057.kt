package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RefreshingSpringWater_63057 : Card() {
    override val id = 63057
    override val name = "清凉的泉水"
    override val description = "抽两张牌。每抽到一张法术牌，便复原两个法力水晶。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“法力”其实是“电解质”的别称。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d1da38dc8af6d704cc4738a80a37fb1d995ce2a0db5510007b00499331242e57.png"
}
