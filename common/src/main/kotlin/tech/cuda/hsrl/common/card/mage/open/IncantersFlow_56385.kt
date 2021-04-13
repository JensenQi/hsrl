package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IncantersFlow_56385 : Card() {
    override val id = 56385
    override val name = "咒术洪流"
    override val description = "使你牌库中所有法术牌的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“参加活动享受法术减价，一切尽在咒术洪流之下。”"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e671aa1f9adf3ed5878b673dbece4a3f35f64a6ffac02f9aebd84ae3fbf6705a.png"
}
