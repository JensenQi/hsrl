package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GenerousMummy_53438 : Card() {
    override val id = 53438
    override val name = "慷慨的木乃伊"
    override val description = "<b>复生</b> 你对手的卡牌法力值消耗减少（1）点。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "没错，她已经脱水变成了木乃伊，但她的财富并没有蒸发！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6263b77996021b5159f2d63ff4c4bbfe9a6095b8c1604b8eebd2077fe64529a4.png"
}
