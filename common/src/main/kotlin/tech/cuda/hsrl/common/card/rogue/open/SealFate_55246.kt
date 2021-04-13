package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SealFate_55246 : Card() {
    override val id = 55246
    override val name = "封印命运"
    override val description = "对一个未受伤的角色造成 3点伤害。<b>祈求</b>迦拉克隆。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "命运需要密封保存，切不可露置在外。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d06ba0fbaf6269e2b958d8e7a6bebb8c58f99e42d86560be2df76930004b7c80.png"
}
