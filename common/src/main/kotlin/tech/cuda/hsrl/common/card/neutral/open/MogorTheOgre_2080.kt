package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MogorTheOgre_2080 : Card() {
    override val id = 2080
    override val name = "食人魔勇士穆戈尔"
    override val description = "所有随从有50%几率攻击错误的敌人。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "穆戈尔曾经帮助兽人重新打开了黑暗之门。既然你让一个食人魔参与了这件事情，就别指望最后会有什么好结果了。"
    override val artist = "Michal Ivan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1fd68679734c6d351afa87ff4322144e6765d840f7663741eb5606acdafa3665.png"
}
