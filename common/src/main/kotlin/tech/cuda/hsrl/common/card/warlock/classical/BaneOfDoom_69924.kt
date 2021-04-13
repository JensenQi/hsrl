package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BaneOfDoom_69924 : Card() {
    override val id = 69924
    override val name = "末日灾祸"
    override val description = "对一个角色造成 2点伤害。如果“末日灾祸”消灭该角色，随机召唤一个恶魔。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "福无双至，祸不单行。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa0c6acf8346bd6f164621920248810f594222377a61ea8c9325b44287fd5405.png"
}
