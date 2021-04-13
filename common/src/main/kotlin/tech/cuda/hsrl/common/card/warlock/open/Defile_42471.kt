package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Defile_42471 : Card() {
    override val id = 42471
    override val name = "亵渎"
    override val description = "对所有随从造成 1点伤害，如果有随从死亡，则再次施放该法术。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "让旅店清洁阿姨最头疼的法术之一。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/10e81c5e74651a62ea80cea8a6330e727ef43ad04a34f941254d2348e83548b1.png"
}
