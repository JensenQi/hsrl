package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScaledNightmare_38832 : Card() {
    override val id = 38832
    override val name = "梦魇之龙"
    override val description = "在你的回合开始时，该随从的攻击力 翻倍。"
    override var cost: Int? = 6
    override var health: Int? = 8
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "你问我梦魇为什么要有鳞片，因为有鳞片很酷啊。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/de45e5671eccb255d8b737f09962585e5c8b30305900c2c65aabeebeac8caac3.png"
}
