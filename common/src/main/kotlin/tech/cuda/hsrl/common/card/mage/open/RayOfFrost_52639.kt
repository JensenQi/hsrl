package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RayOfFrost_52639 : Card() {
    override val id = 52639
    override val name = "霜冻射线"
    override val description = "<b>双生法术</b> <b>冻结</b>一个随从。如果该随从已被<b>冻结</b>，则对其造成 2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "如果你失去了理智，就用这个冷静一下吧。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dbefac9b1a98f8583a9234cd186fecacba58dcef5f6b486649a5fb27938c99b1.png"
}
