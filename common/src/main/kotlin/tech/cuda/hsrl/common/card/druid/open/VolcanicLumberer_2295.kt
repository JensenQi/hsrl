package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VolcanicLumberer_2295 : Card() {
    override val id = 2295
    override val name = "火山邪木"
    override val description = "<b>嘲讽</b> 在本回合中每有一个随从死亡，该牌的法力值消耗就减少（1）点。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Brm
    override val background = "树根，树根，树根着火了！"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca19402022b81eb3fc26e75e09f215bdcde13f5dfbb3a95c11306cd315682829.png"
}
