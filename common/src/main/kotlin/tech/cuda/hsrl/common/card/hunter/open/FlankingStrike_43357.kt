package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlankingStrike_43357 : Card() {
    override val id = 43357
    override val name = "侧翼打击"
    override val description = "对一个随从造成 3点伤害。召唤一只3/3的狼。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "狼群在左，箭雨在右。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa9b1dbcf89f4f589a2325dcad1ad492e1f088bb16f22479903ecac8e1751b52.png"
}
