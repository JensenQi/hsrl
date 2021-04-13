package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Pounce_69689 : Card() {
    override val id = 69689
    override val name = "飞扑"
    override val description = "在本回合中，使你的英雄获得+2攻击力。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "喵的一声就扑到了最近的盒子里。"
    override val artist = "Rudy Siswanto"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c32c3bb340a6a87f2a983d5e2e19c670f34d2d525373b0f7262832cedf1ff8e.png"
}
