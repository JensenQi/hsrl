package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkshireCouncilman_38452 : Card() {
    override val id = 38452
    override val name = "夜色镇议员"
    override val description = "在你召唤一个随从后，获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Wotog
    override val background = "夜色镇的居民选他做议员的其中一个原因，就是他嗓门大。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/924033521903933bbe41eb0442f649d7e2f949ab6d906494d17177a411e3728d.png"
}
