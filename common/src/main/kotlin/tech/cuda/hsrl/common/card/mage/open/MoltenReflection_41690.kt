package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoltenReflection_41690 : Card() {
    override val id = 41690
    override val name = "熔岩镜像"
    override val description = "选择一个友方随从，召唤一个该随从的复制。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Ungoro
    override val background = "加过特技后，我看起来棒极了！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/779b85970427a35ebd3e69cfe0c864f7cf8bdc7550d4003584f4a4804b8fa914.png"
}
