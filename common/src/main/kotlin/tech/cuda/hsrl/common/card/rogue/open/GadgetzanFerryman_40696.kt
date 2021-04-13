package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GadgetzanFerryman_40696 : Card() {
    override val id = 40696
    override val name = "加基森摆渡人"
    override val description = "<b>连击：</b>将一个友方随从移回你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "要是船发生了侧翻，他还能兼职做救生员。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a1d6906807f5e107fe82e1689ce64a4dcd219efc73114ed756df445654002785.png"
}
