package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlagueOfDeath_54431 : Card() {
    override val id = 54431
    override val name = "死亡之灾祸"
    override val description = "<b>沉默</b>并消灭所有随从。"
    override var cost: Int? = 9
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "没有动物在此法施放过程中受到伤害。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/11b31484bcbfc668058703d7a2a50ef14b7b1ed33d97de0966c54ac67a3b39f8.png"
}
