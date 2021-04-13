package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnubisathDefender_53615 : Card() {
    override val id = 53615
    override val name = "阿努比萨斯防御者"
    override val description = "<b>嘲讽</b> 在本回合中，如果你施放过法力值消耗大于或等于（5）的法术，则这张牌的法力值消耗为（0）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "听到开罐头的声音时，他也会激动地跑起来。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f719ccc8d972f217fd09d263cf73c744e8fadcfda5aed2e4e478594accd20d39.png"
}
