package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bogbeam_56686 : Card() {
    override val id = 56686
    override val name = "沼泽射线"
    override val description = "对一个随从造成 3点伤害。如果你拥有至少七个法力水晶，则法力值消耗为（0）点。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "有人说沼泽中的神秘亮光是外星入侵者所为，也有人说那不过是沼气自燃。调查之后发现，这就是德鲁伊干的。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/37b2043d7e4239b000d2dc8646c997c2d7ac1ca638d2885acb6b2e292373fe92.png"
}
