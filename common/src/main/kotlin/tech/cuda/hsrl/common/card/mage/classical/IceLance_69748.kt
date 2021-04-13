package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceLance_69748 : Card() {
    override val id = 69748
    override val name = "冰枪术"
    override val description = "<b>冻结</b>一个角色，如果该角色已被<b>冻结</b>，则改为对其造成 4点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "这个把戏的重点是别把冰枪弄断。否则，“冰渣术”可就没这么厉害了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f82a243bfcae59abacbe1c26e991b010286a0dda63b68d7c2abe7b5bbaff5749.png"
}
