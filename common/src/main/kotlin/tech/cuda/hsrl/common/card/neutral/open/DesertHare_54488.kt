package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DesertHare_54488 : Card() {
    override val id = 54488
    override val name = "沙漠野兔"
    override val description = "<b>战吼：</b>召唤两只1/1的沙漠野兔。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "三兔行必有我食。"
    override val artist = "Ware Li"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00dc68416f147d27980ac888e8cf2291217c2b3e417430173f60108cd5660d31.png"
}
