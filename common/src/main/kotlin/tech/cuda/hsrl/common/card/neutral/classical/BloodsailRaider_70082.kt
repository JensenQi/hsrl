package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodsailRaider_70082 : Card() {
    override val id = 70082
    override val name = "血帆袭击者"
    override val description = "<b>战吼：</b> 获得等同于你的武器攻击力的攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“我一个星期只出去打劫七天。”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b496d8cd8a8611a984fdbecc5fb527652b7a493ddf4f3bdf634eb13682902643.png"
}
