package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Flamestrike_69502 : Card() {
    override val id = 69502
    override val name = "烈焰风暴"
    override val description = "对所有敌方随从造成 5点伤害。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "当地板着火的时候，无论你在地上怎么打滚，都是没用的。"
    override val artist = "Romain De Santi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/746493af0a6eaf76e2ece8b9071683a83d298b55f420e5bb6927025444ec4615.png"
}
