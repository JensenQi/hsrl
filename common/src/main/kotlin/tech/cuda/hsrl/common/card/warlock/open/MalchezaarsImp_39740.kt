package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MalchezaarsImp_39740 : Card() {
    override val id = 39740
    override val name = "玛克扎尔的小鬼"
    override val description = "每当你弃掉一张牌时，抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Karazhan
    override val background = "玛克扎尔曾有个叫多比的手下，不过那是一个悲伤的故事了。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ce9e88d34584c21e1bd09d96e8ae86a1b8251f474ef26c23f35dee747c62f04.png"
}
