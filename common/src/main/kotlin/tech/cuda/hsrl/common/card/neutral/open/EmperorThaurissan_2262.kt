package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmperorThaurissan_2262 : Card() {
    override val id = 2262
    override val name = "索瑞森大帝"
    override val description = "在你的回合结束时，你所有手牌的法力值消耗减少（1）点。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "把一个邪恶的炎魔之王召唤到这个世界上，然后看着这个家伙奴役了他所有的子民并非是他最为后悔的事情。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4936e2209c2cf232afd318908c997e2ff8dac8ec364ac0080d9863854ba7f96e.png"
}
