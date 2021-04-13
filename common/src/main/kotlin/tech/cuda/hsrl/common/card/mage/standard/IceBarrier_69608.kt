package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceBarrier_69608 : Card() {
    override val id = 69608
    override val name = "寒冰护体"
    override val description = "<b>奥秘：</b>当你的英雄受到攻击时，获得8点护甲值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "这只是这个技能的第一级，第二级会是...巧克力牛奶护体。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b283687f939bd758639420f11e2124d5920640e84e4545538b50e4d74e5dbca.png"
}
