package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StampedingKodo_70098 : Card() {
    override val id = 70098
    override val name = "狂奔科多兽"
    override val description = "<b>战吼：</b>随机消灭一个攻击力小于或等于2的敌方随从。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "这只科多兽太大了，以至于他经常会踩到一些小动物。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1311c9a885096db99826559bcde17979d00caf35ae4c40a75751077e586a5ea3.png"
}
