package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmeraldSkytalon_72248 : Card() {
    override val id = 72248
    override val name = "翡翠天爪枭"
    override val description = "<b>突袭</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "这些勇猛的天爪枭曾在翡翠巨龙圣地宣誓保卫伊瑟拉，被翡翠梦境的力量所触及，呈现出了晶莹剔透的外观。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b9318f75b211eb1cc9a39333b009ab1f68435aef8f1acd29cbf8374aa6fb75d8.png"
}
