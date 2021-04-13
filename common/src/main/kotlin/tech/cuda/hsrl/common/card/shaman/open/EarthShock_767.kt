package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthShock_767 : Card() {
    override val id = 767
    override val name = "大地震击"
    override val description = "<b>沉默</b>一个随从，然后对其造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "大地震击？确切地说，就是“艾泽拉斯震击”吗？"
    override val artist = "Kevin Chen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/76a6a0a96f67c70e7d22550def9aca9ceaaf6c9defb75413b385f3d125b7111b.png"
}
