package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CarnivorousCube_45195 : Card() {
    override val id = 45195
    override val name = "食肉魔块"
    override val description = "<b>战吼：</b> 消灭一个友方随从。 <b>亡语：</b>召唤两个被消灭随从的复制。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他每天起床后脾气总是很差，直到走进咖啡店吃下第一个服务员为止。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/951c151c55fe7c9ae23df327be482d2e36e7ba4ebf28ff0a20c79c9cf1d62281.png"
}
