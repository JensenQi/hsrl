package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InfectiousSporeling_57191 : Card() {
    override val id = 57191
    override val name = "传染孢子"
    override val description = "在对随从造成伤害后，将其变为 传染孢子。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "无防护措施的活动极易造成传染，请不要模仿。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f931f36ab39650514be66e3706b62b7b2ab40839bf9f7c208c2b67f1d4b5c0af.png"
}
