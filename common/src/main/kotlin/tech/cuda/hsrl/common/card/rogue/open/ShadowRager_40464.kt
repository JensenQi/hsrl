package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowRager_40464 : Card() {
    override val id = 40464
    override val name = "暗影暴怒者"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Msog
    override val background = "你看不见我！"
    override val artist = "Jon Neimeister"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/17dea4556774d748b6df42431336f0bc309e45ee2acbe519ff2e7d9b1331eb19.png"
}
