package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gnash_42748 : Card() {
    override val id = 42748
    override val name = "铁齿铜牙"
    override val description = "使你的英雄获得3点护甲值，并在本回合中获得 +3攻击力。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "他常在餐后用利爪帮自己剔牙。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/63b73bd7d082a9bbf8ad1f2e007f1039c46173b4138d1a656d6b8065e805cceb.png"
}
