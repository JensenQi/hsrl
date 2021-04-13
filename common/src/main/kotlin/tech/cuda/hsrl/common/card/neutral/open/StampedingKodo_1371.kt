package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StampedingKodo_1371 : Card() {
    override val id = 1371
    override val name = "狂奔科多兽"
    override val description = "<b>战吼：</b>随机消灭一个攻击力小于或等于2的敌方随从。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "这只科多兽太大了，以至于他经常会踩到一些小动物。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/42afce41bcb385be50cc92d66322a3449bb49a06f903f69e046cf2e9f3522b75.png"
}
