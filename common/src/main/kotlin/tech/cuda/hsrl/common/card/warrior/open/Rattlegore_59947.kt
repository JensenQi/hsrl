package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rattlegore_59947 : Card() {
    override val id = 59947
    override val name = "血骨傀儡"
    override val description = "<b>亡语：</b>再次召唤该随从并获得-1/-1。"
    override var cost: Int? = 9
    override var health: Int? = 9
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "他现在是丑，但他当年20/20的时候，也是鲜肉一块。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7768b3b535d7335f8d22d9bea9b56291be1913529449c59a73eea08ceed5b104.png"
}
