package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SurvivalOfTheFittest_59450 : Card() {
    override val id = 59450
    override val name = "优胜劣汰"
    override val description = "使你手牌，牌库以及战场中的所有随从获得+4/+4。"
    override var cost: Int? = 10
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "足够聪明的物种才能存续。看到七个6/6的树人就快跑吧。"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f7858629013a817f90402cd64e90b5ac7a5ff4069d3ac52b96e722d9db18c9c5.png"
}
