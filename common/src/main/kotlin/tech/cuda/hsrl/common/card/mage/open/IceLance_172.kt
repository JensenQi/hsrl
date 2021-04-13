package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceLance_172 : Card() {
    override val id = 172
    override val name = "冰枪术"
    override val description = "<b>冻结</b>一个角色，如果该角色已被<b>冻结</b>，则改为对其造成 4点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy4
    override val background = "这个把戏的重点是别把冰枪弄断。否则，“冰渣术”可就没这么厉害了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cfd0f91e3853681da6a39bbddcf6ffab4d711fbd9cad74d82effa3ec36526119.png"
}
