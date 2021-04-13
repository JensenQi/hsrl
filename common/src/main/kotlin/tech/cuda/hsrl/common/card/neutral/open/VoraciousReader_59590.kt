package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoraciousReader_59590 : Card() {
    override val id = 59590
    override val name = "贪婪的书虫"
    override val description = "在你的回合结束时，抽若干牌，直至手牌数量达到3张。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "但其中有多少是一目十行翻过去的呢？"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4047ee25fb8570c0d687f3facdb17abc1041e7ee4b7271148ba7bbe9406f96f3.png"
}
