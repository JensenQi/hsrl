package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoblinAutoBarber_1988 : Card() {
    override val id = 1988
    override val name = "地精自动理发装置"
    override val description = "<b>战吼：</b>使你的武器获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Gvg
    override val background = "这项装置能够随意调整你的发型，或是敌人的身高。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/514dad9b6207549ab9ba8dae475dc873421aa298115484eb797bfb0764525dd1.png"
}
