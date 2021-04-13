package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TreeOfLife_2001 : Card() {
    override val id = 2001
    override val name = "生命之树"
    override val description = "为所有角色恢复所有生命值。"
    override var cost: Int? = 9
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Gvg
    override val background = "这棵虽然不是摇钱树，但是却能救好多人的命。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2f78c352a3e58cc538dd5810b4d75861727319754d519ab7a7f256a5bca8d7d1.png"
}
