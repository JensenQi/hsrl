package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AxeFlinger_2297 : Card() {
    override val id = 2297
    override val name = "掷斧者"
    override val description = "每当该随从受到伤害，对敌方英雄造成 2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Brm
    override val background = "曾经他只是一个“掷棍者”，但随着他的技艺不断提高，他正踏上追寻梦想的道路：“掷牛头人者”。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84f7daf66477e74f945ba7be31fdaca7a498997614f19f1db019a4426bb61443.png"
}
