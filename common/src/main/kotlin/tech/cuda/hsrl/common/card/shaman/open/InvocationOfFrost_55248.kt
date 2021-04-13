package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InvocationOfFrost_55248 : Card() {
    override val id = 55248
    override val name = "霜之祈咒"
    override val description = "<b>冻结</b>一个敌人。<b>祈求</b>迦拉克隆。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "迦拉克隆喜欢加冰的口感。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5aaec8fdbbf272f15c510a78eaf8391e77b4704fa02aa033d1439242bac0d84.png"
}
